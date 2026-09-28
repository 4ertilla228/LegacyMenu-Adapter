package main.java.com.legacymenu.implementary;
import main.java.com.legacymenu.model.MenuItem;
import main.java.com.legacymenu.model.StorageSyncException;

public class CloudJsonStorage implements CatalogStorage {
    @Override
    public void saveItem(MenuItem item) throws StorageSyncException {
        System.out.println("[CLOID API] Saving item as JSON: { \"name\": \""+ item.getName()+ "\" }");
    }
}
