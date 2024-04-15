#Escreva um algoritmo que calcule o Fatorial de um número.

def fatorial(n):
    if n == 0:
        return 1
    else:
        return n * fatorial(n-1)

num = int(input("Digite um número para calcular o fatorial: "))
print(f"O fatorial de {num} é {fatorial(num)}")
