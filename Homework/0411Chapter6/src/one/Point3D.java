package one;

public class Point3D extends Point2D {
    private int x;
    private int y;
    private int z;

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Point3D(int x, int y, int z) {
        super(x,y);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D(Point2D p, int z) {
        super(p.getX(),p.getY());
        this.x = p.getX();
        this.y = p.getY();
        this.z = z;
    }

    public void offset(int a,int b,int c){
        this.x = x+a;
        this.y = y+b;
        this.z = z+c;
    }

    public static void main(String[] args) {
        Point2D p2d1 = new Point2D(6,6);
        Point2D p2d2 = new Point2D(7,7);
        double PointDistance1= Math.sqrt((p2d1.getX()
                -p2d2.getX())*(p2d1.getX()-p2d2.getX())+
                (p2d1.getY()-p2d2.getY())*(p2d1.getY()-p2d2.getY()));
        System.out.println(PointDistance1);

        Point2D p3d1 = new Point3D(p2d1,6);
        Point2D p3d2 = new Point3D(7,7,7);
        Point3D p3d3 = new Point3D(p2d1,6);
        Point3D p3d4 = new Point3D(7,7,7);
        double PointDistance2= Math.sqrt((p3d1.getX()
                -p3d2.getX())*(p3d1.getX()-p3d2.getX())+
                (p3d1.getY()-p3d2.getY())*(p3d1.getY()-p3d2.getY()));
        double PointDistance3= Math.sqrt((p3d3.getX()
                -p3d4.getX())*(p3d3.getX()-p3d4.getX())+
                (p3d3.getY()-p3d4.getY())*(p3d3.getY()-p3d4.getY())
                +(p3d3.getZ()-p3d4.getZ())*(p3d3.getZ()-p3d4.getZ()));
        System.out.println(PointDistance2);
        System.out.println(PointDistance3);
    }
}
