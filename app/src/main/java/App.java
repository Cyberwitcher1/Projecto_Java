package atec.poo.loja.app;

import atec.poo.loja.app.main.Menu;
import atec.poo.loja.core.StoreManager;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        //CaminhoFerro cf = new CaminhoFerro();
        StoreManager storeManager=new StoreManager();
        //Efetuar Import caso haja
        String dataFile=System.getProperty("import");
        if(dataFile!=null) {
            try {
                storeManager.importFile(dataFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        Menu menu=new Menu(storeManager);
        menu.open();
    }
}
