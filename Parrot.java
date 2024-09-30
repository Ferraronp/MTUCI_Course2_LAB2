public class Parrot extends Animal {
    public Parrot(String animal_name, int animal_year) {
        super(animal_name, animal_year);
    }

    public Parrot(String animal_name) {
        super(animal_name);
    }

    public Parrot(int animal_year) {
        super(animal_year);
    }

    public Parrot() {
        super();
    }

    @Override
    public void Voice(){
        System.out.println("Чирик");
    }

    @Override
    public void Move(){
        System.out.println("Попугай летит в небе");
    }
}
