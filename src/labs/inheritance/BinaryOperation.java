package labs.inheritance;

public abstract class BinaryOperation {
    private int leftOperand;
    private int rightOperand;

    public BinaryOperation() {
        this(0, 0);
    }

    public BinaryOperation(int leftOperand, int rightOperand) {
        setLeftOperand(leftOperand);
        setRightOperand(rightOperand);
    }

    public int getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(int leftOperand) {
        this.leftOperand = leftOperand;
    }

    public int getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(int rightOperand) {
        this.rightOperand = rightOperand;
    }

    public abstract int execute();
}
