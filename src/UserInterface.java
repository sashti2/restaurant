import States.*;

import java.time.LocalTime;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        boolean cont = true;

        while(cont){
            Scanner cin = new Scanner(System.in);
            String[] str;
            displayMenu();
            System.out.print("Select an option: ");
            int option = getMenuOption(cin);
            System.out.println();
            switch(option){
                case 1:
                    str = SystemInterface.getMenu();
                    displayOutput(str);
                    System.out.println();
                    break;
                case 2:
                    Context context = new Context();
                    State state;
                    LocalTime now = LocalTime.now();
                    LocalTime breakfastStart = LocalTime.parse("06:00");
                    LocalTime lunchStart = LocalTime.parse("12:00");
                    LocalTime dinnerStart = LocalTime.parse("18:00");
                    LocalTime closingTime = LocalTime.parse("23:59");
                    if(now.equals(breakfastStart) || now.isAfter(breakfastStart) && now.isBefore(lunchStart)){
                        state = new Breakfast();
                        state.doAction(context);
                    }
                    else if(now.equals(lunchStart) || now.isAfter(lunchStart) && now.isBefore(dinnerStart)){
                        state = new Lunch();
                        state.doAction(context);
                    }
                    else if(now.equals(dinnerStart) || now.isAfter(dinnerStart) && now.isBefore(closingTime)){
                        state = new Dinner();
                        state.doAction(context);
                    }
                    else{
                        System.out.println("Sorry we are closed.");
                    }

                    break;
                case 3:
                    boolean cont2 = true;
                    int[] arr = new int[100];
                    int temp = 0;
                    while(cont2){
                        System.out.print("Enter the item number of the item you want(Enter 0 to stop ordering): ");
                        int choice = cin.nextInt();
                        if(choice == 0)
                            cont2 = false;
                        else{
                            arr[temp] = choice;
                            temp++;
                            System.out.println("Item added!");
                        }
                    }
                    str = SystemInterface.submitOrder(arr);
                    displayOutput(str);
                    System.out.println();
                    break;
                case 4:
                    str = SystemInterface.getOrder();
                    System.out.println("------ Tab ------");
                    displayOutput(str);
                    System.out.println("Total: $" + SystemInterface.getTotal());
                    System.out.println();
                    break;
                case 5:
                    System.out.println("System closing");
                    cont = false;
                    System.exit(0);
            }
            System.out.println();
        }
    }

    public static  void displayMenu(){
        System.out.println("OPTIONS:");
        System.out.println("1 - Display Full Menu");
        System.out.println("2 - Display Variable Menu");
        System.out.println("3 - Order Items");
        System.out.println("4 - Show Tab");
        System.out.println("5 - Exit");
    }

    public static int getMenuOption(Scanner scan){
        int temp = scan.nextInt();
        while(temp > 5 || temp < 1){
            System.out.println();
            System.out.print("Please enter an option: ");
            temp = scan.nextInt();
        }
        return temp;
    }

    public static void displayOutput(String[] str){
        int x = 0;
        while(str[x] != null){
            System.out.println(str[x]);
            x++;
        }
    }
}
