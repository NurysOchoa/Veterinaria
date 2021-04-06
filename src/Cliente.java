//En este caso Cliente "hereda" (extends) de persona
public class Cliente extends Persona {
    //int max : 2147483647
    
    //variables de instancia
    public int codigoCliente;
    public String formaDePago; //Tarjeta,Efectivo,Transferencia
    //en vez de publico, sera privada para proteger los datos

    private String palabraSecreta;

    //METODO
    public void generarPalabraSecreta(){
            this.palabraSecreta=  "232329";
    }
}
