package notes;

import lombok.*;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class Student extends User{
    private Group group;
    private Tutor tutor;

}
