package com.legacymenu.abstraction;
import com.legacymenu.implementary.CatalogStorage;
import com.legacymenu.model.MenuItem;
import com.legacymenu.model.StorageSyncException;

public abstract class MenuSynchronizer {
    protected CatalogStorage storage;

    public MenuSynchronizer(CatalogStorage storage) {this.storage = storage;}

    public void setStorage(CatalogStorage newStorage){
        this.storage = newStorage;
    }

    public abstract void sync(MenuItem item) throws StorageSyncException;
}
