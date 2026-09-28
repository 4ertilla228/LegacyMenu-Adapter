package com.legacymenu.implementary;
import com.legacymenu.model.MenuItem;
import com.legacymenu.model.StorageSyncException;

public class LocalSqliteStorage implements CatalogStorage {
    @Override
    public void saveItem(MenuItem item) throws StorageSyncException {
        System.out.println("[SQLITE] INSERT INTO menu (name, price) VALUES ('" + item.getName() + "', " + item.getPrice() + ")");
    }
}