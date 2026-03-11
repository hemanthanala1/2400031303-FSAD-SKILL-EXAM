package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer>
{

}