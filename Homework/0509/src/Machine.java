public class Machine {
    public void checkBag(Goods goods) throws DangerException{
        if (goods.isDanger()) {
            DangerException dangerException = new DangerException();
            throw(dangerException);
        }
    }
}
