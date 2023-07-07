package com.kenzie.appserver.repositories.model;
//for merge
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.List;
import java.util.Objects;

@DynamoDBTable(tableName = "Recipes")
public class RecipeRecord {

    private String id;
    private String title;
    private String cuisine;
    private String description;
    private String dietaryRestrictions;
    private boolean hasDietaryRestrictions;
    private List<String> ingredients;
    private String instructions;

    public RecipeRecord() {
    }

    @DynamoDBHashKey(attributeName = "id")
    @DynamoDBAutoGeneratedKey
    public String getId() {
        return id;
    }

    @DynamoDBAttribute(attributeName = "title")
    public String getTitle() {
        return title;
    }

    @DynamoDBAttribute(attributeName = "cuisine")
    public String getCuisine() {
        return cuisine;
    }

    @DynamoDBAttribute(attributeName = "description")
    public String getDescription() {
        return description;
    }


    @DynamoDBAttribute(attributeName = "dietaryRestrictions")
    public String getDietaryRestrictions() {
        return dietaryRestrictions;
    }

    @DynamoDBAttribute(attributeName = "hasDietaryRestrictions")
    public boolean getHasDietaryRestrictions() {
        return hasDietaryRestrictions;
    }

    @DynamoDBAttribute(attributeName = "ingredients")
    public List<String> getIngredients() {
        return ingredients;
    }

    @DynamoDBAttribute(attributeName = "instructions")
    public String getInstructions() {
        return instructions;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void setDietaryRestrictions(String dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
        this.hasDietaryRestrictions = dietaryRestrictions != null;
    }

    public void setHasDietaryRestrictions(boolean hasDietaryRestrictions) {
        this.hasDietaryRestrictions = hasDietaryRestrictions;
    }

    public void setIngredients(List<String> ingredients) {
//        if (ingredients != null) {
//            for (String ingredient : ingredients) {
        this.ingredients = ingredients;
    }
//        }
//    }
//
//    public void addIngredient(String ingredient) {
//        if (ingredients == null) {
//            ingredients = new ArrayList<>();
//        }
//        ingredients.add(ingredient);
//    }

    public void setInstructions(String instructions) {

        this.instructions = instructions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeRecord that = (RecipeRecord) o;
        return getHasDietaryRestrictions() == that.getHasDietaryRestrictions() && Objects.equals(getId(), that.getId()) && Objects.equals(getTitle(), that.getTitle()) && Objects.equals(getCuisine(), that.getCuisine()) && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getDietaryRestrictions(), that.getDietaryRestrictions()) && Objects.equals(getIngredients(), that.getIngredients()) && Objects.equals(getInstructions(), that.getInstructions());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getCuisine(), getDescription(), getDietaryRestrictions(), getHasDietaryRestrictions(), getIngredients(), getInstructions());
    }
}