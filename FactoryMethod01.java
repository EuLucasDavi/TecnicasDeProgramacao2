// CLASSE BASE DE VEICULO
class Veiculo {
    public String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public void mostrarDetalhes() {
        System.out.println("Modelo: " + this.modelo);
    }
}

// SUBCLASSES DE VEICULO

class Carro extends Veiculo {
    public Carro(String modelo) {
        super(modelo);
    }
}

class Moto extends Veiculo {
    public Moto(String modelo) {
        super(modelo);
    }
}

class Bicicleta extends Veiculo {
    public Bicicleta(String modelo) {
        super(modelo);
    }
}

// FABRICA ABSTRATA DE VEICULO

abstract class FabricaDeVeiculos {
    public abstract Veiculo criarVeiculo(String modelo);
}

// FABRICA CONCRETA DE CARROS

class FabricaDeCarros extends FabricaDeVeiculos {
    public Veiculo criarVeiculo(String modelo) {
        return new Carro(modelo);
    }
}

// FABRICA CONCRETA DE MOTOS

class FabricaDeMotos extends FabricaDeVeiculos {
    public Veiculo criarVeiculo(String modelo) {
        return new Moto(modelo);
    }
}

// FABRICA CONCRETA DE BICICLETA

class FabricaDeBicicleta extends FabricaDeVeiculos {
    public Veiculo criarVeiculo(String modelo) {
        return new Bicicleta(modelo);
    }
}

// USO DAS FABRICAS #######################

public class FactoryMethod01 {
    public static void main(String[] args) {
        FabricaDeVeiculos fabricaDeCarros = new FabricaDeCarros();
        Veiculo carro = fabricaDeCarros.criarVeiculo("Sedan");

        carro.mostrarDetalhes();

        FabricaDeVeiculos fabricaDeMotos = new FabricaDeMotos();
        Veiculo moto = fabricaDeMotos.criarVeiculo("Esportiva");

        moto.mostrarDetalhes();

        FabricaDeVeiculos fabricaDeBicicleta = new FabricaDeBicicleta();
        Veiculo bike = fabricaDeBicicleta.criarVeiculo("Kaloi");

        bike.mostrarDetalhes();
    }
}
