import java.util.ArrayList;
import java.util.List;

public class ClinicaVeterinaria {

    public String nombre;
    public String cuit; //identificador fiscal
    public String telefono;
    public String email;
//Es un atributo de tipo "Lista".
//van siempre en PLURAL
//y se declara:
//public List<Tipo> nombreVariablePlural;
//adicionalmente van a agregar = new ArrayList<>(); para que sea
//una lista VACIA, es decir una lista con 0 elemntos
//Es una forma de decir que existe un atributo llamado pacientes que en este caso en una
//lista vacia porque esta en cero 

    public List<Paciente> pacientes = new ArrayList<>();
    //capacidad maxima de pacientes en la clinicaVeterinaria
    public int capacidadMaxima = 20; // asigna un valor por defecto

    //HACER REVISION PACIENTE
    // devuelve true si el paciente paso bien la revision
    // si no, false.
    // El siguiente es el primer metodo que dio el profesor

    public boolean hacerRevision(Paciente paciente) {

        System.out.println("Revisando al paciente" + paciente.nombre);
        return true;
    }
        // antes de hacer la revision tenemos que hacer el ingreso del paciente
        //al hacer el ingreso lo agregamos a la lista
        //devuelve true si lo pudo ingresar
        //false si no
        //si colocamos this.paciente.add(paciente);lo agregamos directanmente
        //como tenemos un topo, tenemos que preguntar y usamos el if
        //

    public boolean ingresar(Paciente paciente){

            if (this.pacientes.size () < this.capacidadMaxima) {
                this.pacientes.add(paciente);
                return true;
            }

            return false;
    }

    public void imprimirListadoPacientes(){

        System.out.println("**********LISTADO*********");
        //For each pacientes en pacientes
        //es un ciclo For especial
        //que permite iterar/recorrer listas
        //asignando una variable antes del: el valor
        //de cada elemento.
        for (Paciente paciente : pacientes) {
            //imprimo el atributo nombre del paciente
            System.out.println("Paciente Ingresado" + paciente.nombre);
        System.out.println("***********************************");
        }
    } 
}
        //(Paciente paciente : pacientes) {
        //Paciente es un tipo y paciente en minusula es una variable, en este caso local
        //paciente es el nombre de una variable que solo existe para el ciclo For, 
        //que en este caso va a tomar el valor de cada uno de los pacientes que haya
        //si hay 7 pacientes, lo va a hacer 7 veces

        //DE AQUI NOS VAMOS A App.java a ingreasar datos
        