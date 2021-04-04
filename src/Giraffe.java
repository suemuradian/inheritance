public class Giraffe extends Animal implements PrintsName {


    public Giraffe(String name, int a, int h, int w, boolean f) {
        super(name, a, h, w, f);
    }


    @Override
    public void print() {
        System.out.println("I am a Giraffe");

    }


}
