public class Test {
    public static void main(String[] args) {
        // 创建商品对象，并赋值
        Commodity commodity[] = new Commodity[5];
        commodity[0]=new Commodity("水果");
        commodity[1]=new Commodity("蔬菜");
        commodity[2]=new Commodity("洗衣机");
        commodity[3]=new Commodity("电冰箱");
        commodity[4]=new Commodity("电视机");
        // 创建超市对象，并赋初值
        Supermarket supermarket = new Supermarket("walmart（沃尔玛）", commodity);
        // 创建人对象，并赋初值
        Person person1 = new Person("罗毅夫");
        Person person2 = new Person("EaveLuo");
        // 人调用买方法
        person1.buy(supermarket, "电视机");
        person2.buy(supermarket, "笔记本电脑");
    }
}
