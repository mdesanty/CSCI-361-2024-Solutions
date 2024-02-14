package labs.inheritance;

public class Main {
    public static void main(String[] args) {
        BinaryOperation add = new AddOperation(6, 4);
        System.out.println(add.execute());

        BinaryOperation subtract = new SubtractOperation(6, 4);
        System.out.println(subtract.execute());
    }
}
