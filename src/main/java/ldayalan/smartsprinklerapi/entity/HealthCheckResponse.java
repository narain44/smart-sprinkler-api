package ldayalan.smartsprinklerapi.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class HealthCheckResponse {
    private int responseStatus;
    private String responseMessage;
}
