import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {

        //en este caso creo la variable local "michi"
        //de tipo Paciente
        // michi

        Paciente michi = new Paciente();
        //le asigno nombre al michi
        michi.nombre = "Mabel";
        michi.especie = "gati";
        michi.edad = 10;
        
        Paciente perrito = new Paciente();
        perrito.nombre = "Rubencio";
        perrito.especie = "perrito" ;
        perrito.edad = 5;

        Paciente agatha = new Paciente();
        agatha.nombre = "Agatha";
        agatha.especie = "gati";
        agatha.edad = 12;



        ClinicaVeterinaria vete = new ClinicaVeterinaria(); //crea un obj de tipo ClinicaVeterinaria
        vete.nombre = "Pupis";
        
        Paciente kira = new Paciente();
        kira.nombre = "Kira";
        kira.especie = "perrito";
        kira.edad = 2;


        //llamo a los metodos de ingresarlos a la veterinaria.
        vete.ingresar(michi);
        vete.ingresar(perrito);
        vete.ingresar(kira);
        vete.ingresar(agatha);


        
        vete.imprimirListadoPacientes();

        FichaMedica ficha = new FichaMedica();

        ficha.cliente = new Cliente();
        ficha.cliente.nombre = "Daniela";
        ficha.cliente.dni = "95922146";

        ficha.paciente = kira;

        ficha.medico = new Medico();
        ficha.medico.nombre = "Jose Boada";
        
        ficha.fechaDeIngreso = new Date();

        Medicamento medi = new Medicamento();
        medi.nombre = "AntiPar";



        ficha.ingresar(medi);

        ficha.imprimirListadoMedicamentos();

        ficha.imprimirFicha();          


        

       

       




    }
}






         


