class Livro:
    def __init__(self):
        self.__titulo = ''
        self.__ano = 0
        self.__editora = ''

    def getTitulo(self):
        return self.__titulo
    
    def setTitulo(self, titulo):
        self.__titulo = titulo

    def getAno(self):
        return self.__ano
    
    def setAno(self, ano):
        self.__ano = ano

    def getEditora(self):
        return self.__editora
    
    def setEditora(self, editora):
        self.__editora = editora

    def __str__(self):
        return "\nTitulo: {} \nAno: {} \nEditora: {}\n".format(self.getTitulo(), self.getAno(), self.getEditora())



    