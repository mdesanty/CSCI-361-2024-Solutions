package labs.getting_started;

public class Greeting {
    private String salutation;
    private String name;

    public Greeting(String salutation, String name) {
        this.salutation = salutation;
        this.name = name;
    }

    public void greet() {
        System.out.println(salutation + " " + name);
    }
}