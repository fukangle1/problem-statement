import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter your ID");
        String id = reader.nextLine();

        System.out.println("Enter your name");
        String name = reader.nextLine();

        System.out.println("Enter the number of extra activities");
        int activitiesCount = reader.nextInt();
        reader.nextLine();
        
        Student student = new Student(id ,name, activitiesCount);
        for(int j=0 ;j <activitiesCount ;j++){
            System.out.println("Enter extra activity"+(j+1)+":");
            String activity = reader.nextLine();
            student.addExtraActivity(activity,j);
        }
        System.out.println(student);
        
    }
}
