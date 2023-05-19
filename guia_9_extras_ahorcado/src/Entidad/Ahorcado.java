/*
 Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas
y la cantidad jugadas máximas que puede realizar el usuario.
 */
package Entidad;

/*
 * @author Mariano Benegas
 */
public class Ahorcado {
    private String [] vec;     
    private int encontradas;
    private int jugadasMaxima;

    public Ahorcado() {
    }

    public Ahorcado(int encontradas, int jugadasMaxima) {
        this.encontradas = encontradas;
        this.jugadasMaxima = jugadasMaxima;
    }

    public String[] getVec() {
        return vec;
    }

    public void setVec(String[] vec) {
        this.vec = vec;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getJugadasMaxima() {
        return jugadasMaxima;
    }

    public void setJugadasMaxima(int jugadasMaxima) {
        this.jugadasMaxima = jugadasMaxima;
    }
    
    
}
