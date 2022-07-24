package ldayalan.smartsprinklerapi.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ss-api")
public class HealthCheckController {

  @GetMapping(value = "health-check")
  public boolean healthCheck() {
    return true;
  }
}
