#Implemente um programa que solicite ao usuário um número. Exiba a tabuada de 0 a 100 deste número.

numero = int(input("Digite um número para ver sua tabuada de 0 a 100: "))
for i in range(101):
    print(f"{numero} x {i} = {numero * i}")
