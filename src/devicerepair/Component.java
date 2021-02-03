package devicerepair;

public class Component {

    private String name;
    private double cost;

    public Component(String name, double cost) {
        
        this.name = name;
        this.cost = cost;

    }

    public String getComponent() {
        return name;
    }

    public void setComponent(String component) {
        this.name = component;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
