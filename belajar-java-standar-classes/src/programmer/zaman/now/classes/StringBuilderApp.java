package programmer.zaman.now.classes;

public class StringBuilderApp {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Fathin");
        builder.append(" ");
        builder.append("Musthafa");
        builder.append(" ");
        builder.append("Habiburrahman");

        String name = builder.toString();
        System.out.println(name);
    }
}
