import java.util.Scanner;

public class Student {
   String FirstName;
   String LastName;
    String Group;
    double AverageMark;

    Student(String Fn, String Ln, String Gr) {
        FirstName = Fn;
        LastName = Ln;
        Group = Gr;
    }
    public void setAvgMark(double avgM) {

        AverageMark = avgM;
    }
    
    int getScolarship() {
        if (AverageMark == 5)
            return 100;
        else return 80;
    }
    @Override
    public  String toString() {
        return (FirstName + " " + LastName + " " + Group);
        }
    }

