package main.java.com.legacymenu.abstraction;
import main.java.com.legacymenu.implementary.CatalogStorage;
import main.java.com.legacymenu.model.FoodItem;
import main.java.com.legacymenu.model.MenuItem;
import main.java.com.legacymenu.model.StorageSyncException;

public class FoodSynchronizer extends MenuSynchronizer {
    public FoodSynchronizer(CatalogStorage storage) {
        super(storage);
    }

    @Override
    public void sync(MenuItem item) throws StorageSyncException {
        if (item instanceof FoodItem) {
            FoodItem food = (FoodItem) item;
            System.out.println("Syncing eda item s allergens: " + food.getAlgrens());
            storage.saveItem(item);
        } else {
            throw new StorageSyncException("Item ne eda");
        }
    }
}
