class figura:

    def __init__(self, num_lados, longitud):
        self.num_lados =num_lados
        self.longitud = longitud
    
    def hallar_perimetro(self):
        return self.num_lados * self.longitud
    
piramide = figura(4,8)
res = piramide.hallar_perimetro()       