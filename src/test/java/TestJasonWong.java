import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestJasonWong {
    @Test
    public void getFullNameTest() {
        String result = new JasonWong().getFullName();
        Assertions.assertEquals("Jason Wong",result);
    }
    @Test
    public void getFirstNameTest() {
        String result = new JasonWong().getFirstName();
        Assertions.assertEquals("Jason",result);
    }
    @Test
    public void getLastNameTest() {
        String result = new JasonWong().getLastName();
        Assertions.assertEquals("Wong",result);
    }
    @Test
    public void getUCInetIDTest() {
        String result = new JasonWong().getUCInetID();
        Assertions.assertEquals("26428957",result);
    }
    @Test
    public void getStudentNumberTest() {
        int result = new JasonWong().getStudentNumber();
        Assertions.assertEquals(26428957,result);
    }
    @Test
    public void rotatePositiveTest() {
        String result = new JasonWong().getRotatedFullName(1);
        Assertions.assertEquals("ason WongJ",result);
    }
    @Test
    public void rotateNegativeTest() {
        String result = new JasonWong().getRotatedFullName(-1);
        Assertions.assertEquals("gJason Won",result);
    }
}
