package com.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Videogame> videogamesCatalogue = new ArrayList<>();
        List<Player> playersList = new ArrayList<>();
        generateDefaultVideogames(videogamesCatalogue);

        System.out.println("\n<<< PLATAFORMA DE GESTIÓN DE VIDEOJUEGOS Y JUGADORES >>>\n");
        
        showMenu(videogamesCatalogue, playersList);
    
    }

    public static void showMenu(List<Videogame> videogamesCataloue, List<Player> playersList)
    {
        boolean p = false;
        Scanner sca = new Scanner(System.in);

        do { 
            System.err.println("1. Listar catálogo de videojuegos.");
            System.err.println("2. Crear videojuego");
            System.err.println("3. Registrar jugador");
            System.err.println("4. Mostrar jugadores");
            System.err.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            int opt = sca.nextInt();

            switch (opt) {
                case 1:
                    listVideogamesCatalogue(videogamesCataloue);
                    break;
                case 2:
                    createNewVideogame(videogamesCataloue);
                    break;
                case 3:
                    addNewPlayer(playersList, videogamesCataloue);
                    break;
                case 4:
                    listAllPlayers(playersList);
                    break;
                case 5:
                    p = true;
                    break;
            }
        } while (!p);


    }

    // Generamos videojuegos por defecto
    public static void generateDefaultVideogames(List<Videogame> videogamesCataloue)
    {   
        RolVideogame rv1 = new RolVideogame(60, "From Software", 60.0, "Elden Ring");
        ShotsVideogame sv1 = new ShotsVideogame(true, "Treyarch", 55.0, "Call of Duty: Modern Warfare 3");
        PuzzlesVideogame pv1 = new PuzzlesVideogame(10, "Hungry Studio", 0.99, "Block Blust");

        videogamesCataloue.add(rv1);
        videogamesCataloue.add(sv1);
        videogamesCataloue.add(pv1);
    }

    public static void createNewVideogame(List<Videogame> videogamesCataloue)
    {
        Scanner sca = new Scanner(System.in);

        System.out.print("Introduce el título del videojuego: ");
        String newTitle = sca.nextLine();
        System.out.print("Introduce el/la desarrollador/a del videojuego: ");
        String newDeveloper = sca.nextLine();
        System.out.print("Introduce el precio del videojuego: ");
        Double newPrice = sca.nextDouble();
        System.out.println("Que tipo de juego es? ");
        System.out.println("1. Rol");
        System.out.println("2. Disparos");
        System.out.println("3. Puzzles");
        System.out.print("-> ");
        int o = sca.nextInt();
        Videogame newVideogameToAdd = null;
        switch (o) {
            case 1:
                System.out.print("Introduce la duración estimada: ");
                int newDuration = sca.nextInt();
                RolVideogame nrv = new RolVideogame(newDuration, newDeveloper, newPrice, newTitle);
                newVideogameToAdd = nrv;
                break;
            case 2:
                System.out.print("Introduce si tiene modo multijugador: ");
                boolean newMultiplayer = sca.nextBoolean();
                ShotsVideogame nsv = new ShotsVideogame(newMultiplayer, newDeveloper, newPrice, newTitle);
                newVideogameToAdd = nsv;
                break;
            case 3:
                System.out.print("Introduce la cantidad de niveles: ");
                int newLvlsQuantity = sca.nextInt();
                PuzzlesVideogame npv = new PuzzlesVideogame(newLvlsQuantity, newDeveloper, newPrice, newTitle);
                newVideogameToAdd = npv;
                break;
        }
        videogamesCataloue.add(newVideogameToAdd); 
    }

    public static void listVideogamesCatalogue(List<Videogame> videogamesCataloue)
    {
        System.out.println();
        for (Videogame videogame : videogamesCataloue) {
            System.out.println(videogame.toString());
        }
        System.out.println();
    }

    public static void addNewPlayer(List<Player> playersList, List<Videogame> videogamesCatalogue)
    {
        Scanner sca = new Scanner(System.in);
        List<Videogame> playersBoughtVideogames = new ArrayList<>();

        System.out.print("Introduce el nombre del usuario: ");
        String newPlayersName = sca.nextLine();
        System.out.print("Introduce la edad del jugador: ");
        int newPlayersAge = sca.nextInt();
        System.out.println("-> LISTA DE JUEGOS DISPONIBLES");
        int index = 0;
        for (Videogame videogame : videogamesCatalogue) {
            System.out.println(index + ". " + videogame.getTitle());
            index++;
        }
        System.out.println("Selecciona un juego para añadir a la lista del jugador: ");
        int selectedVideogame = sca.nextInt();

        playersBoughtVideogames.add(videogamesCatalogue.get(selectedVideogame));

        Player newPlayer = new Player(newPlayersAge, newPlayersName, playersBoughtVideogames);

        playersList.add(newPlayer);
    }

    public static void listAllPlayers(List<Player> playersList)
    {
        int index = 0;
        for (Player player : playersList) {
            System.out.println(index + ". " + player.getName());
        }
    }
}