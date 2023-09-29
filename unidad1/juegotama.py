import random


class Tamagotchi:
    def __init__(self, nombre):
        self.nombre = nombre
        self.hambre = 10
        self.diversion = 10
        self.bañar = 0

    def evento(self, accion):
        self.hambre -= 1
        self.diversion -= 1
        if accion == "alimentar":
            self.alimentar()
        elif accion == "jugar":
            self.jugar()

    def alimentar(self):
        print("Has alimentado a " + self.nombre)
        self.hambre += 2
        if self.hambre > 10:
           
            self.bañar += 2

        pass

    def jugar(self):
        print("Juegas con " + self.nombre)
        self.diversion += 3
       
        if self.diversion > 10:
            self.diversion = 10

    def muere(self):
        if self.bañar >= 10 or self.diversion <= 0 or self.hambre <= 0:
            return True
        else:
            return False

    def imprimir_estado(self):
        print("Hambre: " + str(self.hambre))
        print("jugar: " + str(self.diversion))
        print("limpieza: " + str(self.bañar))


def main():
    nombre = input("Ingresa el nombre de tu Tamagotchi: ")
    tamagotchi = Tamagotchi(nombre)
    while not tamagotchi.muere():
        tamagotchi.imprimir_estado()
        eleccion = ""
        while not eleccion in ["1", "2", "3"]:
            eleccion = input("""
1. Alimentar
2. Jugar
3. bañar
Elige: """)
        if eleccion == "1":
            tamagotchi.evento("alimentar")
        elif eleccion == "2":
            tamagotchi.evento("jugar")
        elif eleccion == "3":
            tamagotchi.evento("bañar")
    print(tamagotchi.nombre + " ha muerto")


main()