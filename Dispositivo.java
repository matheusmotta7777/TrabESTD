public abstract class Dispositivo {
    protected int id;
    protected String nome;
    protected boolean ligado;

    public Dispositivo(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }

    public abstract String executarAcao();
}
