import java.util.Scanner;

public class Exercicio_1064 {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    double vet[] = new double[6];
    int contador = 0;
    double total = 0;
    
    for(int i=0; i<6; i++) {
        vet[i] = s.nextDouble();
        if(vet[i]>0) {
            contador++;
            total = (total+vet[i]);
        }    
    }
    
    total/=contador;
  
    System.out.println(String.format("%d valores positivos", contador));
    System.out.println(String.format("%.1f",total));
    s.close();
}

}