public class Ejer_50 extends Base {
    public static void main(String[] args) {
        
        String car_plate ="";
        String day_of_week ="";
        char weekday = '?';
        String cities = "";
        char last_digit_of_plate = '?';

        screen.println("segun la placa y el dia de la semana vamos a arrojar las ciudades con pico y placa, por favor digite la placa de 6 digitos: ");
        car_plate=keyboard.nextLine();
        screen.println("Ingrese el dia de la semana de lunes a viernes: ");
        day_of_week=keyboard.nextLine();

        last_digit_of_plate = car_plate.charAt(5);

       
        if(day_of_week.equalsIgnoreCase("lunes"))
            weekday = 'L';
        else if(day_of_week.equalsIgnoreCase("martes"))
            weekday = 'M';
        else if(day_of_week.equalsIgnoreCase("miercoles"))
            weekday = 'X';
        else if(day_of_week.equalsIgnoreCase("jueves"))
            weekday = 'J';
        else if(day_of_week.equalsIgnoreCase("viernes"))
            weekday = 'V';
        
        if  ((weekday == 'L' && (last_digit_of_plate == '0' || last_digit_of_plate == '1')) ||
            (weekday == 'M' && (last_digit_of_plate == '2' || last_digit_of_plate == '3')) ||
            (weekday == 'X' && (last_digit_of_plate == '4' || last_digit_of_plate == '5')) ||
            (weekday == 'J' && (last_digit_of_plate == '6' || last_digit_of_plate == '7')) ||
            (weekday == 'V' && (last_digit_of_plate == '8' || last_digit_of_plate == '9')) 
            )
            {cities += "Manizales, ";}
        
        if((weekday == 'L' && (last_digit_of_plate == '0' || last_digit_of_plate == '9')) ||
            (weekday == 'M' && (last_digit_of_plate == '1' || last_digit_of_plate == '8')) ||
            (weekday == 'X' && (last_digit_of_plate == '2' || last_digit_of_plate == '7')) ||
            (weekday == 'J' && (last_digit_of_plate == '3' || last_digit_of_plate == '6')) ||
            (weekday == 'V' && (last_digit_of_plate == '4' || last_digit_of_plate == '5'))
        )
        {cities += "Pereira, ";}
        
         if((weekday == 'L' && (last_digit_of_plate == '8' || last_digit_of_plate == '9')) ||
            (weekday == 'M' && (last_digit_of_plate == '6' || last_digit_of_plate == '7')) ||
            (weekday == 'X' && (last_digit_of_plate == '4' || last_digit_of_plate == '5')) ||
            (weekday == 'J' && (last_digit_of_plate == '2' || last_digit_of_plate == '3')) ||
            (weekday == 'V' && (last_digit_of_plate == '0' || last_digit_of_plate == '1'))
        )
        {cities += "Medellin, ";}

        if((weekday == 'L' && (last_digit_of_plate == '1' || last_digit_of_plate == '2')) ||
            (weekday == 'M' && (last_digit_of_plate == '3' || last_digit_of_plate == '4')) ||
            (weekday == 'X' && (last_digit_of_plate == '5' || last_digit_of_plate == '6')) ||
            (weekday == 'J' && (last_digit_of_plate == '7' || last_digit_of_plate == '8')) ||
            (weekday == 'V' && (last_digit_of_plate == '9' || last_digit_of_plate == '0'))
        )
        {cities += "Barranquilla, ";}

        if((weekday == 'L' && (last_digit_of_plate == '8' || last_digit_of_plate == '9')) ||
            (weekday == 'M' && (last_digit_of_plate == '0' || last_digit_of_plate == '7')) ||
            (weekday == 'X' && (last_digit_of_plate == '2' || last_digit_of_plate == '3')) ||
            (weekday == 'J' && (last_digit_of_plate == '4' || last_digit_of_plate == '5')) ||
            (weekday == 'V' && (last_digit_of_plate == '6' || last_digit_of_plate == '7'))
        )
        {cities += "Armenia, ";}

        if((weekday == 'L' && (last_digit_of_plate == '2' || last_digit_of_plate == '7')) ||
            (weekday == 'M' && (last_digit_of_plate == '3' || last_digit_of_plate == '8')) ||
            (weekday == 'X' && (last_digit_of_plate == '8' || last_digit_of_plate == '9')) ||
            (weekday == 'J' && (last_digit_of_plate == '0' || last_digit_of_plate == '5')) ||
            (weekday == 'V' && (last_digit_of_plate == '1' || last_digit_of_plate == '6'))
        )
        {cities += "Bogota, ";}

        if((weekday == 'L' && (last_digit_of_plate == '3' || last_digit_of_plate == '4')) ||
            (weekday == 'M' && (last_digit_of_plate == '5' || last_digit_of_plate == '6')) ||
            (weekday == 'X' && (last_digit_of_plate == '7' || last_digit_of_plate == '8')) ||
            (weekday == 'J' && (last_digit_of_plate == '9' || last_digit_of_plate == '0')) ||
            (weekday == 'V' && (last_digit_of_plate == '1' || last_digit_of_plate == '2'))
        )
        {cities += "Bucaramanga, ";}

        if((weekday == 'L' && (last_digit_of_plate == '1' || last_digit_of_plate == '6')) ||
            (weekday == 'M' && (last_digit_of_plate == '2' || last_digit_of_plate == '7')) ||
            (weekday == 'X' && (last_digit_of_plate == '3' || last_digit_of_plate == '8')) ||
            (weekday == 'J' && (last_digit_of_plate == '4' || last_digit_of_plate == '9')) ||
            (weekday == 'V' && (last_digit_of_plate == '0' || last_digit_of_plate == '5'))
        )
        {cities += "Cartagena, ";}

        screen.println("Las ciudades son: " + cities);
    
    }
    
}
