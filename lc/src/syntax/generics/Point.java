package syntax.generics;

public class Point<T> {
    private T x;
    private T y;
    public void setX(T x){
        this.x = x;
    }
    public void setY(T y){
        this.y = y;
    }
    public T getX(){
        return this.x;
    }
    public T getY(){
        return this.y;
    }

    public static void main(String[] args) {
        Point<Integer> p = new Point<>();
        p.setX(new Integer(100));
        System.out.println(p.getX());

        Point<Float> q = new Point<>();
        q.setY(new Float(100.12F));
        System.out.println(q.getY());
    }
}
