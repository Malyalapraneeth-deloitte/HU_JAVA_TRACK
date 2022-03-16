class AreaAns {
    void square(int x) {
        System.out.println("the area of square is" + x * x);
    }

    void circle(float c) {
        double Circ = 3.14 * c * c;
        System.out.println("the area of circle is " + Circ);
    }

    void triangle(int t, int z) {
        Double Trian = 0.5 * t * z;
        System.out.println("the area of triangle is " + Trian);
    }

    void raectangle(int x, int y) {
        System.out.println("the area of Rectangle is " + x * y);
    }
}
class Area
{
    public static void main(String[] args)
    {
        AreaAns ar= new AreaAns();
        ar.triangle(24,25);
        ar.raectangle(2,3);
        ar.circle(3);
        ar.square(3);


    }



}
