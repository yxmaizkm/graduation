package com.yxm.entity;

/**
 * @ClassName: StudentInfo
 * @Description: 学生的信息类
 * @Author: yxm
 * @Date: 2021/3/26 19:14
 * @Version: 1.0
 **/
public class StudentInfo {
    //id
    private int id;
    //学号
    private String studentNo;
    //学生姓名
    private String name;
    //学生性别
    private String sex;
    //学生联系方式
    private String tel;
    //学生专业名称
    private String major;
    //学生学院名称
    private String college;
    //学院的id
    private int majorId;
    //专业的id
    private int collegeId;

    public int getMajorId() {
        return majorId;
    }

    public void setMajorId(int majorId) {
        this.majorId = majorId;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public int getId() {
        return id;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public StudentInfo(int id, String studentNo, String name, String sex, String tel, String major, String college, int majorId, int collegeId) {
        this.id = id;
        this.studentNo = studentNo;
        this.name = name;
        this.sex = sex;
        this.tel = tel;
        this.major = major;
        this.college = college;
        this.majorId = majorId;
        this.collegeId = collegeId;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "id=" + id +
                ", studentNo='" + studentNo + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", tel='" + tel + '\'' +
                ", major='" + major + '\'' +
                ", college='" + college + '\'' +
                ", majorId=" + majorId +
                ", collegeId=" + collegeId +
                '}';
    }

    public StudentInfo() {
    }

}
