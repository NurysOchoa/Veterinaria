import java.util.Date;

//para crear una Clase
//primero se especifica el accesor(public,privado/hay otros)
//luego la palabra class y finalmente 
//el nombre de la clase, tiene que ser exacto al nombre
//del archivoPvo. En este caso Persona esnta en Persona.java



//PascalCase: Cada palabra comienza con mayuscula
//Ej: clase Coca Cola, seria CocaCola y su archivo CocaCola.java
//por defecto hereda de la clase objet

public class Persona {

    //atributos/variables de instancia
    //va el modificador de acceso: public/private/protected
    //public significa quer TODAS las otras instancias
    //pueden acceder a mi propiedad nombre
    //despues viene el tipo de dato y finalmente el nombre del atributo
    public String nombre;
    public String dni;
    public String telefono;
    //el maximo de int es 2147483647 (10 digitos)
    //011-2525-6254 => con int se guardaria asi: 1125256254 
    //con numeros largos es mejor poner aparte codigo de pais, ciudad y el resto
    public Date fechaDeNacimiento;
    public String direccion;
    public String email;
         

}
