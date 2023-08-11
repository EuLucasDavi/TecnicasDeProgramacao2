# CLASSE BASE DE VEICULO
class Veiculo:
    def __init__(self, modelo):
       self.modelo = modelo

    def mostrarDetalhes(self):
        print(f"Modelo: {self.modelo}")

#SUBCLASSES DE VEICULO
class Carro(Veiculo):
    def __init__(self, modelo):
        super().__init__(modelo)
    
class Moto(Veiculo):
    def __init__(self, modelo):
        super().__init__(modelo)

#FABRICA ABSTRATA DE VEICULO
class FabricaDeVeiculos:
    def criarVeiculo(self, modelo):
        raise NotImplementedError("O método criarVeiculo deve ser implementado pela subclasse")

#FABRICA CONCRETA DE CARROS
class FabricaDeCarros(FabricaDeVeiculos):
    def criarVeiculo(self, modelo):
        return Carro(modelo)

#FABRICA CONCRETA DE MOTOS
class FabricaDeMotos(FabricaDeVeiculos):
    def criarVeiculo(self, modelo):
        return Moto(modelo)


#USO DAS FABRICAS #######################

fabricaDeCarros = FabricaDeCarros()
carro = fabricaDeCarros.criarVeiculo("sedan")
carro.mostrarDetalhes()

fabricaDeMotos = FabricaDeMotos()
motos = fabricaDeMotos.criarVeiculo("bugman")
motos.mostrarDetalhes()