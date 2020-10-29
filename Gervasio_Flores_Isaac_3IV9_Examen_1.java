
import java.util.Scanner;

public class Gervasio_Flores_Isaac_3IV9_Examen_1 {

    public static void main(String[] args) throws InterruptedException{
        
      
        Scanner scann;

        
            System.out.println("Presione 1  para ver a Charmander en la Pokedex ");
            System.out.println("Presione 2  para ver a Bulbasaor en la Pokedex ");
            System.out.println("Presione 3  para ver a Squartle en la Pokedex ");
            System.out.println("Presione 4  para Seleccionar Jugadores y Empezar cobate ");
           

            System.out.println("  ");
            System.out.println("**************************************");
            System.out.println("  ");
            

            String menu1;
            int valorDadoTemp; //, valorDado1,valorDado2 = 0;

            do {
                
                System.out.println("**** PARA SALIR OPRIME  m   ********");
                menu1 = "";
                scann = new Scanner(System.in);
                menu1 = scann.nextLine();

                valorDadoTemp = (int) Math.floor(Math.random() * 3 + 1);
                String valorDado1 = Integer.toString(valorDadoTemp);

                valorDadoTemp = (int) Math.floor(Math.random() * 3 + 1);
                String valorDado2 = Integer.toString(valorDadoTemp);
                //System.out.println("valorDado1 : " + valorDado1 + "|  valorDado2 : " + valorDado2);        

                int[] datosPok1 = new int[4];
                String[] nomPok1 = new String[3];
                int[] datosPok2 = new int[4];
                String[] nomPok2 = new String[3];

                switch (menu1) {

                    //MUESTRA DETALLES DE POKEMONES
                    case "1":

                        System.out.println("ID de Pokemon: 1");
                        System.out.println("Nombre: Charmander");
                        System.out.println("Fuerza: 5");
                        System.out.println("Vida: 20");
                        System.out.println("Ataque_principal: ateque con cola");
                        System.out.println("Ataque_secundario: garras filosas");

                        break;
                    case "2":
                        System.out.println("ID de Pokemon: 2");
                        System.out.println("Nombre: Bulbasaor");
                        System.out.println("Fuerza: 27");
                        System.out.println("Vida: 7");
                        System.out.println("Ataque_principal: ataque veloz");
                        System.out.println("Ataque_secundario: super rayo");
                        break;

                    case "3":
                        System.out.println("ID de Pokemon: 3");
                        System.out.println("Nombre: Squartle");
                        System.out.println("Fuerza: 10");
                        System.out.println("Vida: 10");
                        System.out.println("Ataque_principal:  ataque agua");
                        System.out.println("Ataque_secundario: hielo hiper");
                        break;

                    //SELECCIONA POKEMONES AL RANDOM Y PELEAN
                    case "4":
                        System.out.println(" ");
                        System.out.println("POKEMONES A PELEAR ... ");
                        System.out.println(" ");
                      switch (valorDado1) {

                            case "1":

                                System.out.println("Nombre: Charmander");
                                nomPok1[0] = "Charmander";
                                System.out.println("Fuerza: 5");
                                datosPok1[0] = 5;
                                System.out.println("Vida: 20");
                                datosPok1[1] = 20;

                                break;

                            case "2":

                                System.out.println("Nombre: Bulbasaor");
                                nomPok1[0] = "Bulbasaor";
                                System.out.println("Fuerza: 27");
                                datosPok1[0] = 27;
                                System.out.println("Vida: 7");
                                datosPok1[1] = 7;

                                break;

                            case "3":

                                System.out.println("Nombre: Squartle");
                                nomPok1[0] = "Squartle";
                                System.out.println("Fuerza: 10");
                                datosPok1[0] = 10;
                                System.out.println("Vida: 10");
                                datosPok1[1] = 10;

                                break;
                                

                        }

                        switch (valorDado2) {

                            case "1":

                                System.out.println("Nombre: Charmander");
                                nomPok2[0] = "Charmander";
                                System.out.println("Fuerza: 5");
                                datosPok2[0] = 5;
                                System.out.println("Vida: 20");
                                datosPok2[1] = 20;

                                break;

                            case "2":

                                System.out.println("Nombre: Bulbasaor");
                                nomPok2[0] = "Bulbasaor";
                                System.out.println("Fuerza: 27");
                                datosPok2[0] = 27;
                                System.out.println("Vida: 7");
                                datosPok2[1] = 7;

                                break;

                            case "3":

                                System.out.println("Nombre: Squartle");
                                nomPok2[0] = "Squartle";
                                System.out.println("Fuerza: 10");
                                datosPok2[0] = 10;
                                System.out.println("Vida: 10");
                                datosPok2[1] = 10;

                                break;
                                
                                

                        }

                    
                        System.out.println("Pokemon 1 : " + nomPok1[0] + " Vs.  Pokemon 2 : " + nomPok2[0]);
                        Thread.sleep(3000);
                        System.out.println(" ");
                        System.out.println(" E M P I E Z A   P E L E A ...");
                        System.out.println(" ");
                        System.out.println(" ");
//                        int pokempieza1T = (int) Math.floor(Math.random() * 3 + 1);
//                        System.out.println("Empiza ataque : " + nomPok1[pokempieza1T]);
                        
                        
                        boolean pokCansado = true;
                        int dat1 = datosPok1[1];
                        int dat2 = datosPok2[1];
                        do {
                         
                          
                        //DADO 6 numeros                        
                        int resDados = (int) Math.floor(Math.random() * 7);
                        System.out.println("Golpe quita " + resDados + " punto(s) de vida"  );  
                        
                        
                        int resGolpes1 = dat1 - resDados;
                        int resGolpes2 = dat2 - resDados;
                        
                        System.out.println("Pokemon 1 : " + nomPok1[0]+ "| Vida Restante :" + resGolpes1);
                        System.out.println(" ");
                        System.out.println("Pokemon 2 : " + nomPok2[0]+ "| Vida Restante :" + resGolpes2);
                        System.out.println(" ");
                        System.out.println(" ");
                        Thread.sleep(2000);
                        
                          if(resGolpes1<=0){
                             pokCansado=false; 
                              System.out.println("POKEMON "+ nomPok1[0] +" CANSADO FIN DE JUEGO");
                          }else if (resGolpes2<=0){
                              pokCansado=false;
                              System.out.println("POKEMON "+ nomPok2[0] +" CANSADO FIN DE JUEGO");
                          }
                          dat1 = resGolpes1;
                          dat2 = resGolpes2;
                        }while(pokCansado);
                        

                    default:
                        break;
                }

                System.out.println(" ");
                System.out.println("******************************************************************");
                
                System.out.println("******************************************************************");

            } while (!menu1.equalsIgnoreCase("m"));

            
        
    }//main
}//clase
