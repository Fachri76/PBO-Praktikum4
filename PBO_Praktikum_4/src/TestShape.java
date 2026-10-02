public class TestShape {
    public static void main(String[] args) {
        Shape a = new Shape("black", false);
        Circle b = new Circle(2.0, "blue", true);
        Rectangle c = new Rectangle(3.0, 4.0, "yellow", true);
        Square d = new Square(5.0, "green", true);
        System.out.println(a);
        System.out.println(b + " area=" + b.getArea()
                + " perimeter=" + b.getPerimeter());
        System.out.println(c + " area=" + c.getArea()
                + " perimeter=" + c.getPerimeter());
        System.out.println(d + " area=" + d.getArea()
                + " perimeter=" + d.getPerimeter());
        System.out.println();
        System.out.println("Uji menjaga bentuk Square:");
        System.out.println("awal                 : " + d);
        d.setWidth(8.0);
        System.out.println("setWidth(8.0)        : " + d);
        d.setLength(3.0);
        System.out.println("setLength(3.0)       : " + d);
        System.out.println("area akhir           : " + d.getArea());
        System.out.println("perimeter akhir      : " + d.getPerimeter());
    }
}
