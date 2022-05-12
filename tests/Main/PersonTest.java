package Main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
    Person p;
    protected String dni;
    protected String correo;

    @BeforeEach
    void setUp() {
        p = new Person();
        p.setDni("11111111A");
        p.setCorreo("aaronmoyaarques@gmail.com");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public String getDni() {
        return this.dni;
    }

    @Test
    void setDni(String dni) {
        Pattern REGEXP = Pattern.compile("[0-9]{8}[A-Z]");
        String DIGITO_CONTROL = "TRWAGMYFPDXBNJZSQVHLCKE";
        String[] INVALIDOS = new String[] { "00000000T", "00000001R", "99999999R" };
        boolean correcto = false;
        correcto = Arrays.binarySearch(INVALIDOS, dni) < 0
                && REGEXP.matcher(dni).matches()
                && dni.charAt(8) == DIGITO_CONTROL.charAt(Integer.parseInt(dni.substring(0, 8)) % 23);

        if (correcto) this.dni = dni;
        else this.dni = "";

    }

    @Test
    public String getCorreo() {
        return this.correo;
        //assertEquals("aaronmoyaarques@gmail.com", p.getCorreo());
    }

    @Test
    void setCorreo(String correo) {
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(correo);
        boolean correcto = false;
        correcto = matcher.matches();
        if (correcto) this.correo = correo;
        else this.correo = "";
    }

    @Test
    void testToString() {
    }
}