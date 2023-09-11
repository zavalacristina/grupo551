from tkinter import *
import random

class SieteAfortunado:

    def _init_(self):
        self.crear_interfaz()

    def crear_interfaz(self):
        ventana = Tk()
        ventana.minsize(340, 450)
        ventana.geometry('340x450')
        
        boton = Button(ventana, text='Jugar!!', command=self.jugar)
        boton.config(font='arial 18 bold')
        boton.pack()

        foto = PhotoImage(file=r'dinero.png')
        self.gano = Label(ventana, image=foto)

        self.campos = [StringVar() for _ in range(3)]
        posicion = 10
        for campo in self.campos:
            label = Label(ventana, textvariable=campo, background='White', foreground='Black', font='arial 42 bold')
            label.place(x=posicion, y=100, width=100, height=100)
            posicion += 110

        ventana.mainloop()

    def generar_numero(self):
        return random.randint(0, 9)

    def jugar(self):
        valores = [self.generar_numero() for _ in range(3)]
        
        for i in range(3):
            self.campos[i].set(valores[i])
        
        if all(valor == '7' for valor in self.campos):
            self.gano.pack(side=BOTTOM)
        else:
            self.gano.pack_forget()

juego = SieteAfortunado()
