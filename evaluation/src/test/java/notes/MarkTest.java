package notes;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.Instant;
import java.util.List;

import static org.junit.Assert.*;

public class MarkTest {
    private Student Rondro;
    private Tutor tutorRondro;
    private Course course1;
    private Mark Mark1;
    private Exam finalExam;
    private Course PROG;

@BeforeEach
public void setUp() {
    Rondro = new Student("1", "Rakoto", "Rondro", "2004-12-31", "rondro@gmail.com", "0345678762", "K2", tutorRondro, );
    tutorRondro = new Tutor("1", "Rakoto","Rafe","1980-01-12","rafe@gmail.com","0327689840", );
}



}