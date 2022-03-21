import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class StudentQueue {
        Scanner scanner = new Scanner(System.in);
        Queue<String> student = new LinkedList<>();
        Queue<String> income = new LinkedList<>();
        public void getStudent()
        {
                System.out.println("Enter the number of Student :");
                int value = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter the Students Name :");
                for (int i = 0; i <value; i++) {
                        student.add(scanner.nextLine());
                }
                System.out.println("List of Students Name :" + student);
        }
        public void StudentCome()
        {
               while(!student.isEmpty())
               {
                       System.out.println("How many Student should come to buy at a time...?");
                       int Nostudent = scanner.nextInt();
                       System.out.println("*************************************************");
                       String removeStudent;
                       for (int i = 0; i < Nostudent; i++) {
                               removeStudent = student.remove();
                               income.add(removeStudent);
                       }
                       System.out.println("Students who Received the NoteBook :" + income);
                       System.out.println("Balance Students Name :" + student);
                       System.out.println("Is there any students to join...\n (1)Yes \t\t (2)No");
                       String option = (scanner.next());
                       switch (option)
                       {
                               case "yes":
                                       scanner.nextLine();
                                       System.out.println("Enter the number of Student :");
                                       int value1 = scanner.nextInt();
                                       scanner.nextLine();
                                       System.out.println("Enter the Students Name");
                                       for (int i = 0; i <value1; i++) {
                                               student.add(scanner.nextLine());
                                       }
                                       System.out.println("Balance Students Name : "+student);
                                       break;
                               case "no":
                                       break;
                       }
               }
        }
}