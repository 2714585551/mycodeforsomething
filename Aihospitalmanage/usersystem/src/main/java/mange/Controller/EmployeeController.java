package mange.Controller;


import com.alibaba.fastjson.JSONObject;
import mange.entity.Employee;
import mange.entity.Room;
import mange.entity.Userappoint;
import mange.repository.EmployeeRepository;
import mange.repository.RoomRepository;
import mange.repository.UserappointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController
{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private UserappointRepository userappointRepository;
    /**
     * 查
     * @return
     */
    @GetMapping(value = "/getUserList")
    public List<Employee> getUserList(){
        return employeeRepository.findAll();
    }


    @GetMapping(value = "/getroomlist")
    public List<Room> getroomlist(){
        return roomRepository.findAll();
    }

    /**
     * 增
     * @param username
     * @param password
     * @return
     */
    @PostMapping(value = "/addEmployee")
    public Employee addEmployee(@RequestParam("username") String username,
                                @RequestParam("password") String password){
        Employee  employee =  new Employee();
        employee.setUsername(username);
        employee.setPassword(password);
        return employeeRepository.save(employee);
    }


    @RequestMapping("/getinfo")
    public  String getinfo(@RequestParam("username") String username,@RequestParam("password") String password){
        Employee employee = employeeRepository.findByUsernameAndPassword(username,password);
        if(employee == null){
            return "false";
        }else{
            return employee.getEmployeeid();

        }

    }


    @RequestMapping("/getinfobyusernameandmobile")
    public String  getinfobyusernameandmobile(@RequestParam("username") String username,@RequestParam("mobile") String mobile){
        Employee employee = employeeRepository.findByUsernameAndMobile(username,mobile);
        if(employee == null){
            return "-1";
        }else{
            return employee.getEmployeeid();
        }

    }

    /**
     * 改
     * @param id
     * @param username
     * @param password
     * @return
     */
    @PutMapping(value = "/updUser/{id}")
    public Boolean updUser(@PathVariable("id") String id,
                            @RequestParam("username") String username,
                            @RequestParam("password") String password){
        Employee employee =   employeeRepository.findByEmployeeid(id);
        employee.setUsername(username);
        employee.setPassword(password);
        employeeRepository.save(employee);
        return true;

    }

    @RequestMapping(value = "/reg")
    public Boolean reg(@RequestParam("data") String data){
        JSONObject jsonobject = JSONObject.parseObject(data);
        Employee employee = new Employee(jsonobject);
        employeeRepository.save(employee);
        return true;
    }

    @PutMapping(value = "/getroom/{id}")
    public Room getroom(@PathVariable("id") String id){
        Room room = roomRepository.findByRoomid(id);
        return room;
    }


    @RequestMapping(value = "/userappoint")
    public Boolean userappoint(@RequestParam("userappointdata") String userappointdata, @RequestParam("employeeid") String employeeid){

        JSONObject userappoint= JSONObject.parseObject(userappointdata);
        Employee  employee = employeeRepository.findByEmployeeid(employeeid);
        userappoint.put("employeeid",employee.getEmployeeid());
        userappoint.put("username",employee.getUsername());
        Userappoint userappoint1 = new Userappoint(userappoint);
        userappointRepository.save(userappoint1);
        return true;
    }

    @RequestMapping(value = "/findByRoomidAndEmployeeid")
    public List<Userappoint> findByRoomidAndEmployeeid(@RequestParam("roomid")  String roomid,@RequestParam("employeeid") String employeeid){
        return userappointRepository.findByRoomidAndEmployeeid(roomid,employeeid);

    }

}
