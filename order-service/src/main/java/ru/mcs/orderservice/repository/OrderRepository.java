package ru.mcs.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mcs.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
