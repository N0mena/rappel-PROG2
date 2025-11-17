package notes;
import lombok.*;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Exam {
    private String id;
    private String title;
    private Course course;
    private int coefficient;


}
