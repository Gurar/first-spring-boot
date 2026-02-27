package lt.viko.eif.jkozlovski.first.spring.boot.menu;

import lt.viko.eif.jkozlovski.first.spring.boot.db.CustomerRepository;
import lt.viko.eif.jkozlovski.first.spring.boot.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class UserMenu {
    @Autowired
    private CustomerRepository customerRepository;
    private static List<Customer> customers;

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

    public void shownMenu() {
        Scanner input = new Scanner(System.in);
        int userChoise;
        do {
            userChoise = displayMenu(input);
            switch (userChoise){
                case 1:
                    customers = customerRepository.findAll();
                    for (Customer customer: customers) {
                        System.out.println(customer);
                    }
                    break;
                case 6:
                    System.out.println("Thanks you and goodbay");
                    System.exit(0);
                    break;
            }
        }while (userChoise != 6);
    }
}
