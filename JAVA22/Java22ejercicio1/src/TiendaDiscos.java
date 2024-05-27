import java.util.Scanner;

public class TiendaDiscos implements MetodosInterf{
    
    private String cliente;
    private int numeroSorteo;

    public TiendaDiscos() {
    }

    public TiendaDiscos(String cliente, int numeroSorteo) {
        this.cliente = cliente;
        this.numeroSorteo = numeroSorteo;
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumeroSorteo() {
        return this.numeroSorteo;
    }

    public void setNumeroSorteo(int numeroSorteo) {
        this.numeroSorteo = numeroSorteo;
    }

    public void inscribirDatos(){

        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce tu nombre:");
        this.cliente = sc.nextLine();
        System.out.println(cliente + " se ha inscrito en el sorteo de Tienda de Discos.");

    }

    public void comunicarResultado(){

        this.numeroSorteo = (int) (Math.random() * 1000) + 1;
        System.out.println("El numero obtenido para " + cliente + " en la Tienda de Discos es el: " + numeroSorteo);

    }

    @Override
    public String toString() {
        return "{" +
            " cliente='" + getCliente() + "'" +
            ", numeroSorteo='" + getNumeroSorteo() + "'" +
            "}";
    }

}
