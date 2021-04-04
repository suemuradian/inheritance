public class Rhino extends Animal implements PrintsName {
    public Rhino(String name, int a, int h, int w, boolean f) {
        super(name, a, h, w, f);
    }

    @Override
    public void print() {
        System.out.println("I am a Rhino");

    }
}
