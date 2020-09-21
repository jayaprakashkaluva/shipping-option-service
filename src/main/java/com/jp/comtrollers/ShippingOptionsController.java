package com.jp.comtrollers;

import com.jp.service.ShippingOptionsService;
import com.jp.vo.ShippingOption;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class ShippingOptionsController {

    private ShippingOptionsService shippingOptionsService;

    public ShippingOptionsController(ShippingOptionsService shippingOptionsService) {
        this.shippingOptionsService = shippingOptionsService;
    }

    @GetMapping("/carts/shipping-options")
    public Map<String,List<ShippingOption>> getShippingOptions(@RequestParam List<String> itemIds) {
        log.info("--getting shipping options---");
        return shippingOptionsService.getShippingOptions(itemIds);
    }
}
