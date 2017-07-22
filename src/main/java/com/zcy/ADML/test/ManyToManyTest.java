package com.zcy.ADML.test;

import com.zcy.ADML.domain.Order;
import com.zcy.ADML.factory.FKSqlSessionFactory;
import com.zcy.ADML.mapper.OrderMapper;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by zcy on 2017/7/22.
 */
public class ManyToManyTest {
    public static void main(String[] args) {
        SqlSession session= FKSqlSessionFactory.getSqlSession();

        OrderMapper om=session.getMapper(OrderMapper.class);

        Order order=om.selectById(1);

        System.out.println(order);

        System.out.println(order.getUser());

        //查看关联的Article
        order.getArticles().forEach(article -> System.out.println(article));

        session.commit();

        session.close();
    }

}
