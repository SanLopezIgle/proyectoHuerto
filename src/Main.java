import com.huerto.controller.HuertoCatalogoController;
import com.huerto.controller.HuertoController;
import com.huerto.model.Consultas;
import com.huerto.model.DatabaseManager;
import com.huerto.view.HuertoCatalogoIU;
import com.huerto.view.HuertoIU;
import com.huerto.view.HuertoPersonalizadoIU;

import javax.swing.*;
import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {

        HuertoIU huertoIU= new HuertoIU();
        // huertoIU.setVisible(true);

        HuertoCatalogoIU huertoCatalogoIU= new HuertoCatalogoIU();
        // huertoCatalogoIU.setVisible(true);

        HuertoPersonalizadoIU huertoPersonalizadoIU= new HuertoPersonalizadoIU();
        // huertoPersonalizadoIU.setVisible(true);

        HuertoController controller = new HuertoController(huertoIU, huertoCatalogoIU, huertoPersonalizadoIU);
        huertoIU.setVisible(true);



        //HuertoCatalogoIU vistaCatalago = new HuertoCatalogoIU();
        //vistaCatalago.setVisible(true);
        // DatabaseManager modelo = DatabaseManager.getInstance();
        //modelo.getConnection();
        //Consultas consulta = new Consultas();

        //HuertoCatalogoController controllerCatalogo = new HuertoCatalogoController(huertoCatalogoIU,consulta, modelo)

    }
}