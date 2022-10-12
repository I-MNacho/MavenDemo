// ii) Create a class Student which has following methods
//      i) Average: which would accept marks of 3 examinations & return whether the student has passed or failed 
//                  depending on whether he has scored an average above 50 or not?
//      ii) Input : which would accept the name of the student & returns the name?

public class Student {
    

    public static void average(int mark1, int mark2, int mark3){
        int avg = 0;
        avg = (mark1 + mark2 + mark3) / 3;
        if(avg >= 50){
            System.out.println("You have passed");
        }else if(avg <= 49){
            System.out.println("You did not pass.");
        }
    }

    public String input(String name){
        return name;
    }

    public static void main(String[] args) {
        average(30, 40, 90);
    }


}
