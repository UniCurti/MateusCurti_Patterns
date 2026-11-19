package builder;

public class Main {
    public static void main(String[] args) {

        Computador basico = new ComputadorBuilder()
                .processador("Intel Core i5")
                .ram("8GB")
                .armazenamento("256GB SSD")
                .build();

        Computador gamer = new ComputadorBuilder()
                .processador("AMD Ryzen 9 9950X3D2")
                .ram("128 GB DDR5-6000 CL30 (4×32 GB)")
                .armazenamento("Samsung 9100 PRO 8 TB NVMe PCIe 5.0")
                .placaVideo("RTX 5090 Gaming Oc 32gb")
                .sistemaOperacional("Windows 11 Pro 64 bits (26H2)")
                .build();

        System.out.println("=== Computador Básico ===");
        basico.ExibirPc();

        System.out.println();

        System.out.println("=== Computador Gamer pra jogar GTA 6 00h 19/11 ===");
        gamer.ExibirPc();
    }
}

