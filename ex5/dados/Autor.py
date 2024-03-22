from dados import Livro
class Autor:
    def __init__(self):
        self.__nome = ''
        self.__idade = 0
        self.__livros = []
        self.__numLivros = 0

    def setNome(self, nome):
        self.__nome = nome

    def getNome(self):
        return self.__nome
    
    def setIdade(self, idade):
        self.__idade = idade

    def getIdade(self):
        return self.__idade
    
    def setLivros(self, livro):
        self.__livros.append(livro)
        self.__numLivros += 1

    def getLivros(self):
        return self.__livros

    def mostraLivros(self):
        for livro in self.__livros:
            print(livro.__str__())
        
    def __str__(this):
        return "\nNome: {}\nIdade: {}\nLivros {}\n".format(this.getNome(), this.getIdade(), this.mostraLivros())

    
