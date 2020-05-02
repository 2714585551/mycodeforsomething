package medicalbusiness.Contraller;


import medicalbusiness.repository.MedicalbusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentContraller {

    @Autowired
    MedicalbusinessRepository medicalbusinessRepository;


}
