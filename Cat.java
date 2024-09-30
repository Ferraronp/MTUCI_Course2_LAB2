public class Cat extends Animal {
    private int lives;

    public Cat(String animal_name, int animal_year, int lives_count) {
        super(animal_name, animal_year);
        if (lives_count > 9) {
            System.out.println("Многовато у кота жизней");
            lives_count = 9;
        }
        else if (lives_count <= 0) {
            System.out.println("Кот Шрёдингера?");
            lives_count = 1;
        }
        lives = lives_count;
    }

    public Cat(String animal_name, int animal_year) {
        super(animal_name, animal_year);
        lives = 1;
    }

    public Cat(String animal_name) {
        super(animal_name);
        lives = 1;
    }

    public Cat(int animal_year) {
        super(animal_year);
        lives = 1;
    }

    public Cat() {
        super();
        lives = 1;
    }

    @Override
    public void Voice(){
        System.out.println("Мяу");
    }

    @Override
    public void Move(){
        System.out.println("Кошка идет на мягких лапках");
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int val) {
        if (val > 9) {
            System.out.println("Многовато у кота жизней");
            lives = 9;
        }
        else if (val <= 0) {
            System.out.println("Кот Шрёдингера?");
            lives = 1;
        }
        else lives = val;
    }
}
