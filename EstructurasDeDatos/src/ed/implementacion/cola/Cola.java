package ed.implementacion.cola;

import ed.implementacion.lista.Lista;

/**
 * FIFO
 *
 * @author omar mendoza
 *
 * @param <T>
 */
public class Cola<T> {

    private Lista<T> lista;

    public Cola() {
        lista = new Lista<>();
    }

    public void insertar(T valor) {
        lista.agregarAlFinal(valor);
    }

    public T obtener() {
        return lista.obtenerPrimero();
    }

    public boolean esVacia() {
        return lista.esVacia();
    }

    public void limpia() {
        lista.limpia();
    }

    public void mostrar() {
        lista.mostrar();
    }
}
