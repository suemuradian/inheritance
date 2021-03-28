public class Main {
    public static void main (String [] args){
        Animal animal = new Animal("Jessica", 12 , 164, 80, true);
        animal.print();
        Cat cat = new Cat("Max",2,54,8,false);
        cat.setSphynx(true);
        cat.print();
    }


}
