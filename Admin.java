import java.time.LocalDate;

public class Admin extends User {
    public Admin() {
        super();
    }

    public Admin(String name, LocalDate dob) {
        super(name, dob);
    }

    public Admin(String name, int year, int month, int dayOfMonth) {
        super(name, year, month, dayOfMonth);
    }

    @Override
    public void doSomething() {
        System.out.println("Welcome " + "Admin " + this.getName() + "!");
    }

    public void doSomething(int n) {

        for (int i = 0; i < n; i++) {
            System.out.println("Hello " + this.getName() + " who was born on " + this.getDob() + "!");
        }
        
    }

    public void doExtra() {
        LocalDate today = LocalDate.now();
        LocalDate dob = this.getDob();
        if (dob.getMonth() == today.getMonth() && dob.getDayOfMonth() == today.getDayOfMonth()) {
                System.out.println("Happy Birthday Admin " + this.getName() + "!");
        }
    }

}