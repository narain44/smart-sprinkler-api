package ldayalan.smartsprinklerapi.resources;

import ldayalan.smartsprinklerapi.entity.HealthCheckResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ss-api")
public class HealthCheckResource {
  @GetMapping(value = "health-check")
  public HealthCheckResponse healthCheck() {
    return new HealthCheckResponse(200,"Healthy");
  }
}
