public class Ejer_51 extends Base{
    public static void main(String[] args) {
        
        int number = 0;
        String units_roman_numbers = "";
        String tens_roman_numbers = "";
        String hundreds_roman_numbers = "";
        String thousands_roman_numbers = "";

        screen.println("dado un numero del 1 al 3999 vamos a representarlo como numero romano por favor ingrese un numero: ");
        number = keyboard.nextInt();

        if (number/1000 == 3)
            thousands_roman_numbers = "MMM";
        else if (number/1000 == 2) 
            thousands_roman_numbers = "MM";
        else if (number/1000 == 1)
            thousands_roman_numbers = "M";

        number = number % 1000;

        if (number/100 == 1)
            hundreds_roman_numbers = "C";
        else if (number/100 == 2)
            hundreds_roman_numbers = "CC";
        else if (number/100 == 3)
            hundreds_roman_numbers = "CCC";
        else if (number/100 == 4)
            hundreds_roman_numbers = "CD";
        else if (number/100 == 5)
            hundreds_roman_numbers = "D";
        else if (number/100 == 6)
            hundreds_roman_numbers = "DC";
        else if (number/100 == 7)
            hundreds_roman_numbers = "DCC";
        else if (number/100 == 8)
            hundreds_roman_numbers = "DCCC";
        else if (number/100 == 9)
            hundreds_roman_numbers = "CM";
       
        number = number%100;

        if (number/10 == 1) 
            tens_roman_numbers = "X";
        else if (number/10 == 2) 
            tens_roman_numbers = "XX";
        else if (number/10 == 3) 
            tens_roman_numbers = "XXX";    
        else if (number/10 == 4) 
            tens_roman_numbers = "XL";    
        else if (number/10 == 5) 
            tens_roman_numbers = "L";
        else if (number/10 == 6) 
            tens_roman_numbers = "LX";
        else if (number/10 == 7) 
            tens_roman_numbers = "LXX";  
        else if (number/10 == 8) 
            tens_roman_numbers = "LXXX";
        else if (number/10 == 9) 
            tens_roman_numbers = "XC";
        
        if (number%10 == 1)
            units_roman_numbers = "I";
        else if (number%10 == 2)
            units_roman_numbers = "II";
        else if (number%10 == 3)
            units_roman_numbers = "III";
        else if (number%10 == 4)
            units_roman_numbers = "IV";
        else if (number%10 == 5)
            units_roman_numbers = "V";
        else if (number%10 == 6)
            units_roman_numbers = "VI";
        else if (number%10 == 6)
            units_roman_numbers = "VII";
        else if (number%10 == 8)
            units_roman_numbers = "VIII";
        else if (number%10 == 9)
            units_roman_numbers = "IX";
        

        screen.println("El numero representado en numero romano es: " +thousands_roman_numbers + hundreds_roman_numbers + tens_roman_numbers + units_roman_numbers);
            
        }
    }
