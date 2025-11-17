package notes;
import lombok.*;

import java.util.List;
import java.util.Map;

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
    private Map<Student, List<Mark>> marks;


}
