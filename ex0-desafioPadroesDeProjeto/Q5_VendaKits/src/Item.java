public abstract class Item {
    private String nome;
    private int id;

    public Item(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public abstract double getPreco();

}
