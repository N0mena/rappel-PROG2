package notes;
import lombok.*;

import java.time.Instant;
import java.util.List;
import java.util.Map;

@Getter
@Setter


public class Course {
    private String id;
    private String label;
    private int credit;
    private Teacher teacher;
    private Map<Exam, Double> coefficients;
    private List<Exam> exams;



}
