from dados import Livro
from dados import Autor

l1 = Livro()
l2 = Livro()
l3 = Livro()
l4 = Livro()

a1 = Autor()
a2 = Autor()

l1.setAno(1943)
l1.setTitulo("Pequeno Principe")
l1.setEditora("HarperCollins")

l2.setAno(1993)
l2.setTitulo("Voo Noturno")
l2.setEditora("ViaLeitura")

l3.setAno(1997)
l3.setTitulo("Harry Potter e a pedra filosofal")
l3.setEditora("Bloombury publishing")

l4.setAno(1998)
l4.setTitulo("Harry Potter e a camera secreta")
l4.setEditora("Bloombury publishing")

a1.setNome("J.K Rowling")
a1.setIdade(58)
a1.setLivros(l3)
a1.setLivros(l4)

a2.setNome("Antoine de saint-exupery")
a2.setIdade(44)
a2.setLivros(l1)
a2.setLivros(l2)

print("Autor 1:")
print(a1)
print("Autor 2:")
print(a2)
