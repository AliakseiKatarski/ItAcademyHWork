package homeworks.Task1OOP.entity.entity;



public abstract class Sweets{
    private String name;
    private int weight;
    private int sugarAmount;

    public Sweets(String name, int weight, int sugarAmount) {
        this.name = name;
        this.weight = weight;
        this.sugarAmount = sugarAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }


    public int getSugarAmount() {
        return sugarAmount;
    }

    public void setSugarAmount(int sugarAmount) {
        this.sugarAmount = sugarAmount;
    }

    @Override
    public String toString() {
        return "Sweets{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", sugarAmount=" + sugarAmount +
                '}';
    }


}
