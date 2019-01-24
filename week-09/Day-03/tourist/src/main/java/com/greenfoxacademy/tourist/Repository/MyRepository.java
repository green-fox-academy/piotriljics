package com.greenfoxacademy.tourist.Repository;
import com.greenfoxacademy.tourist.Model.Attraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepository  extends JpaRepository <Attraction, Long> {
    Attraction findTop1ByCategoryIsOrderByPrice(String category);
}
