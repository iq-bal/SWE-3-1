public class Main {
    public static void main(String[] args) {
        SingleTon Connection = SingleTon.getInstance();
        Shape c1 = Connection.getShape("CIRCLE");
        c1.draw();
        Shape r1 = Connection.getShape("RECTANGLE");
        r1.draw();
    }
}