import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User Nong_AllNew = new User("Nong AllNew", 2010, 10, 18);
        Nong_AllNew.doSomething();
    
    Admin I_Num_Song_Cheng = new Admin();
    I_Num_Song_Cheng.setName("I Num Song Cheng");
    I_Num_Song_Cheng.setDob(1964, 1, 7);
    I_Num_Song_Cheng.doSomething();
    I_Num_Song_Cheng.doSomething(3);
    I_Num_Song_Cheng.doExtra();


    Admin Sao_Song_Sor = new Admin();
    Sao_Song_Sor.setName("Sao Song Sor");
    Sao_Song_Sor.setDob(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth());
    Sao_Song_Sor.doExtra();
    }

}
