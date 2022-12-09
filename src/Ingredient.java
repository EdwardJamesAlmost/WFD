import java.time.LocalDate;

public class Ingredient {

    private String ingredientName;
    private float price;
    private LocalDate purchaseDate;
    private LocalDate expDate;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }

    public StorageTemp getStorageTemp() {
        return storageTemp;
    }

    public void setStorageTemp(StorageTemp storageTemp) {
        this.storageTemp = storageTemp;
    }

    private StorageTemp storageTemp;

    public String getIngredientName() {
        return ingredientName;
    }
    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }
}

