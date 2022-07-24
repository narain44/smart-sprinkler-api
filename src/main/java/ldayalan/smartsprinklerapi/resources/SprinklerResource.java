package ldayalan.smartsprinklerapi.resources;

import ldayalan.smartsprinklerapi.entity.Device;
import ldayalan.smartsprinklerapi.entity.Schedule;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="ss-api")
public class SprinklerResource {

    @PostMapping
    public Schedule getSchedule(@RequestBody Device device){
        return new Schedule(23,"wk1 calendar","wk2 calendar","wk3 calendar");
    }
}
