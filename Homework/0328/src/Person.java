public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void buy(Supermarket supermarket, String commodityName) {
        supermarket.Sale(commodityName,this.name);
    }
}
