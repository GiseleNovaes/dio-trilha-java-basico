package estudos.gisele;
public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nomeUm = "Gisele";
      //  String nomeDois = "Gisele";
        String nomeDois = new String("Gisele");

        System.out.println(nomeUm == nomeDois);

        System.out.println(nomeUm.equals(nomeDois));  /*Quando precisamos guardar objetos na memória usamos equals. Temos dois objetos e esse método compara se eles são iguais, para números podemos usar operadores relacionais e para comparar objetos usamos equals.*/



        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("A nossa condição é verdadeira!");
        }

        System.out.println("numeroUm é igual a numeroDois? "+ simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? "+ simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que  numeroDois? "+ simNao);

    }
}
