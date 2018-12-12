package com.bankofsimba.demobank;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {
    private List<BankAccount> clients;

    public BankController() {
        clients = new ArrayList();
        clients.add(new BankAccount("Rafiki", 500, "Monkey", false));
        clients.add(new BankAccount("Zazu", 10, "Bird", false));
        clients.add(new BankAccount("Nala", 1000, "Lion", true));
        clients.add(new BankAccount("Timon", 230, "Meerkat", false));
    }

    @RequestMapping("/show")
    public String showAnimals(Model model) {
        model.addAttribute("client", new BankAccount("Simba", 420, "Lion", true));
        return "BankTemplate";
    }

    @RequestMapping("/bankerror")
    public String error(Model model) {
        model.addAttribute("msg1", "This is an <em>HTML</em> text. ");
        model.addAttribute("msg2", "<b>Enjoy yourself!</b>");
        return "error";
    }

    @RequestMapping("/list")
    public String listAnimals(Model model) {
        model.addAttribute("list", clients);
        return "list";
    }

    @PostMapping("/add")
    public String raiseCash(@RequestParam String name) {
        for (BankAccount account : clients) {
            if (account.getName().equals(name) && account.isKing()) {
                account.setBalance(100 + account.getBalance());
            } else if (account.getName().equals(name)){
                account.setBalance(10 + account.getBalance());
            }
        }
        return "redirect:/list";
    }
}

