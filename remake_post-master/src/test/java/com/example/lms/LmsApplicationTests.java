package com.example.lms;

import com.example.lms.question.Question;
import com.example.lms.question.QuestionRepository;
import com.example.lms.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

@SpringBootTest
class LmsApplicationTests {
	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private QuestionService questionService;

	@Test
	void testJpa() {

	}
}
