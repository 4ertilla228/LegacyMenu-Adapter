package com.legacymenu.abstraction;
import com.legacymenu.implementary.CatalogStorage;
import com.legacymenu.model.BeverageItem;
import com.legacymenu.model.MenuItem;
import com.legacymenu.model.StorageSyncException;

public class BeverageSynchronizer extends MenuSynchronizer {
    public BeverageSynchronizer(CatalogStorage storage) {
        super(storage);
    }

    @Override
    public void sync(MenuItem item) throws StorageSyncException {
        if (item instanceof BeverageItem) {
            System.out.println("Syncing napitok...");
            storage.saveItem(item);
        } else{
            throw new StorageSyncException("Item ne napitok");
        }
    }
}