package com.jp.repository;

import com.jp.vo.ShippingOption;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Slf4j
public class ShippingOptionsRepository {

    public Map<String, List<ShippingOption>> getShippingOptions(List<String> itemIds) {
        Map<String, List<ShippingOption>> shippingOptions = new HashMap<>();
        List<ShippingOption> shippingOption = createShippingOptions();
        itemIds.forEach(itemId -> {
            shippingOptions.put(itemId,shippingOption);
        });
        log.info("sucessfully created shipping options map");
        return shippingOptions;
    }

    private List<ShippingOption> createShippingOptions() {

        List<ShippingOption> shippingOptions = new ArrayList<>();
        ShippingOption oneDayShipping = new ShippingOption();
        oneDayShipping.setAmount(15.00);
        oneDayShipping.setCode("1D");
        oneDayShipping.setDescription("1 day Shipping");
        ShippingOption twoDayShipping = new ShippingOption();
        twoDayShipping.setAmount(10.00);
        twoDayShipping.setCode("2D");
        twoDayShipping.setDescription("2 day Shipping");
        ShippingOption standard = new ShippingOption();
        standard.setAmount(5.00);
        standard.setCode("S");
        standard.setDescription("Standard delivery");
        shippingOptions.add(oneDayShipping);
        shippingOptions.add(twoDayShipping);
        shippingOptions.add(standard);
        return shippingOptions;
    }
}
