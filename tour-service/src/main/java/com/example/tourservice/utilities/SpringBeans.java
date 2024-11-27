package com.example.tourservice.utilities;

import com.example.tourservice.TourManagementService;
import com.example.tourservice.TravelAgentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeans {
    @Bean
    public TourRepository tourRepository() {
        return new TourRepository();
    }

    @Bean
    public TourManagementService tourManagementService(TourRepository tourRepository) {
        return new TourManagementService(tourRepository);
    }

    @Bean
    public TravelAgentService travelAgentService(TourRepository tourRepository) {
        return new TravelAgentService(tourRepository);
    }
}
