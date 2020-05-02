package client.feign;

import mange.entity.Employee;
import mange.entity.Room;
import mange.entity.Userappoint;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@FeignClient(name="usersystem")
public interface Usersystemapifeign{

    @GetMapping(value = "/getUserList")
    public List<Employee> getUserList();
    @PostMapping(value = "/addEmployee")
    public Employee addEmployee(@RequestParam("username") String username,
                                @RequestParam("password") String password);



    @RequestMapping("/getinfo")
    public  String getinfo(@RequestParam("username") String username,@RequestParam("password") String password);

    @GetMapping(value = "/getinfobyusernameandmobile")
    public String  getinfobyusernameandmobile(@RequestParam("username") String username,@RequestParam("mobile") String mobile);

    @PutMapping(value = "/updUser/{id}")
    public Boolean updUser(@PathVariable("id") String id,
                           @RequestParam("username") String username,
                           @RequestParam("password") String password);


    @RequestMapping(value = "/reg")
    public Boolean reg(@RequestParam("data") String data);

    @GetMapping(value = "/getroomlist")
    public List<Room> getroomlist();

    @PutMapping(value = "/getroom/{id}")
    public Room getroom(@PathVariable("id") String id);



    @RequestMapping(value = "/userappoint")
    public Boolean userappoint(@RequestParam("userappointdata") String userappointdata,@RequestParam("employeeid") String employeeid);

    @RequestMapping(value = "/findByRoomidAndEmployeeid")
    public List<Userappoint> findByRoomidAndEmployeeid(@RequestParam("roomid")  String roomid, @RequestParam("employeeid") String employeeid);
}
