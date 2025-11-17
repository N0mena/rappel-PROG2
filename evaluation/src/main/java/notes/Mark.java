package notes;

import java.time.Instant;
import java.util.Comparator;
import java.util.List;

import lombok.*;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Mark {
    private Exam exam;
    private float score;
    private Instant datetime;
    private String comment_change;

    public double getExamGrade(Exam exam, Student student, Instant t) {

        List<Mark> markRecord = exam.getMarks().get(student);
        if(markRecord == null||markRecord.isEmpty())return 0;

        return markRecord.stream()
                .filter(r -> !r.getDatetime().isAfter(t))
                .max(Comparator.comparing(Mark::getDatetime))
                .map(Mark::getScore)
                .orElse((float)0);
    }

    public double getCourseGrade(Course course, Student student, Instant t) {
        double totalWeight = 0;
        double total = 0;
        for (Exam exam : course.getExams()){
            double coef = exam.getCoefficient();
            double examGrade = getExamGrade(exam, student, t);

            total += examGrade * coef;
            totalWeight += coef;
        }

        return total/totalWeight;
    }


}