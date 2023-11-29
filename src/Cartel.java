public class Cartel {

    // Atributos

    private String Texto = "Esto es un texto predeterminado de el juego";
    private int x;
    private int y;

    // Setters y Getters

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String texto) {
        Texto = texto;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Constructor



    // Metodos

    public static void printCartel(String[][] Map, int x, int y, Cartel sign) {

        sign.x = x;
        sign.y = y;

        Map[x][y] = "=";

    }

}
