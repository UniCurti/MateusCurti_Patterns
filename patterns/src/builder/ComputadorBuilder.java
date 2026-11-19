package builder;


public class ComputadorBuilder {
    private String processador;
    private String ram;
    private String armazenamento;
    private String placaVideo;
    private String sistemaOperacional;

    public ComputadorBuilder processador(String processador) {
        this.processador = processador;
        return this;
    }

    public ComputadorBuilder ram(String ram) {
        this.ram = ram;
        return this;
    }

    public ComputadorBuilder armazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
        return this;
    }

    public ComputadorBuilder placaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
        return this;
    }

    public ComputadorBuilder sistemaOperacional(String so) {
        this.sistemaOperacional = so;
        return this;
    }

    public Computador build() {
        return new Computador(
                processador,
                ram,
                armazenamento,
                placaVideo,
                sistemaOperacional
        );
    }
}