public class Main {
    public static void main (String [] args){
        Animal animal = new Animal("Jessica", 12 , 164, 80, true);

        Cat cat = new Cat("Max",2,54,8,false);
        cat.setSphynx(true);
        cat.print();


        Giraffe giraffe = new Giraffe("Jorik",70,550, 1000,true);
        giraffe.print();


        Rhino rhino = new Rhino("Lyudvig",10,250,300, false);
        rhino.print();
        try {
            rhino.setAge(-2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Elephant elephant= new Elephant (null,3, 200,300,false);
        elephant.print();


    }


}
