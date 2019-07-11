public class IPhone extends Mobile {

    public IPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call(String message) {
        System.out.println("<"+super.getName()+">Message :"+message);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
