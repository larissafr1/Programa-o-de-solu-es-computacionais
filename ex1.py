# Implemente um programa que solicite 10 números inteiros informados pelo usuário. Exiba a soma

soma = 0
for i in range(10):
    numero = int(input("Digite um número inteiro: "))

    # Adiciona o número a soma total
    soma += numero

print("A soma dos números é:", soma)

