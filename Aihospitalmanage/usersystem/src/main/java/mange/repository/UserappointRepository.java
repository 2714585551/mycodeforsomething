package mange.repository;

import mange.entity.Userappoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface UserappointRepository extends JpaRepository<Userappoint,Integer> {

    @GetMapping(value = "/findByRoomidAndEmployeeid")
    List<Userappoint> findByRoomidAndEmployeeid(String roomid, String employeeid);
}
