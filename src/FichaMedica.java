import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FichaMedica {

    public Cliente cliente;
    public Medico medico;
    public Paciente paciente;
    public Date fechaDeIngreso;
    
    Date hoy = new Date();

    public List<Medicamento> medicamentos = new ArrayList<>();
    public String tratamiento;

    public void ingresar(Medicamento medicamento) {

        this.medicamentos.add(medicamento);

    }

    public void imprimirListadoMedicamentos() {

        System.out.println("**********LISTADO**********");
        // For each medicamento en medicamentos
        // es un ciclo For especial
        // que permite iterar/recorrer listas
        // asignando una variable antes del: el valor
        // de cada elemento.
        for (Medicamento medicamento : medicamentos) {
            // imprimo el atributo nombre del medicamento
            System.out.println("Medicamentos Recetados: " + medicamento.nombre);
            System.out.println("*****************************");
        }
    }

    public void imprimirFicha() {
        System.out.println("**********FICHA**********");

        System.out.println("Cliente: " + cliente.nombre);
        System.out.println("Paciente: " + paciente.nombre);
        System.out.println( "Edad del paciente: " + paciente.edad);
        System.out.println( "Fecha de Ingreso:  " + fechaDeIngreso);
        System.out.println( " Medico:  " + medico.nombre);

        System.out.println("***************************");

    }

}
