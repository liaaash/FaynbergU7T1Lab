import java.util.ArrayList;
public class CatRunner {
    public static void main(String[] args){
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat sesame = new Cat("sesame");
        Cat peanut = new Cat("peanut");
        Cat kroshka = new Cat("kroshka");
        cats.add(sesame);
        cats.add(peanut);
        cats.add(kroshka);
        System.out.println(cats);
        Cat cat4 = new Cat("marsik");
        Cat catH = cats.set(2, cat4);
        System.out.println(cats);
        System.out.println(catH);
        cat4.setName(cat4.getName() + " Meow");
        System.out.println(cat4);
        System.out.println(cats);
        for (int i = 0; i < cats.size(); i++) {
            cats.get(i).setName(cats.get(i).getName().toUpperCase());
        }
        System.out.println(cats);
        cats.add(new Cat("murka"));
        System.out.println(cats);

    }
}
