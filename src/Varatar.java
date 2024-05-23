import java.time.LocalDate;

public class Varatar extends Sportsmen{
    public Varatar() {
    }

    public Varatar(String name, String surname, LocalDate age, int rost, int ves) {
        super(name, surname, age, rost, ves);
    }

    public Varatar(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String getSportsmenAge() {
        return super.getSportsmenAge();
    }

    @Override
    public void getInfo() {
        super.getInfo(
            System.out.println( "name='" + getName() + ", surname='" + getSurname() + ", age=" + getSportsmenAge() +
                    ", rost=" + getRost() +
                    ", ves=" + getVes()};


    @Override
    public String toString() {
        return super.toString();
    }
}
