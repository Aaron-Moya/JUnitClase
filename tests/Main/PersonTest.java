package Main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
    void setDni() {
        p.setDni("70852136T");
        assertEquals("", p.getDni());
        p.setDni(null);
        assertNotNull(p.getDni());
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
        assertEquals("", p.getCorreo());
        p.setCorreo("isma1878@hotmail.com");
        assertEquals("isma1878@hotmail.com", p.getCorreo());
        p.setCorreo("isma.com@.com@.com");
        assertEquals("", p.getCorreo());
        p.setCorreo("asdfghj");
        assertEquals("", p.getCorreo());
        p.setCorreo("a@@@@@@@@......es.com");
        assertEquals("", p.getCorreo());
        p.setCorreo("ismaelcadelcid@gmail.com");
        assertEquals("ismaelcadelcid@gmail.com", p.getCorreo());
    }

    @Test
    void testToString() {
    }
}