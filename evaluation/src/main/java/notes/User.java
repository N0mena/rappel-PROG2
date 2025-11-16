package notes;

import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class User {
    private String id;
    private String first_name;
    private String last_name;
    private LocalDate birth_date;
    private String email;
    private int phone_number;
}
