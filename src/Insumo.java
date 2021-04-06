import java.util.Date;

public class Insumo {

    public String nombre;
    public Date fechaDeIngreso;
    public String codigoDelInsumo;
    public Date fechaDeCaducidad;
    public double precio;
    public double costo;

    // vamos a aplicar un metodo para saber si esta vencido
    public boolean estaVencido(){
        Date hoy = new Date();   //en java cada vez que hacemos un new Date por defecto tiene la fecvha de hoy

        // this.fechaDeCaducidad >= hoy
        if (this.fechaDeCaducidad.after(hoy)) {
            return true;
        }
        return false;
    }

}
