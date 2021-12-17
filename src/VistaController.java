
import modelo.Alumno;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class VistaController implements Initializable {
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {    
    
        //Alumnos DI (10)
        Alumno di1 = new Alumno("4568752R", "DI", 6.5, "Córdoba");
        Alumno di2 = new Alumno("25348955F", "DI", 6.0, "Granada");
        Alumno di3 = new Alumno("53348527R", "DI", 7.0, "Granada");
        Alumno di4 = new Alumno("35226857R", "DI", 9.5, "Málaga");
        Alumno di5 = new Alumno("42269853J", "DI", 9.0, "León");
        Alumno di6 = new Alumno("45224588H", "DI", 8.0, "Madrid");
        Alumno di7 = new Alumno("55124290Y", "DI", 9.0, "Málaga");
        Alumno di8 = new Alumno("54223597S", "DI", 6.0, "Valencia");
        Alumno di9 = new Alumno("24552357W", "DI", 7.0, "Granada");
        Alumno di10 = new Alumno("25662347T", "DI", 6.0, "Cádiz");
        
        //Alumnos PMDM (6)
        Alumno pmdm1 = new Alumno("22458536E", "PMDM", 5.5, "Madrid");
        Alumno pmdm2 = new Alumno("35665874T", "PMDM", 7.0, "Barcelona");
        Alumno pmdm3 = new Alumno("44586287Q", "PMDM", 6.0, "Huelva");
        Alumno pmdm4 = new Alumno("25366741R", "PMDM", 8.5, "Granada");
        Alumno pmdm5 = new Alumno("43562279Y", "PMDM", 8.0, "Granada");
        Alumno pmdm6 = new Alumno("24536852Q", "PMDM", 9.0, "Málaga");
       
        //Alumnos AD (5)
        Alumno ad1 = new Alumno("", "AD", 0.0, "Valencia");
        Alumno ad2 = new Alumno("", "AD", 0.0, "Málaga");
        Alumno ad3 = new Alumno("", "AD", 0.0, "Granada");
        Alumno ad4 = new Alumno("", "AD", 0.0, "Almería");
        Alumno ad5 = new Alumno("", "AD", 0.0, "Córdoba");
        
        //Alumnos PSP (3)
        Alumno psp1 = new Alumno("", "PSP", 0.0, "Granada");
        Alumno psp2 = new Alumno("", "PSP", 0.0, "Sevilla");
        Alumno psp3 = new Alumno("", "PSP", 0.0, "Sevilla");
    }

    @FXML
    Button btnMatriculadosDI, btnGraficoSectores, btnGraficoBarras, btnSalir;

    @FXML
    private void matriculadosDI(ActionEvent event) {
        System.out.println("maticulados DI");
    }

    @FXML
    private void graficoSectores(ActionEvent event) {
        System.out.println("sectores");
    }

    @FXML
    private void graficoBarras(ActionEvent event) {
        System.out.println("barras");
    }

    @FXML
    public void salir() {
        System.exit(0);
    }
}
