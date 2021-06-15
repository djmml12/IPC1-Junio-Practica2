import java.util.*;
public class practica2{
    public static void main(String[]args){
        practica2 p2 = new practica2();
    }
    Scanner scanner = new Scanner(System.in);
    int peli_id = 0;
    int cliente_id = 0;
    int opcion;


    public practica2(){
        int[] rentaid = new int[10];
        int[] rentaclienteid = new int[10];
        int[] trenta = new int[10];

        int[] peliid = new int[10];
        String[] pelinombre = new String[10];
        int[] peliaño = new int[10];
        String[] pelicat = new String[10];
        boolean[] pelidisp = new boolean[10];

        int[] clienteid = new int[10];
        int[] clientetel = new int[10];
        String[] clientenombre = new String[10];
        boolean[] clienterenta = new boolean[10];
    }

    while(!salir){
        System.out.println("  1. alquilar pelicula ");
        System.out.println("  2. devolucion pelicula ");
        System.out.println("  3. peliculas ");
        System.out.println("  4. ingresar peliculas ");
        System.out.println("  5. ingresar clientes ");
        System.out.println("  6. mostar clientes ");
        System.out.println("  7. salir ");

        try{

        
        System.out.println(" selecciona alguna opccion ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(" alquilar pelicula ");
                break;
            case 2:
                System.out.println(" devolución pelicula ");
                break;
            case 3:
                System.out.println(" pelicuas ");
                break;
            case 4:
                System.out.println(" ingresar peliculas ");
                break;
            case 5:
                System.out.println(" ingresar clientes ");
                break;
            case 6:
                System.out.println(" mostrar clientes ");
                break;
            case 7:
                System.out.println(" salir ");
                break;
        
            default:
            System.out.println(" opcion ");
        }

    }catch(InputMismatchException e){
        System.out.println("debes escribir un numero");
        sn.next();
        


    public void agregarcliente(String[]customersNames,int[] customersId,int[] customersPhone,boolean[] customerRentMovies){

        System.out.print(" ingresar nombre del cliente ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print(" ingresar telefono del cliente ");
        int clientetel = scanner.nextInt();
        scanner.nextLine();
            for (int i = 0;i<customersNames.length;i++){
                if(customersNames[i] == null){
                    cliente_id++; 
                    clienteid[i] = nombre;  
                    clienterent[i] = false; 
                    clientetel[i]=tel;  
                    System.out.println(" exito ");
                    break;
                }    

            }
    public void pelidisp(int[] moviesId, String[]moviesName, int[]movieYear, String[]moviesCategory,boolean[] movieAvailable){
     
        System.out.println(" peliculas disponibles ");
                
        System.out.println(" |Id|           |Name|                   |Year|                |Category|              |Available|");
                
            for(int i=0;i<moviesName.length;i++){
                if(pelidisp[i] == true){
                        System.out.printf("%-2d            %-15s       %-4d                  %-10s            %-5s%n",moviesId[i],moviesName[i],movieYear[i],moviesCategory[i],movieAvailable[i]);
                    }
                else if(pelinombre[i] == null){
                    break;
                    }
                }
        
            }    
    public void pelidisp(int[] customersId, boolean[] customerRentMovies, String[]customersNames,boolean[]movieAvailable,int[] moviesIdrent, int[] customersIdrent,int[] daysRent ){
        System.out.println(" ingresar id pelicula ");
        int peliid = scanner.nextInt();
        System.out.println(" id cliente ");
        int idcliente = scanner.nextInt();
        System.out.print(" dias de renta ");
        int trenta = scanner.nextInt();
        scanner.nextLine();
            if(((pelidisp[idMovie-1] ==true) && (customerRentMovies[idCustomer-1]==false)) && customersId[idCustomer-1]!=0){
                System.out.println(" quiere rentar esta pelicula ");
                String option = scanner.nextLine();
            if(option.equalsIgnoreCase("s")){
                pelidisponible[idMovie-1] = false;   
                clienterent[idCustomer-1]=true; 
            for(int i=0;i<customersIdrent.length;i++){
                if(customersIdrent[i]==0){
                    moviesIdrent[i] = idMovie;
                    customersIdrent[i]= idCustomer;
                    daysRent[i]=days;
                        break;
                    }
            }
                        
            System.out.println(" rentada con exito ");
            }
        }
    public void pelidecolucion(String[]customersNames,int[] customersId,int[] customersPhone,boolean[] customerRentMovies,int[] moviesId, String[]moviesName, int[]movieYear, String[]moviesCategory,boolean[] movieAvailable, int[]moviesIdrent, int[]customersIdrent, int[]daysRent){
        int option = 0;
            do{
                System.out.println("1. ver peliculas rentadas ");
                System.out.println("2. regresar pelicula rentada ");
                System.out.println("3. regresar ");
                System.out.print(" opccion: ");
                    option = scanner.nextInt();
                    if(option ==1){
                        
                        pelidispionible(moviesId, moviesIdrent, moviesName, movieAvailable, customersIdrent, customersNames, customersId,customerRentMovies, daysRent);
                           
                        }else if(option==2){
            
                            pelidevolucion(customersId, customerRentMovies, customersNames, movieAvailable,moviesIdrent,customersIdrent,daysRent,moviesName);
                        }else if(option==3){
                            System.out.println(" regresando ");
                        }else{
                            System.out.println("opccion incorrecta ");
                        }
            
                    }while(option!=3);
                    public void pelidevolucion(int[] customersId, boolean[] customerRentMovies, String[]customersNames,boolean[]movieAvailable,int[] moviesIdrent, int[] customersIdrent,int[] daysRent, String[]moviesName  ){
                        System.out.println(" id pelicula a regresar ");
                        int peliid = scanner.nextInt();
                        System.out.println(" id cliente ");
                        int clienteid = scanner.nextInt();
                        scanner.nextLine();
                        if((pelidisp[idMovie-1] !=true) && (customerRentMovies[idCustomer-1]!=false)&& moviesName[idMovie-1] != null && customersNames[idCustomer-1]!=null){
                            System.out.println(" deseas regresar la pelicula s/n ");
                            String option = scanner.nextLine();
                            if(option.equalsIgnoreCase("s")){
                                pelidisp[idMovie-1] = true;    
                                clienterenta[idCustomer-1]=false; 
                                System.out.println(" regreso exitoso ");
                            }
                        }
                
                    }    
                }    
            }    
