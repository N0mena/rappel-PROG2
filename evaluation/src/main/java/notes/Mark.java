package notes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.*;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Mark {
    private String exam;
    private float score;
    private LocalDateTime datetime;
    private String comment_change;


}
