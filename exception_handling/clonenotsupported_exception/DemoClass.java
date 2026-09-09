class DemoClass implements Cloneable {

    int a, b;

    void display() {
        System.out.println("a=" + a + " b=" + b);
    }

    public DemoClass clone() {

        DemoClass d1 = null;

        try {
            d1 = (DemoClass) super.clone();
        }
        catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        return d1;
    }
}