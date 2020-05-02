package mange.repository;

import mange.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;

public interface RoomRepository extends JpaRepository<Room,Integer> {

    @GetMapping(value = "/findByRoomid")
    Room findByRoomid(String roomid);
}
