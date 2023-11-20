from acc_dibujo import acc_dibujo

class pincel(acc_dibujo):
    def __init__(self, id, nombre, color, ancho_de_linea, flexibilidad):
        super().__init__(id, nombre, color, ancho_de_linea)
        self.flexibilidad = flexibilidad