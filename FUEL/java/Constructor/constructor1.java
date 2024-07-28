package Constructor;
class constructor1 {
    private int x;
    private int y;

    public constructor1() {
        this.x = 0;
        this.y = 0;
    }

    public constructor1(int x) {
        this.x = x;
        this.y = 0;
    }

    public constructor1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static void main(String[] args) {

        constructor1 obj1 = new constructor1();
        constructor1 obj2 = new constructor1(5);
        constructor1 obj3 = new constructor1(10, 20);

        System.out.println("obj1: x = " + obj1.getX() + ", y = " + obj1.getY());
        System.out.println("obj2: x = " + obj2.getX() + ", y = " + obj2.getY());
        System.out.println("obj3: x = " + obj3.getX() + ", y = " + obj3.getY());
    }
}
