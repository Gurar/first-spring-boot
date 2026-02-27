package lt.viko.eif.jkozlovski.first.spring.boot.menu;

import java.util.Scanner;

public class UserMenu {

    public UserMenu() {
    }

    private int displayMenu(Scanner input) {
        System.out.println("\n" +
                "██╗   ██╗███████╗███████╗██████╗     ███╗   ███╗███████╗███╗   ██╗██╗   ██╗\n"+
                "██║   ██║██╔════╝██╔════╝██╔══██╗    ████╗ ████║██╔════╝████╗  ██║██║   ██║\n"+
                "██║   ██║███████╗█████╗  ██████╔╝    ██╔████╔██║█████╗  ██╔██╗ ██║██║   ██║\n"+
                "██║   ██║╚════██║██╔══╝  ██╔══██╗    ██║╚██╔╝██║██╔══╝  ██║╚██╗██║██║   ██║\n"+
                "╚██████╔╝███████║███████╗██║  ██║    ██║ ╚═╝ ██║███████╗██║ ╚████║╚██████╔╝\n"+
                "╚═════╝ ╚══════╝╚══════╝╚═╝  ╚═╝    ╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝ ╚═════╝|\n"
        );
        System.out.println(" Make a selection ");
        System.out.println("-------------------");
        System.out.printf("| 1) + %10s \n", "Fetch data from DB");
        System.out.printf("| 6) + Quit %7s \n", "");
      return input.nextInt();
    }

    private void shownMenu() {
        Scanner input = new Scanner(System.in);
    }
}
