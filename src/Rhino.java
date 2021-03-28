public class Rhino extends Animal {
    public Rhino(String name, int a, int h, int w, boolean f) {
        super(name, a, h, w, f);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("I am a Rhino");

    }
}
