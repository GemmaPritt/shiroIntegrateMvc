package com.example.project.mappers;

import com.example.project.entity.PipeAccident;
import com.example.project.entity.PipeAccidentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PipeAccidentMapper {
    int countByExample(PipeAccidentExample example);

    int deleteByExample(PipeAccidentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PipeAccident record);

    int insertSelective(PipeAccident record);

    List<PipeAccident> selectByExample(PipeAccidentExample example);

    PipeAccident selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PipeAccident record, @Param("example") PipeAccidentExample example);

    int updateByExample(@Param("record") PipeAccident record, @Param("example") PipeAccidentExample example);

    int updateByPrimaryKeySelective(PipeAccident record);

    int updateByPrimaryKey(PipeAccident record);
}