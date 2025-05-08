package Week5;

public class NameFormatter {

    private NameFormatter() {}

    public static String format(String firstName, String lastName){
        return "bla";
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        StringBuilder sb = new StringBuilder();
        if(!prefix.isEmpty()) {
            sb.append(prefix);
            sb.append(" ");

        }
    }

    public static String format(String fullName) {

    }
}
