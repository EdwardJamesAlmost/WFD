import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recipe {

    //fields
    private String recipeTitle;
    private Ingredient[] ingArray;

    // Field Access
    public String getRecipeTitle() {
        return recipeTitle;
    }
    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }

    public Recipe(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }


    public void printRecipe(){
        String outString;
        for (int i = 0; i < ingArray.length; i++){
            outString = ingArray[i].getIngredientName();
            System.out.println(outString);
        }
    }

    public void initializeRecipe(Recipe aRecipe){

        List<Ingredient> ingList = new ArrayList<Ingredient>();
        Scanner inputScan = new Scanner(System.in);



    }




}

