package com.yxm.entity;

/**
 * @ClassName: TeacherInfo
 * @Description: TODO
 * @Author: yxm
 * @Date: 2021/4/6 21:07
 * @Version: 1.0
 **/
public class TeacherInfo {
    //教师id
    private int id;
    //教师姓名
    private String name;
    //教师编号
    private String teacherNo;
    //性别
    private String sex;
    //联系电话
    private String tel;
    //学院
    private String college;
    //学院Id
    private int collegeId;

    public TeacherInfo() {
    }

    public TeacherInfo(int id, String name, String teacherNo, String sex, String tel, String college, int collegeId) {
        this.id = id;
        this.name = name;
        this.teacherNo = teacherNo;
        this.sex = sex;
        this.tel = tel;
        this.college = college;
        this.collegeId = collegeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    @Override
    public String toString() {
        return "TeacherInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacherNo='" + teacherNo + '\'' +
                ", sex='" + sex + '\'' +
                ", tel='" + tel + '\'' +
                ", college='" + college + '\'' +
                ", collegeId=" + collegeId +
                '}';
    }
}
