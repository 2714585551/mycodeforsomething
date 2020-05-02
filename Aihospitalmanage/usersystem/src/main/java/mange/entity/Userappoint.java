package mange.entity;

import com.alibaba.fastjson.JSONObject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="t_userappoint")
public class Userappoint {

    @Id
    private String userappointid;
    private String roomid;
    private String employeeid;
    private String roomname;
    private String username;
    private String doctorid;
    private String doctorname;
    private String remark;

    public String getUserappointid() {
        return userappointid;
    }

    public void setUserappointid(String userappointid) {
        this.userappointid = userappointid;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(String doctorid) {
        this.doctorid = doctorid;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Userappoint(String userappointid, String roomid, String employeeid, String roomname, String username, String doctorid, String doctorname, String remark) {
        this.userappointid = userappointid;
        this.roomid = roomid;
        this.employeeid = employeeid;
        this.roomname = roomname;
        this.username = username;
        this.doctorid = doctorid;
        this.doctorname = doctorname;
        this.remark = remark;
    }

    public Userappoint(){

    }

    public Userappoint(JSONObject jsonObject) {

        this.userappointid = (String)jsonObject.get("userappointid");
        this.roomid = (String)jsonObject.get("roomid");
        this.employeeid = (String)jsonObject.get("employeeid");
        this.roomname = (String)jsonObject.get("roomname");
        this.username = (String)jsonObject.get("username");
        this.doctorid = (String)jsonObject.get("doctorid");
        this.doctorname = (String)jsonObject.get("doctorname");
        this.remark = (String)jsonObject.get("remark");
    }
}
