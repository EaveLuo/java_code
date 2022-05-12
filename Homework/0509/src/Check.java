public class Check {
    public static void main(String[] args) {
        Machine machine = new Machine();
        Goods apple = new Goods("苹果");
        apple.setIsDanger(false);
        Goods explosive = new Goods("炸药");
        explosive.setIsDanger(true);
        try {
            machine.checkBag(explosive);
            System.out.println(explosive.getName()+"检查通过");
        } catch (DangerException e) {
            e.toShow();
            System.out.println(explosive.getName()+"被禁止!");
        }
        try {
            machine.checkBag(apple);
            System.out.println(apple.getName()+"检查通过");
        } catch (DangerException e) {
            e.toShow();
            System.out.println(apple.getName()+"被禁止!");
        }
    }
}
