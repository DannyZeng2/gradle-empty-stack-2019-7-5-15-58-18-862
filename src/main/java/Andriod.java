public class Andriod extends Mobile {

    public Andriod(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call(String message) {
        System.out.println("<"+super.getName()+">Message :"+message);
    }
}
