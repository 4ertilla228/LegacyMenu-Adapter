package com.legacymenu.abstraction;
import com.legacymenu.implementary.CatalogStorage;
import com.legacymenu.model.FoodItem;
import com.legacymenu.model.MenuItem;
import com.legacymenu.model.StorageSyncException;

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
