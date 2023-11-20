class acc_dibujo:
    def __init__(self, id, nombre, color, ancho_de_linea):
        self.id = id
        self.nombre = nombre
        self.color = color
        self.ancho_de_linea= ancho_de_linea
    
    def ancho(self):
        return self.ancho_de_linea
    def get_ancho_de_linea(self):
        return ancho_de_linea
    def set_ancho_de_linea(self, new_ancho_de_linea):
        self.ancho_de_linea = new_ancho_de_linea
