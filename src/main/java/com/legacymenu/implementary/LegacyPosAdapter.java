package com.legacymenu.implementary;
import com.legacymenu.legacy.LegacyPosTerminal;
import com.legacymenu.model.MenuItem;
import com.legacymenu.model.StorageSyncException;


public class LegacyPosAdapter implements CatalogStorage {
    private LegacyPosTerminal legacyTerminal;
    public LegacyPosAdapter(LegacyPosTerminal legacyTerminal) {
        this.legacyTerminal = legacyTerminal;
    }
    @Override
    public void saveItem(MenuItem item) throws StorageSyncException {
        String itemData = item.getName() + ":" + item.getPrice();
        byte[] bytesToSave = itemData.getBytes();

        int errorCode = legacyTerminal.saveToTerminal(bytesToSave);

        if (errorCode != 0) {
            if(errorCode == -1) {
                throw new StorageSyncException("Legacy POS Error: Data ne mojet bit pustoy");
            } else if (errorCode == 2) {
                throw new  StorageSyncException("Legacy POS Error: Perepolnenie memento. Too long name item");
            } else {
                throw new StorageSyncException("Legacy POS Error: Unknown error code " + errorCode);            }
        }
    }

}
