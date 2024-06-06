package Calculadora;
public class Calculadora {
    //MODIFICADOR DE ACESSO - TIPO DE RETORNO - ARGUMENTO//

    public  static void main(String [] arg){
        Calculadora calculadora = new Calculadora();
        //ESTANCIAR A CLASSE//
        // TIPO DE DADOS - NOME DO METODO + NEW NOVA VARIAVEL//


        calculadora.somar(1, 3);
        calculadora.subitrair(6, 3);
        calculadora.multiplicar(2, 3);
        calculadora.dividir(9, 3);
        calculadora.porcentagem(100, 10);
    }
    public  void somar(int a, int b){

        System.out.println("o resultado da soma é : "+(a+b));

    }
    public  void subitrair(int a, int b) {

        System.out.println("o resultado da subitracao é : " + (a - b));
    }

    public  void multiplicar(int a, int b) {

        System.out.println("o resultado da multiplicacao é : " + (a * b));
    }
    public  void dividir(int a, int b) {

        System.out.println("o resultado da divisao é : " + (a / b));
    }
    public void porcentagem(int a, int b){

        System.out.println("o resultado da porcentagem é : " + ((a*b) / 100 )+"%");
    }


}
