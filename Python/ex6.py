#Faça um programa que receba dez números, calcule e mostre a soma dos números pares, dos números ímpares e dos divisíveis por 3

soma_pares = 0
soma_impares = 0
soma_divisiveis_3 = 0

for i in range(10):
    num = int(input(f"Digite o {i+1}º número: "))
    if num % 2 == 0:
        soma_pares += num
    else:
        soma_impares += num
    if num % 3 == 0:
        soma_divisiveis_3 += num

print("Soma dos números pares:", soma_pares)
print("Soma dos números ímpares:", soma_impares)
print("Soma dos números divisíveis por 3:", soma_divisiveis_3)
