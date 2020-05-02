package mange.repository;

import mange.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;


public interface   EmployeeRepository  extends JpaRepository<Employee,Integer> {

    @GetMapping(value = "/getUserinfo")
    Employee findByUsernameAndPassword(String userName,String password);

    @GetMapping(value = "/getusernameandmobile")
    Employee findByUsernameAndMobile(String userName,String mobile);

    @GetMapping(value = "/findbyEmployeeid")
    Employee findByEmployeeid(String Employeeid);

}
