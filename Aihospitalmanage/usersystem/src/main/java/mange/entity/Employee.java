package mange.entity;

import com.alibaba.fastjson.JSONObject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="t_employee")
public class Employee {


    @Id
    private String employeeid;
    private String username;
    private String age;
    private String sex;
    private String idcard;
    private String mobile;
    private String position;
    private String type;
    private String address;
    private String password;
    private String remark;

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Employee(String employeeid, String username, String age, String sex, String idcard, String mobile, String position, String type, String address, String password, String remark) {
        this.employeeid = employeeid;
        this.username = username;
        this.age = age;
        this.sex = sex;
        this.idcard = idcard;
        this.mobile = mobile;
        this.position = position;
        this.type = type;
        this.address = address;
        this.password = password;
        this.remark = remark;
    }

    public Employee() {
    }

    public Employee(JSONObject jsonObject) {
        this.employeeid = (String)jsonObject.get("employeeid");
        this.username = (String)jsonObject.get("username");
        this.age = (String)jsonObject.get("age");
        this.sex = (String)jsonObject.get("sex");
        this.idcard = (String)jsonObject.get("idcard");
        this.mobile = (String)jsonObject.get("mobile");
        this.position = (String)jsonObject.get("position");
        this.type = (String)jsonObject.get("type");
        this.address = (String)jsonObject.get("address");
        this.password = (String)jsonObject.get("password");
        this.remark = (String)jsonObject.get("remark");
    }
}
