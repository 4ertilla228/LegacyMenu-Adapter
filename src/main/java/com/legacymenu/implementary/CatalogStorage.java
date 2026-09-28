package main.java.com.legacymenu.implementary;
import main.java.com.legacymenu.model.MenuItem;
import main.java.com.legacymenu.model.StorageSyncException;

public interface CatalogStorage {
    void saveItem(MenuItem item) throws StorageSyncException;
}
