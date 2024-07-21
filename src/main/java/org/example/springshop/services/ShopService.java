package org.example.springshop.services;

import java.util.List;
import java.util.Optional;
import org.example.springshop.models.Shop;
import org.example.springshop.repositories.ShopRepository;
import org.springframework.stereotype.Service;

@Service
public class ShopService {

    private final ShopRepository shopRepository;

    public ShopService(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    public List<Shop> getAllShops() {
        return shopRepository.findAll();
    }

    public Optional<Shop> getShopById(Long id) {
        return shopRepository.findById(id);
    }

    public Shop addShop(Shop shop) {
        return shopRepository.save(shop);
    }

    public void updateShop(Shop shop) {
        shopRepository.update(shop);
    }

    public void deleteShop(Long id) {
        shopRepository.delete(id);
    }

    public List<Shop> searchShops(String query) {
        return shopRepository.search(query);
    }
}
