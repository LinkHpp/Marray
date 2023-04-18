import java.util.Scanner;

public class Player {

    private String Name;
    private int Health = 20;
    private int level = 1;

    private int x = 4;
    private int y = 5;

    // Setters y Getters

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    

    // Constructor

    public Player(String name, int health) {
        Name = name;
        Health = 20;
    }

    // Metodos

    public static void InitPlayer(String[][] Map, Player pj) {
        Map[pj.getX()][pj.getY()] = "@";
    }

    public static String MovingPlayer(String[][] Map, Player pj) {
        Scanner in = new Scanner(System.in);
        int y = pj.y;
        int x = pj.x;

        String select = in.nextLine();

        if (select.equals("up")){
            pj.x--;
        } else if (select.equals("down")) {
            pj.x++;
        } else if (select.equals("left")) {
            pj.y--;
        } else if (select.equals("right")) {
            pj.y++;
        }

        return Map[x][y] = " ";
    }

    public static String PrintPlayer(String[][] Map, Player pj) {
        return Map[pj.x][pj.y] = "@";
    }


    public static int LoseHealth(Player pj){
        return pj.Health--;
    }


    public static void printPlayerStats(Player pj){
        System.out.println("Name: " + pj.getName());
        System.out.println("Health: " + pj.getHealth());
        System.out.println("Level: " + pj.getLevel());
        System.out.println("X: " + pj.getX());
        System.out.println("Y: " + pj.getY());
    }

    public static void readCartel(Cartel sign, Map Sala, Player pj){
        
        if(pj.getX()+1 == sign.getX()){
            System.out.println(sign.getTexto());
        }else if(pj.getX()-1 == sign.getX()){
            System.out.println(sign.getTexto());
        }else if(pj.getY()+1 == sign.getY()){
            System.out.println(sign.getTexto());
        }else if(pj.getY()-1 == sign.getY()){
            System.out.println(sign.getTexto());
        }else{
            System.out.println("No hay nada que se pueda leer");
        }
        
    }

    

}
