package cn.com.ziquan.service;

import java.math.BigDecimal;

import cn.com.ziquan.pojo.Course;

public interface CourseService {
	Course getCourse(BigDecimal courseid);
}
