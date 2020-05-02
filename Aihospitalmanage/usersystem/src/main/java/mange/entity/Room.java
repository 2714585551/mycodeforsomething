package mange.entity;


import com.alibaba.fastjson.JSONObject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="t_room")
public class Room {
    @Id
    private  String roomid;
    private  String roomname;
    private  String remark;

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

    private String employeeid;
    private String username;


    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Room(String roomid, String roomname, String remark,String employeeid,String username) {
        this.roomid = roomid;
        this.roomname = roomname;
        this.remark = remark;
        this.employeeid = employeeid;
        this.username = username;
    }

    public Room(){

    }
    public Room(JSONObject jsonObject) {
        this.roomid = (String)jsonObject.get("roomid");
        this.roomname = (String)jsonObject.get("roomname");
        this.remark = (String)jsonObject.get("remark");
        this.employeeid = (String)jsonObject.get("employeeid");
        this.username = (String)jsonObject.get("username");
    }
}
