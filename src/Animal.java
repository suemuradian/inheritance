import javax.xml.namespace.QName;

public class Animal {
    protected String name;
    protected int age;
    protected int height;
    protected int weight;
    protected boolean hasFur;

    public Animal(String name, int a, int h,
                  int w, boolean f) {
        if (name == null || name.equals("")) {
            throw new NewException();
        }
        this.name = name;
        age = a;
        height = h;
        weight = w;
        hasFur = f;
    }

    public void setAge(int age1) throws Exception {
        if (age1 < 0) {
            throw new Exception();
        }
        age = age1;

    }
}

