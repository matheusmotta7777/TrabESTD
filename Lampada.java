public class Lampada extends Dispositivo implements Conectavel {

    public Lampada(int id, String nome) {
        super(id, nome);
    }

    @Override
    public String conectar() {
        return nome + " conectada à rede elétrica.";
    }

    @Override
    public String desconectar() {
        return nome + " desconectada da rede elétrica.";
    }

    @Override
    public String executarAcao() {
        if (ligado) {
            return nome + ": Luz acesa!";
        } else {
            return nome + ": Está desligada, não pode acender.";
        }
    }
}
