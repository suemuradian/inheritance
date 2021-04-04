import javax.xml.namespace.QName;

public class Animal {
    protected String name;
    protected int age;
    protected int height;
    protected int weight;
    protected boolean hasFur;

    public Animal(String name, int a, int h,
                  int w, boolean f) {
        this.name = name;
        age = a;
        height = h;
        weight = w;
        hasFur = f;
    }
}

