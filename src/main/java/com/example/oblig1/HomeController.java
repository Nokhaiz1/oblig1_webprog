package com.example.oblig1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {
    private final List<Biletter> alleBiletter = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagreBiletter (Biletter nyBilett){
        alleBiletter.add(nyBilett);
    }

    @GetMapping("/hent")
    public List<Biletter> hentAlle(){
        return alleBiletter;
    }

    @GetMapping("/slett")
    public void slettBiletter(){
        alleBiletter.clear();
    }

}


