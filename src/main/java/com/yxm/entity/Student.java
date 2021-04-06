package com.yxm.entity;

/**
 * @ClassName: Student
 * @Description: TODO
 * @Author: yxm
 * @Date: 2021/3/11 20:44
 * @Version: 1.0
 **/
public class Student {
    //学生的id
    private int id;
    //学生的学号
    private String studentNo;
    //学生的姓名
    private String name;
    //学生性别
    private String sex;
    //学生的专业id
    private int majorId;
    //学生的联系方式
    private String tel;
    //学生的学员id
    private int collegeId;

    public Student() {
    }

    public Student(int id, String studentNo, String name, int majorId, String tel, int collegeId) {
        this.id = id;
        this.studentNo = studentNo;
        this.name = name;
        this.majorId = majorId;
        this.tel = tel;
        this.collegeId = collegeId;
    }

    public int getId() {
        return id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMajorId() {
        return majorId;
    }

    public void setMajorId(int majorId) {
        this.majorId = majorId;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentNo='" + studentNo + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", majorId=" + majorId +
                ", tel='" + tel + '\'' +
                ", collegeId=" + collegeId +
                '}';
    }
}
