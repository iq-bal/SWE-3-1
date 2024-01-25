public class Main {
    public static void main(String[] args) {
        SingleTon Connection = SingleTon.getInstance();
        Shape c1 = Connection.getShape("CIRCLE");
//        c1.draw();
        SingleTon NewConnection = SingleTon.getInstance();
        Shape r1 = NewConnection.getShape("RECTANGLE");
        System.out.println(Connection.hashCode());
        System.out.println(NewConnection.hashCode());

//        r1.draw();
    }
}