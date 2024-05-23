import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Sportsmen[] sportsmen ={
            new Trener("Asan","Asanov"),
            new Zashitnik("Uson","usenov",LocalDate.of(1990,1,23),180,80),
            new Varatar("Uson","usenov",LocalDate.of(1999,2,3),186,70),
            new Napadaiushii("Uson","usenov",LocalDate.of(1990,5,13),170,85),
    };
    for (Sportsmen sportsmen1:sportsmen){
        sportsmen1.getSportsmenAge();
    }


    }
}