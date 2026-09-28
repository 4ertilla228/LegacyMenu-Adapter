package com.legacymenu.implementary;
import com.legacymenu.model.MenuItem;
import com.legacymenu.model.StorageSyncException;

public interface CatalogStorage {
    void saveItem(MenuItem item) throws StorageSyncException;
}
