package com.cloudcart.cart.repository;

import com.cloudcart.cart.entity.MaintenanceQueue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MaintenanceQueueRepository extends JpaRepository<MaintenanceQueue, Long> {
    Optional<MaintenanceQueue> findByUsername(String username);
}
