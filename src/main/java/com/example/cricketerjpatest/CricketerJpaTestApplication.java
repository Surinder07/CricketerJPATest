package com.example.cricketerjpatest;

import com.example.cricketerjpatest.entity.Cricketer;
import com.example.cricketerjpatest.repo.CricketerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CricketerJpaTestApplication {

    private static final Logger log = LoggerFactory.getLogger(CricketerJpaTestApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CricketerJpaTestApplication.class, args);
       // System.out.println("testing.............");
    }

    @Bean
    public CommandLineRunner demo(CricketerRepository cricketerRepository) {
        return (args) -> {
            // save all the cricketers here
            cricketerRepository.save(new Cricketer("MS", "Dhoni", "CSK", "1"));
            cricketerRepository.save(new Cricketer("Virat", "Kohli", "RCB", "2"));
            cricketerRepository.save(new Cricketer("Rohit", "Sharma", "MI", "3"));
            cricketerRepository.save(new Cricketer("KL", "Rahul", "Kings11", "5"));
            cricketerRepository.save(new Cricketer("Suresh", "Raina", "CSK", "4"));
            log.info("");


            // fetch all cricketers
            log.info("List of all cricketers");
            for (Cricketer cricketer : cricketerRepository.findAll()){
                log.info(cricketer.toString());
            }


            // fetch cricketers with last name

            log.info("Find cricketer with last name");
            for(Cricketer dhoni : cricketerRepository.findByLastName("Dhoni")){
                log.info(dhoni.toString());
            }

            // find cricketer by ID

            Cricketer cricketer = cricketerRepository.findById(3L);
            log.info("Found with ID = 3");
            log.info(cricketer.toString());



        };
    }

}
