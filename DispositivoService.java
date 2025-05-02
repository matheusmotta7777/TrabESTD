public class DispositivoService {

    public String ligarDispositivo(Dispositivo dispositivo) {
        dispositivo.ligar();
        return dispositivo.nome + " foi ligada.";
    }

    public String desligarDispositivo(Dispositivo dispositivo) {
        dispositivo.desligar();
        return dispositivo.nome + " foi desligada.";
    }

    public String executarAcao(Dispositivo dispositivo) {
        return dispositivo.executarAcao();
    }
}
