package com.spring.RestaurantReservations.repository;

import com.spring.RestaurantReservations.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    boolean existsByMenuIdAndUserId(int menuId, int userId);

    @Query("SELECT r.menuId FROM Reservation r WHERE r.userId = :userId")
    List<Integer> findAllMenuIdsByUserId(@Param("userId") int userId);

    void deleteByMenuId(int id);
}
