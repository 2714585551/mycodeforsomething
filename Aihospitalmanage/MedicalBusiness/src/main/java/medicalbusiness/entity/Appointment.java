package medicalbusiness.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name="t_appointment")
public class Appointment {
    @Id
    private  Integer  appointmentid;
    private  Integer employeeid;
    private  String  username;
    private  Date appointmentdate;
    private  Integer  doctorid;
    private  String  doctorname;
    private  String  appointmentnumber;
    private  String  appointmentproject;
    private  String  extdata;

    public Appointment(Integer appointmentid, Integer employeeid, String username, Date appointmentdate, Integer doctorid, String doctorname, String appointmentnumber, String appointmentproject, String extdata) {
        this.appointmentid = appointmentid;
        this.employeeid = employeeid;
        this.username = username;
        this.appointmentdate = appointmentdate;
        this.doctorid = doctorid;
        this.doctorname = doctorname;
        this.appointmentnumber = appointmentnumber;
        this.appointmentproject = appointmentproject;
        this.extdata = extdata;
    }


    public Appointment() {
    }

    public Integer getAppointmentid() {
        return appointmentid;
    }

    public void setAppointmentid(Integer appointmentid) {
        this.appointmentid = appointmentid;
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getAppointmentdate() {
        return appointmentdate;
    }

    public void setAppointmentdate(Date appointmentdate) {
        this.appointmentdate = appointmentdate;
    }

    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public String getAppointmentnumber() {
        return appointmentnumber;
    }

    public void setAppointmentnumber(String appointmentnumber) {
        this.appointmentnumber = appointmentnumber;
    }

    public String getAppointmentproject() {
        return appointmentproject;
    }

    public void setAppointmentproject(String appointmentproject) {
        this.appointmentproject = appointmentproject;
    }

    public String getExtdata() {
        return extdata;
    }

    public void setExtdata(String extdata) {
        this.extdata = extdata;
    }

}
