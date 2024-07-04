package Aula_01;

public class App {
    public static void main(String[] args) {
        // Iphone 12, tela de 6.1", 256gb
        // Galaxy Note 20 Ultra, tela de 6.9", 256gb
        // Xiaomi Mi 11 Pro, tela de 6.81", 128gb


       //Declarando um objeto do tipo Celular = Instanciando um objeto
       Celular celularA = new Celular();
       celularA.nome = "Iphone12";
       celularA.tamanhodeTela = 6.1f;
       celularA.armazenamento = 256;
       celularA.sistemaOperacional = "IOS";

        System.out.println("Nome: " + celularA.nome);
        System.out.println("tamanhodeTela: " + celularA.tamanhodeTela);
        System.out.println("armazenamento: " + celularA.armazenamento);
        System.out.println("sistemaOperacional: " + celularA.sistemaOperacional);

    }
}
