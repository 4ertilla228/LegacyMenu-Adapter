package main.java.com.legacymenu.legacy;

public class LegacyPosTerminal {
    public int saveToTerminal(byte[] data){
        if (data == null || data.length == 0){
            return -1;
        }

        String decodedData = new String(data);
        if (decodedData.length() > 50){
            return 2;
        }

        System.out.println("[LegacyPos] Uspeshno saved: " + decodedData);
        return 0;
    }
}
