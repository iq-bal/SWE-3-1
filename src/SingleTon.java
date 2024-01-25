public class SingleTon {
    private static final SingleTon ins=new SingleTon();
    private SingleTon(){}

    public static SingleTon getInstance(){
        return ins;
    }
    public Shape getShape(String s){
        if(s==null)
            return null;
        if(s.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if(s.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}
