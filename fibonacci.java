public class fibonacci{
    public static void main(String[]args){
        int n = 10;
        int primeiro = 0;
        int segundo = 1;
        int proximo;

        System.out.print(primeiro + " " + segundo + " ");
        
        for( int i = 2; i < n; i++){
            proximo = primeiro + segundo;
            System.out.print(proximo + " ");
            
            primeiro = segundo;
            segundo = proximo;

        }



    }
}