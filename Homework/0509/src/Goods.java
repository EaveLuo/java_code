public class Goods {
    private boolean isDanger;
    private String name;

    Goods(String name){
        this.name=name;
    }

    public void setIsDanger(boolean boo){
        isDanger=boo;
    }

    public boolean isDanger(){
        return isDanger;
    }

    public String getName(){
        return name;
    }
}
