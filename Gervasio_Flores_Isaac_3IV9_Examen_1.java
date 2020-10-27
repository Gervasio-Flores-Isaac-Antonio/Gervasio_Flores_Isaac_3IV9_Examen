import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Pokemon.java;

public class Gervasio_Flores_Isaac_3IV9_Examen_1 {

    public static void main(String[] args) {
        Scanner scann;
        
        // Pokemon test = new Pokemon(id, "nombre", fueza, defensa_vida, ataque_principal, ataque_secundario);
        Pokemon Charmander = new Pokemon(1, "Charmander", 5, 20, "ateque con cola", "garras filosas");
        Pokemon Bulbasaor = new Pokemon(2, "Bulbasaor", 27, 7, "ataque veloz", "super rayo");
        Pokemon Squartle = new Pokemon(3, "Squartle", 10, 10, "ataque agua", "hielo hiper");
        
        
        System.out.println(Charmander.getId()+" Pokemon: " + Charmander.getNombre());
        System.out.println(Bulbasaor.getId()+" Pokemon: " + Bulbasaor.getNombre());
        System.out.println(Squartle.getId()+ " Pokemon: " + Squartle.getNombre());
        System.out.println("  "  );
        System.out.println("**************************************"  );
        System.out.println("  "  );
        
         
        String menu;
        do{
            menu="";
        System.out.println("Presione 1  para ver a Charmander en la Pokedex "  );
        System.out.println("Presione 2  para ver a Bulbasaor en la Pokedex "  );
        System.out.println("Presione 3  para ver a Squartle en la Pokedex "  );
        
        System.out.println("  "  );
        System.out.println("**************************************"  );
        System.out.println("  "  );
        
        scann = new Scanner(System.in);
        String pokemonDetalles = scann.nextLine();
        
        System.out.println("  "  );
        System.out.println("**************************************"  );
        System.out.println("  "  );
        
        
        if(pokemonDetalles.equalsIgnoreCase("1")){
            System.out.println("ID de Pokemon: " + Charmander.getId());
            System.out.println("Nombre: " + Charmander.getNombre());
            System.out.println("Fuerza: " + Charmander.getFuerza());
            System.out.println("Vida: " + Charmander.getDefensa_vida());
            System.out.println("Ataque_principal: " + Charmander.getAtaque_principal());
            System.out.println("Ataque_secundario: " + Charmander.getAtaque_secundario());
        } else if(pokemonDetalles.equalsIgnoreCase("2")){
            
            System.out.println("ID de Pokemon: " + Bulbasaor.getId());
            System.out.println("Nombre: " + Bulbasaor.getNombre());
            System.out.println("Fuerza: " + Bulbasaor.getFuerza());
            System.out.println("Vida: " + Bulbasaor.getDefensa_vida());
            System.out.println("Ataque_principal: " + Bulbasaor.getAtaque_principal());
            System.out.println("Ataque_secundario: " + Bulbasaor.getAtaque_secundario());
        }else if(pokemonDetalles.equalsIgnoreCase("3")){
            
            System.out.println("ID de Pokemon: " + Squartle.getId());
            System.out.println("Nombre: " + Squartle.getNombre());
            System.out.println("Fuerza: " + Squartle.getFuerza());
            System.out.println("Vida: " + Squartle.getDefensa_vida());
            System.out.println("Ataque_principal: " + Squartle.getAtaque_principal());
            System.out.println("Ataque_secundario: " + Squartle.getAtaque_secundario());
        } 
            
            
            
            
        System.out.println(" ");
            System.out.println("******************************************************************");
            System.out.println("******************************************************************");
            System.out.println("****  OPRIME S PARA REGRESAR AL MENU PRINCIPAL CUALQUIER OTRA TECLA PARA CONTINUAR  ********");
            scann = new Scanner(System.in);
            menu = scann.nextLine();
        } while (!menu.equalsIgnoreCase("s"));
        
        
       

    }//main
}//clase
