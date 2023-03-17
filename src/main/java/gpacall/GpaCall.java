package gpacall;
import java.util.Scanner;
import java.util.logging.Logger;
public class GpaCall {
    private Logger lg = Logger.getLogger("GPA");

    private String name;

    private int count = 0;
    private int temp;
    private int gpa = 0;

    public GpaCall(String name) {
        this.name = name;
    }

    public void gpaCalculate(String grade) {
        switch (grade) {
            case "A" -> {
                this.temp = 1;
                this.gpa += this.temp;
            }
            case "B" -> {
                this.temp = 2;
                this.gpa += this.temp;
            }
            case "C" -> {
                this.temp = 3;
                this.gpa += this.temp;
            }
            case "D" -> {
                this.temp = 4;
                this.gpa += this.temp;
            }
            default -> lg.info("Invalid choice");
        }
    }
    public String dispGpa() {
        return this.name + " has " + this.gpa + " gpa ";
    }

    public void updateGpa() {
        Scanner sc = new Scanner(System.in);
       lg.info("do you need to update gpa(yes/no)");
        String des = sc.next();
        if (des.equals("yes")) {
            this.gpa = 0;
           lg.info("enter the student grade:");
            String grade = sc.next();
            gpaCalculate(grade);
            lg.info(dispGpa());
        }
    }
}