import com.huerto.controller.HuertoController;
import com.huerto.view.HuertoCatalogoIU;
import com.huerto.view.HuertoIU;
import com.huerto.view.HuertoPersonalizadoIU;

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
    }
}