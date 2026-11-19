package builder;

public class Computador {
    private String processador;
    private String memoriaRam;
    private String armazenamento;
    private String placaDeVideo;
    private String sistemaOperacional;

    public Computador(String processador, String memoriaRam, String armazenamento, String placaDeVideo, String sistemaOperacional) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.placaDeVideo = placaDeVideo;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void ExibirPc() {
        System.out.println("processador: " + processador);
        System.out.println("memoriaRam: " + memoriaRam);
        System.out.println("placaDeVideo: " + placaDeVideo);
        System.out.println("sistemaOperacional: " + sistemaOperacional);
    }
}
