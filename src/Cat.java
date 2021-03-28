public class Cat extends Animal {
    private boolean isSphynx;

    public Cat( String name, int a, int h, int w, boolean f){
        super(name, a, h, w, f);
    }

    public void setSphynx(boolean sphynx) {
        isSphynx = sphynx;
    }

    @Override
    public void print() {
        super.print();
        if(isSphynx) {
            System.out.println("I am from sphynx family");
        }
        System.out.println("I am a Cat");
    }
}
