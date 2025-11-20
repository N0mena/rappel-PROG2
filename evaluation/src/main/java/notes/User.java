package notes;

import java.time.LocalDate;
import lombok.*;

@Getter @Setter

public class User {
    private final String id;
    private final String first_name;
    private final String last_name;
    private final LocalDate birth_date;
    private final String email;
    private final long phone_number;

    public User(String id, String first_name, String last_name, LocalDate date_of_birth, String email, long phone_number) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birth_date = date_of_birth;
        this.email = email;
        this.phone_number = phone_number;

    }

}
