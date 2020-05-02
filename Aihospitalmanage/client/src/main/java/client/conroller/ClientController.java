package client.conroller;


import client.feign.Usersystemapifeign;
import mange.entity.Employee;
import mange.entity.Room;
import mange.entity.Userappoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class ClientController {

    @Autowired
    public Usersystemapifeign usersystemapifeign;



    @RequestMapping("")
    public ModelAndView getlogin(){
        return new ModelAndView("index");
    }


    @RequestMapping("/forgetpassword")
    public ModelAndView forgetpassword(){
        return new ModelAndView("forgetpassword");
    }

    @RequestMapping("/register")
    public ModelAndView register(){
        return new ModelAndView("register");
    }

    @RequestMapping("/main")
    public ModelAndView main(HttpServletRequest  request){
        HttpSession session = request.getSession();
        String employeeid = (String)session.getAttribute("employeeid");
        if(employeeid == null ||"".equals(employeeid)){
            return new ModelAndView("index");
        }else{
            return new ModelAndView("main");
        }


    }


    @RequestMapping("/maininfo")
    public ModelAndView maininfo(){
        return new ModelAndView("maininfo");
    }

    @RequestMapping("/hospitalinfo")
    public ModelAndView hospitalinfo(){
        return new ModelAndView("hospitalinfo");
    }

    @RequestMapping("/roominfo")
    public ModelAndView roominfo(){
        return new ModelAndView("roominfo");
    }

    @RequestMapping("/expinfo")
    public ModelAndView expinfo(){
        return new ModelAndView("expinfo");
    }

    @RequestMapping("/appointment")
    public ModelAndView appointment(){
        return new ModelAndView("appointment");
    }

    @RequestMapping("/aboutme")
    public ModelAndView aboutme(){
        return new ModelAndView("aboutme");
    }

    @RequestMapping("/record")
    public ModelAndView record(){
        return new ModelAndView("record");
    }



    @RequestMapping("/bill")
    public ModelAndView bill(){
        return new ModelAndView("bill");
    }

    @RequestMapping("/contactme")
    public ModelAndView contactme(){
        return new ModelAndView("contactme");
    }

    @RequestMapping("/feigngetuserlist")
    public List<Employee> feigngetuserlist(){
        return usersystemapifeign.getUserList();
    }

    @RequestMapping("/getinfo")
    public boolean getinfo(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session){
        String  employeeid = usersystemapifeign.getinfo(username,password);

        if(!"false".equals(employeeid)){
            session.setAttribute("employeeid",employeeid);
            return true;
        }else{
            return false;
        }

    }
    @RequestMapping("/getinfobyusernameandmobile")
    public String getinfobyusernameandmobile(@RequestParam("username") String username,@RequestParam("mobile") String mobile){
        String  flag = usersystemapifeign.getinfobyusernameandmobile(username,mobile);
        return flag;
    }

    @RequestMapping(value = "/updUser/{id}")
    public Boolean updUser(@PathVariable("id") String id,
                           @RequestParam("username") String username,
                           @RequestParam("password") String password){
        Boolean  flag = usersystemapifeign.updUser(id,username,password);
        return flag;

    }

    @RequestMapping("/reg")
    public Boolean reg(@RequestParam("userdata") String userdata){
        Boolean  flag = usersystemapifeign.reg(userdata);
        return flag;

    }

    @RequestMapping("/getroomlist")
    public List<Room> getroomlist(){
        return  usersystemapifeign.getroomlist();
    }

    @RequestMapping(value = "/appointroom/{id}")
    public ModelAndView appointroom(@PathVariable("id") String id){
        ModelAndView mv =  new ModelAndView("appointroominfo");
        return mv;

    }

    @RequestMapping(value = "/appointroominfo/{id}")
    public Room appointroominfo(@PathVariable("id") String id){
        return usersystemapifeign.getroom(id);

    }



    @RequestMapping("/userappoint")
    public Boolean userappoint(HttpServletRequest  request,@RequestParam("userappointdata") String userappointdata){
        HttpSession session = request.getSession();
        String employeeid = session.getAttribute("employeeid").toString();
        Boolean  flag = usersystemapifeign.userappoint(userappointdata,employeeid);
        return flag;

    }


    @RequestMapping("/getappinfo")
    public List<Userappoint> getappinfo(HttpServletRequest  request, @RequestParam("roomid") String roomid){
        HttpSession session = request.getSession();
        String employeeid = session.getAttribute("employeeid").toString();
        return usersystemapifeign.findByRoomidAndEmployeeid(roomid,employeeid);


    }
}
