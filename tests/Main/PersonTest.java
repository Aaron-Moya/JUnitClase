package Main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
    void setDni() {


    }

    @Test
    public String getCorreo() {
        return this.correo;
        //assertEquals("aaronmoyaarques@gmail.com", p.getCorreo());
    }

    @Test
    void setCorreo() {
        p.setCorreo(null);
        assertNotNull(p.getCorreo());
        //assertEquals("aaronmoyaarques@gmail.com", p.getCorreo());
    }

    @Test
    void testToString() {
    }
}