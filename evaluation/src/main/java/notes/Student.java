package notes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.*;
@Setter @Getter

public class Student extends User{
    private final Group group;
    private final Tutor tutor;
    private final Course course;

     Student(String id, String first_name, String last_name, LocalDate date_of_birth, String email, long phone_number, Group group,Tutor tutor, Course course){
        super(id,first_name,last_name,date_of_birth,email,phone_number);
        this.group=group;
        this.course=course;
        this.tutor=tutor;
    }

}
