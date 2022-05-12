package Main;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        if (dni == null) {
            this.dni = "";
            return;
        }
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo == null) {
            this.correo = "";
            return;
        }
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(correo);
        boolean correcto = false;
        correcto = matcher.matches();
        if (correcto) this.correo = correo;
        else this.correo = "";
    }

    @Override
    public String toString() {
        return "Person{" +
                "dni='" + dni + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
