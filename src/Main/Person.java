package Main;

public class Person {
    protected  String dni;
    protected  String correo;

    public Person() {
        dni = "";
        correo = "";
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "dni='" + dni + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
