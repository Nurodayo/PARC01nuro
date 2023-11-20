from acc_dibujo import acc_dibujo

class lapiz(acc_dibujo):
    def __init__(self, id, nombre, color, ancho_de_linea, alpha):
        super().__init__(id, nombre, color, ancho_de_linea)
        self.alpha = alpha

