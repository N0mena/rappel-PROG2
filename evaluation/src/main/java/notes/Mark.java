package notes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import lombok.*;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Mark {
    private List<Exam> exam;
    private float score;
    private LocalDateTime datetime;
    private String comment_change;
    private Student student;

    public double getExamGrade(Exam exam, Student student, Instant t) {
        return
    }
}