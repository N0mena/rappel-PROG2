package notes;
import lombok.*;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Course {
    private String id;
    private String label;
    private int credit;
    private Teacher teacher;
}
