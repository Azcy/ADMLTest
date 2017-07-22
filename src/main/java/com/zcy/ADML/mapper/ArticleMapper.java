package com.zcy.ADML.mapper;

import java.util.List;

import com.zcy.ADML.domain.Article;
import org.apache.ibatis.annotations.Select;


public interface ArticleMapper {

	@Select("SELECT * FROM tb_article WHERE id IN (SELECT article_id FROM tb_item WHERE order_id = #{id} ) ")
	List<Article> selectByOrderId(Integer order_id);
	
}
