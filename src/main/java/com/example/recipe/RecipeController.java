package com.example.recipe;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.recipe.RecipeService;
 

// Write your code here
@RestController
public class RecipeController{
    RecipeService recipeService = new RecipeService();

    @GetMapping("/recipes")
    public ArrayList<Recipe> getRecipes(){
        return recipeService.getRecipes();
    }

    @PostMapping("/recipes")
    public Recipe addRecipe(@RequestBody Recipe recipe){
        return recipeService.addRecipe(recipe);
    }

    @GetMapping("/recipes/{recipeId}")
    public Recipe getRecipeById(@PathVariable int recipeId){
        return recipeService.getRecipeById(recipeId);
    }
    @PutMapping("/recipes/{recipeId}")
    public Recipe updateRecipe(@PathVariable int recipeId, @RequestBody Recipe recipe){
        return recipeService.updateRecipe(recipeId, recipe);
    }
    @DeleteMapping("/recipes/{recipeId}")
    public void deleteRecipe(@PathVariable int recipeId){
        recipeService.deleteRecipe(recipeId);
    }
    
}