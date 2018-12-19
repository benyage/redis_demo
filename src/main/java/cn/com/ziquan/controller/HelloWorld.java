package cn.com.ziquan.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.ziquan.pojo.Course;
import cn.com.ziquan.service.CourseService;

@Controller
@RequestMapping("yanshuai")
public class HelloWorld {
	@Autowired
	private CourseService courseServiceImpl;
	
	@RequestMapping("helloWorld")
	public String helloWorld() {
		return "helloWorld";
	}
	
	@ResponseBody
	@RequestMapping("getCourse")
	public Course getCourse(@RequestParam(value="courseid")BigDecimal courseid) {
		Course course = courseServiceImpl.getCourse(courseid);
		return course;
	}
}
