package cn.com.ziquan.mapper;

import cn.com.ziquan.pojo.Course;
import java.math.BigDecimal;

public interface CourseMapper {
    int deleteByPrimaryKey(BigDecimal courseid);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(BigDecimal courseid);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}