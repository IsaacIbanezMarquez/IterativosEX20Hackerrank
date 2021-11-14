
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



// ENUNCIADO:

// Descomposició factorial:

/* Fes un programa que llegeixi un nombre enter N positiu i escrigui la seva descomposició en producte de nombres primers de forma ascendent. Limitem els factors primers a analitzar fins a 11 (2,3,5,7,11)

Input Format

N: nombre enter positiu.

Constraints

NO n'hi ha.

Output Format

Escriu la descomposició per factors del més petit al més gran.

Sample Input 0

12
Sample Output 0

2 2 3
Sample Input 1

20
Sample Output 1

2 2 5
Sample Input 2

25
Sample Output 2

5 5
Sample Input 3

5
Sample Output 3

5

 */



public class Solution
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        int nombre = sc.nextInt();
        int factorPrimer = 2;

        while (nombre != 1)
        {
            if(nombre%factorPrimer==0)
            {
                nombre = nombre/factorPrimer;
                System.out.print(factorPrimer);
                System.out.print(" ");
            }
            else factorPrimer++;
        }
    }
}
