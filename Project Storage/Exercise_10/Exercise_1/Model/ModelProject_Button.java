package Model;

public class ModelProject_Button {
	private double valueA;
    private double valueB;
    private double valueC;

    // Getters and Setters
    public double getValueA() {
        return valueA;
    }

    public void setValueA(double valueA) {
        this.valueA = valueA;
    }

    public double getValueB() {
        return valueB;
    }

    public void setValueB(double valueB) {
        this.valueB = valueB;
    }

    public double getValueC() {
        return valueC;
    }

    public void setValueC(double valueC) {
        this.valueC = valueC;
    }

    public String getInformationOut() {
        return valueA + ", " + valueB + ", " + valueC;
    }

    public void printValuesToConsole() {
        System.out.println(getInformationOut());
    }
}
