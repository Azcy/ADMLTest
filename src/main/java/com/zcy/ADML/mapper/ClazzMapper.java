package com.zcy.ADML.mapper;


import com.zcy.ADML.domain.Clazz;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

public interface ClazzMapper {

	// 根据id查询班级信息
	@Select("SELECT * FROM TB_CLAZZ  WHERE ID = #{id}")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="code",property="code"),
		@Result(column="name",property="name"),
		@Result(column="id",property="students",
		many=@Many(
				select="com.zcy.ADML.mapper.StudentMapper.selectByClazzId",
				fetchType=FetchType.LAZY))
	})
	Clazz selectById(Integer id);

		
}
