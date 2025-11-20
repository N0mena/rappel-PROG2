package notes;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter


public class Tutor extends User{
    private String relationship;

    Tutor(String id, String first_name, String last_name, LocalDate date_of_birth, String email, long phone_number) {
        super(id,first_name,last_name,date_of_birth,email,phone_number);
        this.relationship=relationship;
    }
}
