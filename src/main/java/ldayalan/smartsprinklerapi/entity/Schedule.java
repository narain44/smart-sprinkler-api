package ldayalan.smartsprinklerapi.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
public class Schedule {
    @Id
    private int scheduleId;
    @NonNull private String week1;
    @NonNull private String week2;
    @NonNull private String week3;
//
//    public Schedule(int i, String wk1_calendar, String wk2_calendar, String wk3_calendar) {
//    }
}
