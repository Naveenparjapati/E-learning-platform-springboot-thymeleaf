package org.coderarmy.CoderArmy.controller;

import org.coderarmy.CoderArmy.dto.CourseDto;
import org.coderarmy.CoderArmy.service.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;


@Controller
@RequestMapping("/tutor")
public class TutorController {
	@Autowired
	TutorService tutorService;

	@GetMapping("/home")
	public String loadHome(HttpSession session) {
		return tutorService.loadHome(session);
	}

	@GetMapping("/courses")
	public String loadCourses(HttpSession session) {
		return tutorService.loadCourses(session);
	}

	@GetMapping("/sections")
	public String loadSections(HttpSession session) {
		return tutorService.loadSections(session);
	}

	@GetMapping("/questions")
	public String loadQuestions(HttpSession session) {
		return tutorService.loadQuestions(session);
	}

	@GetMapping("/learners")
	public String loadLearners(HttpSession session) {
		return tutorService.loadLearners(session);
	}
	
	@GetMapping("/add-course")
	public String loadAddCourse(HttpSession session, Model model, CourseDto courseDto) {
		return tutorService.addCourse(session, model, courseDto);
	}

	@PostMapping("/add-course")
	public String addCourse(@ModelAttribute @Valid CourseDto courseDto, BindingResult result, HttpSession session) {
		return tutorService.addCourse(session, courseDto, result);
	}

	@GetMapping("/view-courses")
	public String viewCourses(HttpSession session, Model model) {
		return tutorService.viewCourses(session, model);
	}
	

}
