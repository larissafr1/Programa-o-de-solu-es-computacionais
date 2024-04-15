#Implemente um programa que solicite 10 números inteiros ao usuário. Informe quantos números são pares.

count_pares = 0
for i in range(10):
    num = int(input(f"Digite o {i+1}º número inteiro: "))
    if num % 2 == 0:
        count_pares += 1
print("Quantidade de números pares:", count_pares)