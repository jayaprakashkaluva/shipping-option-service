package com.jp.service;

import com.jp.repository.ShippingOptionsRepository;
import com.jp.vo.ShippingOption;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class ShippingOptionsService {

    private ShippingOptionsRepository shippingOptionRepository;

    public ShippingOptionsService(ShippingOptionsRepository shippingOptionsRepository) {
        this.shippingOptionRepository = shippingOptionsRepository;
    }

    public Map<String, List<ShippingOption>> getShippingOptions(List<String> itemIds) {
        log.info("Retrieving shipping options for {}",itemIds);
        return shippingOptionRepository.getShippingOptions(itemIds);
    }
}
