package exception;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException | MinhaException e) {
            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    public static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    public static void metodo2() {
        System.out.println("Ini do metodo2");
//        for (int i = 1; i <= 5; i++) {
//            int a = i / 0;
//            System.out.println(i);
//        }
        throw new MinhaException("Testando se deu erro");
        //System.out.println("Fim do metodo2");
    }
}
