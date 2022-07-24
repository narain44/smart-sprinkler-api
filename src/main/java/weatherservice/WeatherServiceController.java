package weatherservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ws-api")
public class WeatherServiceController {

  @GetMapping(value = "health-check")
  public String healthCheck() {
    return "Healthy";
  }
}
