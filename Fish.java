public class Fish extends Animal {
    public Fish(String animal_name, int animal_year) {
        super(animal_name, animal_year);
    }

    public Fish(String animal_name) {
        super(animal_name);
    }

    public Fish(int animal_year) {
        super(animal_year);
    }

    public Fish() {
        super();
    }

    @Override
    public void Voice(){
        System.out.println("Буль");
    }

    @Override
    public void Move(){
        System.out.println("Рыбка плывет в воде");
    }
}
