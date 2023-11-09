public class Ejer_53 extends Base{
    public static void main(String[] args) {
        String roman_number = "";
        String temporary_roman_number = "";
        int arabic_number = 0;

        screen.println("Ingrese un numero romaro entre I (1) y MMMCMXCIX (3999)");
        roman_number = keyboard.nextLine().trim().toUpperCase();//trim para borrar los espacios toUpperCase para tomar todo como mayuscula
        temporary_roman_number = roman_number;

        if (temporary_roman_number.startsWith("MMM")) {       //starWith inicia con solo para validar desde el comienzo
            arabic_number += 3000;
            temporary_roman_number=temporary_roman_number.substring(3); // aca vamos corriendo de espacios para tenerla lista para calcular la proxima variable
        }
        else if (temporary_roman_number.startsWith("MM")) {
            arabic_number += 2000;
            temporary_roman_number=temporary_roman_number.substring(2);
        }
        else if (temporary_roman_number.startsWith("M")) {
            arabic_number +=1000;
            temporary_roman_number=temporary_roman_number.substring(1);
        }
        if (temporary_roman_number.startsWith("CM")) {
            arabic_number +=900;
            temporary_roman_number=temporary_roman_number.substring(2);
        }
        else if (temporary_roman_number.startsWith("DCCC")) {
            arabic_number +=800;
            temporary_roman_number=temporary_roman_number.substring(4);
        }    
        else if (temporary_roman_number.startsWith("DCC")) {
            arabic_number +=700;
            temporary_roman_number=temporary_roman_number.substring(3);
        } 
        else if (temporary_roman_number.startsWith("DC")) {
            arabic_number +=600;
            temporary_roman_number=temporary_roman_number.substring(2);
        } 
        else if (temporary_roman_number.startsWith("D")) {
            arabic_number +=500;
            temporary_roman_number=temporary_roman_number.substring(1);
        } 
        else if (temporary_roman_number.startsWith("CD")) {
            arabic_number +=400;
            temporary_roman_number=temporary_roman_number.substring(2);
        } 
        else if (temporary_roman_number.startsWith("CCC")) {
            arabic_number +=300;
            temporary_roman_number=temporary_roman_number.substring(3);
        } 
        else if (temporary_roman_number.startsWith("CC")) {
            arabic_number +=200;
            temporary_roman_number=temporary_roman_number.substring(2);
        }
        else if (temporary_roman_number.startsWith("C")) {
            arabic_number +=100;
            temporary_roman_number=temporary_roman_number.substring(1);
        }
        if (temporary_roman_number.startsWith("XC")) {
            arabic_number +=90;
            temporary_roman_number=temporary_roman_number.substring(2);
        }
        else if (temporary_roman_number.startsWith("LXXX")) {
            arabic_number +=80;
            temporary_roman_number=temporary_roman_number.substring(4);
        }
        else if (temporary_roman_number.startsWith("LXX")) {
            arabic_number +=70;
            temporary_roman_number=temporary_roman_number.substring(3);
        }
        else if (temporary_roman_number.startsWith("LX")) {
            arabic_number +=60;
            temporary_roman_number=temporary_roman_number.substring(2);
        }
        else if (temporary_roman_number.startsWith("L")) {
            arabic_number +=50;
            temporary_roman_number=temporary_roman_number.substring(1);
        }
        else if (temporary_roman_number.startsWith("XL")) {
            arabic_number +=40;
            temporary_roman_number=temporary_roman_number.substring(2);
        }
        else if (temporary_roman_number.startsWith("XXX")) {
            arabic_number +=30;
            temporary_roman_number=temporary_roman_number.substring(3);
        }
        else if (temporary_roman_number.startsWith("XX")) {
            arabic_number +=20;
            temporary_roman_number=temporary_roman_number.substring(2);
        }
        else if (temporary_roman_number.startsWith("X")) {
            arabic_number +=10;
            temporary_roman_number=temporary_roman_number.substring(1);
        }
        if (temporary_roman_number.startsWith("IX")) {
            arabic_number +=9;
        }
        else if (temporary_roman_number.startsWith("VIII")) {
            arabic_number +=8;
        }
        else if (temporary_roman_number.startsWith("VII")) {
            arabic_number +=7;
        }
        else if (temporary_roman_number.startsWith("VI")) {
            arabic_number +=6;
        }
        else if (temporary_roman_number.startsWith("V")) {
            arabic_number +=5;
        }
        else if (temporary_roman_number.startsWith("IV")) {
            arabic_number +=4;
        }
        else if (temporary_roman_number.startsWith("III")) {
            arabic_number +=3;
        }
        else if (temporary_roman_number.startsWith("II")) {
            arabic_number +=2;
        }
        else if (temporary_roman_number.startsWith("I")) {
            arabic_number +=1;
        }
        screen.println("el numero es: " + arabic_number);

    }
    
}
