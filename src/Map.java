public class Map {
    

    public static void CreateMap(String[][] Map, Cartel sign){


        // Crea un cuadrado entero de #
        for(int j = 0; j < 10; j++){
            for(int i = 0; i < 12; i++){
                Map[j][i] = "#";
            }
        }

        // Vacia el cuadrado interior
        for(int j = 1; j < 9; j++){
            for(int i = 1; i < 11; i++){
                Map[j][i] = " ";
            }
        }

        Cartel.printCartel(Map, 3, 3, sign);


    }

 
    public static void printSala(String[][] Map){
        for(int j = 0; j < 10; j++){
            for(int i = 0; i < 12; i++){
               System.out.print(Map[j][i]);System.out.print(" ");
            }
        System.out.println("");
        }
    }




    



}
