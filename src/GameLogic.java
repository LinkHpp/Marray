public class GameLogic {
    
    static Player pj = new Player("Sata", 20);
    static String Sala[][] = new String[10][12];
    static Cartel sign = new Cartel();


    public static void game(){
        Map.CreateMap(Sala, sign);        

        Player.InitPlayer(Sala, pj);


        do {
            
            clearScreen();
            System.out.println("****Marray Dungeon****");
            System.out.println();
            Map.printSala(Sala);
            Player.printPlayerStats(pj);
            Player.MovingPlayer(Sala, pj);
            Player.PrintPlayer(Sala, pj);
            
            
           
        } while (pj.getHealth() != 0);
        
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 

    

}
