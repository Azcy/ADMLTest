package com.zcy.ADML.test;

import com.zcy.ADML.domain.Person;
import com.zcy.ADML.factory.FKSqlSessionFactory;
import com.zcy.ADML.mapper.PersonMapper;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by zcy on 2017/7/22.
 */
public class OneToOneTest {
    public static void main(String[] args) {
        //获取Session实例
        SqlSession session= FKSqlSessionFactory.getSqlSession();
        //获取PersonMapper实例
        PersonMapper pm=session.getMapper(PersonMapper.class);
        Person p=pm.selectPersonById(1);
        //查看查询到的Person对象
        System.out.println(p);
        //查询看到关联Card对象
        System.out.println(p.getCard());
        //提交事务
        session.commit();
        session.close();
    }
}
