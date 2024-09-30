public class Main {
    public static void main(String[] args) {
        Cat pussInBoots = new Cat("Маркиз де Карабас", 5, 9);
        for (int i = 9; i >= 1; i--) {
            pussInBoots.setLives(i);
            System.out.println(pussInBoots.getLives());
        }
        pussInBoots.Voice();
        pussInBoots.Move();

        Fish fish1 = new Fish();
        fish1.Voice();
        fish1.Move();

        Parrot parrot1 = new Parrot("Кеша");
        parrot1.Voice();
        parrot1.Move();
        parrot1.setYears(2);
        System.out.println(parrot1.getYears());
    }
}
