package cn.com.ziquan.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.ziquan.mapper.CourseMapper;
import cn.com.ziquan.pojo.Course;
import cn.com.ziquan.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	private CourseMapper courseMapper;
	
	public Course getCourse(BigDecimal courseid) {
		// TODO Auto-generated method stub
		return courseMapper.selectByPrimaryKey(courseid);
	}
	
}
