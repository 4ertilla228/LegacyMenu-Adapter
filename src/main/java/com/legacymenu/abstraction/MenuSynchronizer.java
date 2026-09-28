package main.java.com.legacymenu.abstraction;
import main.java.com.legacymenu.implementary.CatalogStorage;
import main.java.com.legacymenu.model.MenuItem;
import main.java.com.legacymenu.model.StorageSyncException;

public abstract class MenuSynchronizer {
    protected CatalogStorage storage;

    public MenuSynchronizer(CatalogStorage storage) {this.storage = storage;}

    public void setStorage(CatalogStorage newStorage){
        this.storage = newStorage;
    }

    public abstract void sync(MenuItem item) throws StorageSyncException;
}
