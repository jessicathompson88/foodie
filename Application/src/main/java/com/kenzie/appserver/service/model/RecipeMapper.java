package com.kenzie.appserver.service.model;

import com.kenzie.appserver.repositories.model.Enums;
import com.kenzie.appserver.repositories.model.RecipeRecord;

public class RecipeMapper {

    public static Recipe toRecipe(RecipeRecord recipeRecord) {
        return new Recipe(
                recipeRecord.getTitle(),
                recipeRecord.getId(),
                recipeRecord.getCuisine().toString(),
                recipeRecord.getDescription(),
                recipeRecord.getDietaryRestrictions().toString(),
                recipeRecord.hasDietaryRestrictions(),
                recipeRecord.getIngredients(),
                recipeRecord.getInstructions()
        );
    }

    public static RecipeRecord toRecipeRecord(Recipe recipe) {
        RecipeRecord recipeRecord = new RecipeRecord();
        recipeRecord.setTitle(recipe.getTitle());
        recipeRecord.setId(recipe.getId());
        // Convert cuisine from String to Enums.Cuisine
        recipeRecord.setCuisine(Enums.Cuisine.valueOf(recipe.getCuisine()));
        recipeRecord.setDescription(recipe.getDescription());
        // Convert dietaryRestrictions from String to Enums.DietaryRestrictions
        recipeRecord.setDietaryRestrictions(Enums.DietaryRestrictions.valueOf(recipe.getDietaryRestrictions()));
        recipeRecord.setHasDietaryRestrictions(recipe.hasDietaryRestrictions());
        recipeRecord.setIngredients(recipe.getIngredients());
        recipeRecord.setInstructions(recipe.getInstructions());
        return recipeRecord;
    }
}