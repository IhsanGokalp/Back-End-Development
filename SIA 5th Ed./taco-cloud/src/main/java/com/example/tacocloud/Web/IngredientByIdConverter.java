package com.example.tacocloud.Web;

import com.example.tacocloud.Ingredient;
import com.example.tacocloud.data.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private IngredientRepository ingredientRepository;

    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient convert(String s) {
        Optional<Ingredient> ingredient = ingredientRepository.findById(s);
        return ingredient.isPresent()?ingredient.get():null;
    }
}
