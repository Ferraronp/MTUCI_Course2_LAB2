public abstract class Animal {
    private static int counter = 0;
    private String name;
    private int years;

    public Animal(String animal_name, int animal_year) {
        this();
        name = animal_name;
        years = animal_year;
    }

    public Animal(String animal_name) {
        this();
        name = animal_name;
    }

    public Animal(int animal_year) {
        this();
        years = animal_year;
    }

    public Animal() {
        System.out.print(++counter);
        System.out.println(" животных существует");
        name = "[No name]";
        years = -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String val) {
        name = val;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int val) {
        years = val;
    }

    public abstract void Voice();

    public void Move() {
        System.out.println("*Шаг*");
    }
}
