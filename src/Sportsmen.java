import java.time.LocalDate;
import java.time.Period;

public abstract class Sportsmen {
    private String name;
    private String surname;
    private LocalDate age;
    private int rost;
    private int ves;

    public Sportsmen() {
    }

    public Sportsmen(String name, String surname, LocalDate age, int rost, int ves) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.rost = rost;
        this.ves = ves;
    }

    public Sportsmen(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public int getRost() {
        return rost;
    }

    public void setRost(int rost) {
        this.rost = rost;
    }

    public int getVes() {
        return ves;
    }


    public void setVes(int ves) {
        this.ves = ves;
    }
    public String getSportsmenAge(){
        LocalDate endDate=LocalDate.now();
        Period period =Period.between(age,endDate);
        return ""+period;
    }public void getInfo(){
        System.out.println( "name='" + name + ", surname='" + surname + ", age=" + getSportsmenAge() +
                ", rost=" + rost +
                ", ves=" + ves );
    }

    @Override
    public String toString() {
        return "Sportsmen{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", rost=" + rost +
                ", ves=" + ves +
                '}';
    }
}
