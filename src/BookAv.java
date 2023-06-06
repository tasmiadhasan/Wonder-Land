import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookAv{
    public void Book() {
        Scanner sc = new Scanner(System.in);
        System.out.println("                                                     Press 0 to go back to Main Menu");
        System.out.println("                                                     To Buy a Ticket Press 1:");
        System.out.print("                                                     Enter your Choice:");
        int choice = sc.nextInt();
        if (choice == 0) {
            Main_Menu menu = new Main_Menu();
            menu.menu();
        } else if (choice == 1) {
            System.out.println("                                                     To Buy a Ticket Please Provide you info:");
            System.out.print("                                                     Name:");
            String name = sc.next();
            System.out.print("                                                     Phone:");
            String phn = sc.next();
            System.out.print("                                                     Address:");
            String add = sc.next();
            System.out.print("                                                     Choose your Show no:");
            String movieno = sc.next();
            String moviename = null;
            String movietime = null;
            String modate = null;


            try {
                File file = new File("AvailableMovie.txt");
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    String movienoo = scanner.next();
                    String movname = scanner.next();
                    String mtime = scanner.next();
                    String mdate = scanner.next();

                    try {
                        if (movieno.equals(movienoo)) {
                            moviename = movname;
                            movietime = mtime;
                            modate = mdate;
                        }
                    } catch (Exception e) {
                        System.out.println("                                                     Invalid Input");
                        System.out.println();
                        Main_Menu mainMenu = new Main_Menu();
                        mainMenu.menu();
                    }

                }
                scanner.close();

            } catch (FileNotFoundException e) {
                System.out.println(e);
            }

            System.out.println("                                                     -Seat Type-");
            System.out.println("                                                     1. Front seat ");
            System.out.println("                                                     2.Back Seats");
            System.out.print("                                                     Choose a seat: ");
            String seat = sc.next();
            System.out.print("                                                     Amount of Tickets:");
            int amtick = sc.nextInt();
            int price = 1;

            if (seat.equals("1")) {
                price = 500 * amtick;
            } else if (seat.equals("2")) {
                price = 300 * amtick;
            } else {
                System.out.println("                                                     Invalid Input");
                System.out.println();
                Main_Menu mainMenu = new Main_Menu();
                mainMenu.menu();
            }
            CustomerInfo customerInfo = new CustomerInfo(name, phn, add, movieno, moviename, modate, movietime);
            customerInfo.bill();


            System.out.println("                                                     Tickets:" + amtick + "                  Price=" + price + "/-");

            System.out.println("                                                     ----------------------------------------------------");
            System.out.println("                                                     Press 1 to main menu");
            System.out.println("                                                     Press 2 to exit");
            System.out.println("                                                     ----------------------------------------------------");
            System.out.print("                                                     Enter your Choice:");
            int choice2 = sc.nextInt();
            if (choice2 == 1) {
                System.out.println();
                Main_Menu mainMenu = new Main_Menu();
                mainMenu.menu();
            } else if (choice2 == 2) {
                System.out.println();
                System.out.println("                                                     Thank you for using our service");
                System.exit(0);
            } else {
                System.out.println();
                System.out.println("                                                     Invalid Input");
            }


        }
    }
}
