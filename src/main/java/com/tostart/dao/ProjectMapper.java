package com.tostart.dao;

import com.tostart.bean.Project;
import com.tostart.bean.ProjectExample;
import com.tostart.bean.ProjectKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectMapper {
    long countByExample(ProjectExample example);

    int deleteByExample(ProjectExample example);

    int deleteByPrimaryKey(ProjectKey key);

    int insert(Project record);

    int insertSelective(Project record);

    List<Project> selectByExample(ProjectExample example);

    Project selectByPrimaryKey(ProjectKey key);

    int updateByExampleSelective(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByExample(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);
}