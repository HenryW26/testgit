package syntax.generics;

public class InfoImpl<T> implements Info<T>{
    private T var;
    private T val;

    public InfoImpl(T val){
        this.setVal(val);
    }

    @Override
    public T getVal() {
        return this.val;
    }

    @Override
    public void setVal(T val) {
        this.val = val;
    }

    public static void main(String[] args) {
        InfoImpl i = new InfoImpl(new String("hi hi"));
        System.out.println(i.getVal());
    }
}
