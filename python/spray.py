from acc_dibujo import acc_dibujo

class spray(acc_dibujo):
    def __init__(self, id, nombre, color, ancho_de_linea, expansion):
        super().__init__(id, nombre, color, ancho_de_linea)
        self.expansion = expansion