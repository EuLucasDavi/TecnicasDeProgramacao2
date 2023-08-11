// CLASSE BASE DE VEICULO
class Veiculo {
    constructor(modelo) {
        this.modelo = modelo;
    }

    mostrarDetalhes() {
        console.log(`Modelo: ${this.modelo}`);
    }
}


//SUBCLASSES DE VEICULO

class Carro extends Veiculo {
    constructor(modelo) {
        super(modelo);
    }
}

class Moto extends Veiculo {
    constructor(modelo) {
        super(modelo);
    }
}

class Bicicleta extends Veiculo {
    constructor(modelo) {
        super(modelo);
    }
}

//FABRICA ABSTRATA DE VEICULO

class FabricaDeVeiculos{
    criarVeiculo(modelo){
        throw new Error('O método criarVeiculo deve ser implementado pela subclasse');
    }
}



//FABRICA CONCRETA DE CARROS

class FabricaDeCarros extends FabricaDeVeiculos{
    criarVeiculo(modelo){
        return new Carro(modelo);
    }
}

//FABRICA CONCRETA DE MOTOS

class FabricaDeMotos extends FabricaDeVeiculos{
    criarVeiculo(modelo){
        return new Moto(modelo);
    }
}


//FABRICA CONCRETA DE BICICLETA

class FabricaDeBicicleta extends FabricaDeVeiculos{
    criarVeiculo(modelo){
        return new Bicicleta(modelo);
    }
}

//USO DAS FABRICAS #######################

const fabricaDeCarros = new FabricaDeCarros();
const carro = fabricaDeCarros.criarVeiculo('Sedan');

carro.mostrarDetalhes();

const fabricaDeMotos = new FabricaDeMotos();
const moto = fabricaDeMotos.criarVeiculo('Esportiva');

moto.mostrarDetalhes();