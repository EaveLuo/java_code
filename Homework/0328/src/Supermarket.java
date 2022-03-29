import java.util.Objects;

public class Supermarket {
    private String name;
    private Commodity warehouse[];

    public void Sale(String commodityName, String personName) {
        boolean isContains = false;
        for (int i = 0; i < this.warehouse.length; i++) {
            if (Objects.equals(commodityName, this.warehouse[i].getName())) {
                isContains = true;
                break;
            }
        }

        if (isContains) {
            System.out.println(personName + "在" + this.name + "买到了" + commodityName);
        } else {
            System.out.println(this.name + "没有" + commodityName + "，" + personName + "白跑了一趟");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Commodity[] getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Commodity[] warehouse) {
        this.warehouse = warehouse;
    }

    public Supermarket(String name, Commodity[] warehouse) {
        this.name = name;
        this.warehouse = warehouse;
    }

}
