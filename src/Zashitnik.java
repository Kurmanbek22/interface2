import java.time.LocalDate;

public class Zashitnik extends Sportsmen{
    public Zashitnik() {
    }

    public Zashitnik(String name, String surname, LocalDate age, int rost, int ves) {
        super(name, surname, age, rost, ves);
    }

    public Zashitnik(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String getSportsmenAge() {
        return super.getSportsmenAge();
    }

    @Override
    public void getInfo() {
        super.getInfo();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
