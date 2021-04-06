package com.yxm.entity;

/**
 * @ClassName: Teacher
 * @Description: TODO
 * @Author: yxm
 * @Date: 2021/3/11 20:45
 * @Version: 1.0
 **/
public class Teacher {
    //老师的id
    private int id;
    //老师的编号
    private String teacherNo;
    //老师的姓名
    private String name;
    //性别
    private String sex;
    //学院编号
    private int collegeId;
    //联系电话
    private String tel;

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", teacherNo='" + teacherNo + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", collegeId=" + collegeId +
                ", tel='" + tel + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo;
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

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Teacher(int id, String teacherNo, String name, String sex, int collegeId, String tel) {
        this.id = id;
        this.teacherNo = teacherNo;
        this.name = name;
        this.sex = sex;
        this.collegeId = collegeId;
        this.tel = tel;
    }
}
