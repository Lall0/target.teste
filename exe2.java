import java.util.Scanner;

public class exe2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string:");
        String input = scanner.nextLine();
        int contador = 0;

        for(char letra : input.toCharArray()){
        if (letra == 'A' || letra == 'a'){
            contador++;
        }}

        if (contador > 0) {
            System.out.println("A letra a (maiúscula ou minúscula) aparece " + contador + " na string.");
        } else {
            System.out.println("A letra a (maiúscula ou minúscula) não aparece na string.");
        }

    }}
    