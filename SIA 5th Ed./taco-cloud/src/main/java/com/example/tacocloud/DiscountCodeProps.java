package com.example.tacocloud;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Getter
public class DiscountCodeProps {
    private Map<String, Integer> codes = new HashMap<>();
}
