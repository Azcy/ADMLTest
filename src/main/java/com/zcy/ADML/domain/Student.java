package com.zcy.ADML.domain;

import java.io.Serializable;

/**
 * Created by zcy on 2017/7/21.
 */
public class Student implements Serializable {
    private Integer id;//学生id，主键
    private String name;//姓名
    private String sex;//性别
    private String age;//年龄
    //学生和班级是多对一的关系，即一个学生只属于一个班级
    private Clazz clazz;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
