public class Elephant extends Animal implements PrintsName {
    public Elephant(String name, int a, int h, int w, boolean f) {
        super(name, a, h, w, f);
    }

    @Override
    public void print() {
        System.out.println("I am an Elephant");
    }
}
