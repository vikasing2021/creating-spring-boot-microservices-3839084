package com.example;

import com.example.tourservice.TourManagementService;
import com.example.tourservice.TravelAgentService;
import com.example.tourservice.utilities.SpringBeans;
import com.example.tourservice.utilities.TourRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringBeans.class);
        TravelAgentService agent = context.getBean(TravelAgentService.class);

        // Do not invoke agent method before manager creates base tours
        System.out.println("\n******Explore California Tour Catalogue******");
        agent.displayTours();

        System.out.println("\n******Explore California Tour Kid Friendly Tours******");
        agent.displayToursBy(true);
    }
}
