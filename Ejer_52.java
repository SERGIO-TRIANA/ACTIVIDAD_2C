public class Ejer_52 extends Base{
    public static void main(String[] args) {
        String[] player_name = {"", "", "", "", "", "", "", "" };
        String[] player_name_game = {"", "", "", "", "", "", ""};
        String result = "";


        screen.println("Ingrese el nombre de la judadora #1");
        player_name[0] = keyboard.nextLine();
        screen.println("Ingrese el nombre de la judadora #2");
        player_name[1] = keyboard.nextLine();
        screen.println("Ingrese el nombre de la judadora #3");
        player_name[2] = keyboard.nextLine();
        screen.println("Ingrese el nombre de la judadora #4");
        player_name[3] = keyboard.nextLine();
        screen.println("Ingrese el nombre de la judadora #5");
        player_name[4] = keyboard.nextLine();
        screen.println("Ingrese el nombre de la judadora #6");
        player_name[5] = keyboard.nextLine();
        screen.println("Ingrese el nombre de la judadora #7");
        player_name[6] = keyboard.nextLine();
        screen.println("Ingrese el nombre de la judadora #8");
        player_name[7] = keyboard.nextLine();

        screen.println("Partido #1 " + player_name[0] + " VS " + player_name[7]);
        screen.println("ingrese el resultado de este partido (2-0, 2-1, 1-2, 0-2)");
        result = keyboard.nextLine();
        if (result.equals("2-0") || result.equals("2-1")) {
            player_name_game[0] = player_name[0];
         } else {
            player_name_game[0] = player_name[7];
         }
        screen.println("La ganadora del partido #1 es: " + player_name_game[0]);    
         
        screen.println("Partido #2 " + player_name[3] + " VS " + player_name[4]);
        screen.println("ingrese el resultado de este partido (2-0, 2-1, 1-2, 0-2)");
        result = keyboard.nextLine();
        if (result.equals("2-0") || result.equals("2-1")) {
            player_name_game[1] = player_name[3];
         } else {
            player_name_game[1] = player_name[4];
         }
        screen.println("La ganadora del partido #2 es: " + player_name_game[1]);

        screen.println("Partido #3 " + player_name[5] + " VS " + player_name[2]);
        screen.println("ingrese el resultado de este partido (2-0, 2-1, 1-2, 0-2)");
        result = keyboard.nextLine();
        if (result.equals("2-0") || result.equals("2-1")) {
            player_name_game[2] = player_name[5];
         } else {
            player_name_game[2] = player_name[2];
         }
        screen.println("La ganadora del partido #3 es: " + player_name_game[2]);

        screen.println("Partido #4 " + player_name[6] + " VS " + player_name[1]);
        screen.println("ingrese el resultado de este partido (2-0, 2-1, 1-2, 0-2)");
        result = keyboard.nextLine();
        if (result.equals("2-0") || result.equals("2-1")) {
            player_name_game[3] = player_name[6];
         } else {
            player_name_game[3] = player_name[1];
         }
        screen.println("La ganadora del partido #4 es: " + player_name_game[3]);
        
        screen.println("Partido #5 semifinal " + player_name_game[0] + " VS " + player_name_game[1]);
        screen.println("ingrese el resultado de este partido (2-0, 2-1, 1-2, 0-2)");
        result = keyboard.nextLine();
        if (result.equals("2-0") || result.equals("2-1")) {
            player_name_game[4] = player_name_game[0];
         } else {
            player_name_game[4] = player_name_game[1];
         }
        screen.println("La ganadora del partido #5 o semifinal es: " + player_name_game[4]);
        
        screen.println("Partido #6 semifinal " + player_name_game[2] + " VS " + player_name_game[3]);
        screen.println("ingrese el resultado de este partido (2-0, 2-1, 1-2, 0-2)");
        result = keyboard.nextLine();
        if (result.equals("2-0") || result.equals("2-1")) {
            player_name_game[5] = player_name_game[2];
         } else {
            player_name_game[5] = player_name_game[3];
         }
        screen.println("La ganadora del partido #6 o semifinal es: " + player_name_game[5]);

        screen.println("Partido #7 o final " + player_name_game[4] + " VS " + player_name_game[5]);
        screen.println("ingrese el resultado de este partido (2-0, 2-1, 1-2, 0-2)");
        result = keyboard.nextLine();
        if (result.equals("2-0") || result.equals("2-1")) {
            player_name_game[6] = player_name_game[4];
         } else {
            player_name_game[6] = player_name_game[5];
         }
        screen.println("La ganadora del partido #7 o final es: " + player_name_game[6]);

        }

    }
    

