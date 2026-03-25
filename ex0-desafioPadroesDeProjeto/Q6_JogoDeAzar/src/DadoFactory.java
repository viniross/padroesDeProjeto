public class DadoFactory {
    
    public static Dado criar(String tipo) {
        if("D6".equalsIgnoreCase(tipo)) {
            new Dado(6)
        }
        if("D20".equalsIgnoreCase(tipo)) {
            new Dado(20)
        }




    }



}
