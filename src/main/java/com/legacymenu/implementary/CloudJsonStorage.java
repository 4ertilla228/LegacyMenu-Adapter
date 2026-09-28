package com.legacymenu.implementary;
import com.legacymenu.model.MenuItem;
import com.legacymenu.model.StorageSyncException;

public class CloudJsonStorage implements CatalogStorage {
    @Override
    public void saveItem(MenuItem item) throws StorageSyncException {
        System.out.println("[CLOID API] Saving item as JSON: { \"name\": \""+ item.getName()+ "\" }");
    }
}
