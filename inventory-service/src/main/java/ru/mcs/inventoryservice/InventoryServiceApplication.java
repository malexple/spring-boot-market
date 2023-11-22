package ru.mcs.inventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.mcs.inventoryservice.model.Inventory;
import ru.mcs.inventoryservice.repository.InventoryRepository;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }


    @Bean
    public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
        return args -> {
            Inventory inventory = new Inventory();
            inventory.setSkuCode("samsung_note_9");
            inventory.setQuantity(100);

            Inventory inventoryBlack = new Inventory();
            inventoryBlack.setSkuCode("samsung_note_9_black");
            inventoryBlack.setQuantity(0);

            inventoryRepository.save(inventory);
            inventoryRepository.save(inventoryBlack);
        };
    }
}
