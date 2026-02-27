package lt.viko.eif.jkozlovski.first.spring.boot.service;
import lt.viko.eif.jkozlovski.first.spring.boot.menu.UserMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    @Autowired
    private UserMenu userMenu;

    @Override
    public void run(String... args) throws Exception {
       userMenu.shownMenu();
    }
}
