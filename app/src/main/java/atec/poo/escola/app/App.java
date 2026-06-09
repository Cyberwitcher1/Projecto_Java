package atec.poo.escola.app;
import atec.poo.escola.app.main.Menu;
import atec.poo.escola.core.SchoolManager;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        //System.out.println("--- Inicio da Aplicação ---");
        //Criar a Ligação ao Gestor (API do Core)
        SchoolManager schoolManager = new SchoolManager();

        //Ler imports, caso hajam
        String dataFile=System.getProperty("import");
        if(dataFile!=null) {
            try {
                schoolManager.importFile(dataFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        Menu menu=new Menu(schoolManager);
        menu.open();




    }
}
