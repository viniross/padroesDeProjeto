public class App {
    public static void main(String[] args) {
        Dado d6 = DadoFactory.criar("d6"
        Dado d20 = DadoFactory.criar("d20")
        )
        d6.rolar();
        d20.rolar();
        System.out.println("D6: " + d6.getValor());
        System.out.println("D20: " + d20.getValor());
    }
}
