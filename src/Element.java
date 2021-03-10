public class Element {
    private String name, symbol;
    private int number;
    private double mass;
    private String family;

    public static void main(String[] args) {
        Element hydrogen = new Element("Hydrogen", "H", 1, 1.0, "Hydrogen");
        System.out.println(hydrogen.getName() + " - " + hydrogen.getSymbol() + " " + hydrogen.getNumber());
        System.out.println("Mass: " + hydrogen.getMass());
    }

    public Element(String name, String symbol, int number, double mass, String family) {
        this.name = name;
        this.symbol = symbol;
        this.number = number;
        this.mass = mass;
        this.family = family;
    }

    public double getMass() {
        return mass;
    }

    public int getNumber() {
        return number;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }
}
