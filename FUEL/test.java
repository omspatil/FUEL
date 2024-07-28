class Test {
    int privateVariable;

    public Test(int privateVariable) {
        this.privateVariable = privateVariable;
    }
}

class AnotherClass {
    public static void main(String[] args) {

        Test obj = new Test(10);
        int value = obj.privateVariable;
        System.out.println("Private variable value: " + value);
    }
}
