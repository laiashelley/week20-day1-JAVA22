
// // Eres el dueño de dos tiendas de diferente tipo y queremos que los clientes se inscriban para un mismo sorteo. OK

// Tenemos una papelería y una tienda de informática. crear un interface sorteoClientes que contenga los métodos inscribirDatos() y comunicarResultado() para que los clientes puedan apuntarse al sorteo desde ambas tiendas, y que puedan conocer el resultado en ambos casos.

// +EXTRA: una vez te funcione el interface, crea un sorteo random, por ejemplo número del 1 al 1000, y comunica ese número en comunicarResultado()

public class Java22ejercicio1 {
    public static void main(String[] args) throws Exception {
        
        MetodosInterf tiendaLibros = new TiendaLibros();
        MetodosInterf tiendaDiscos = new TiendaDiscos();
        
        tiendaLibros.inscribirDatos();
        tiendaDiscos.inscribirDatos();

        tiendaLibros.comunicarResultado();
        tiendaDiscos.comunicarResultado();

    }
}