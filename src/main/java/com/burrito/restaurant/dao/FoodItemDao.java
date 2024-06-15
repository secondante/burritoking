package com.burrito.restaurant.dao;

import com.burrito.restaurant.model.FoodItem;

import java.sql.SQLException;

/**
 * Data access object interface for FoodItem.
 */
public interface FoodItemDao {
    void setup() throws SQLException;

    FoodItem getFoodItem(int itemId) throws SQLException;

    void addFoodItem(FoodItem foodItem) throws SQLException;

    void updateFoodItem(int itemId, FoodItem updatedFoodItem) throws SQLException;

    void deleteFoodItem(int itemId) throws SQLException;
}
