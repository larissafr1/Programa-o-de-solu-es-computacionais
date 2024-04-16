#Faça um programa que exiba todos os números entre 1000 e 2000 que quando divisíveis por 5 produzam resto 3.

for num in range(1000, 2001):
    if num % 5 == 3:
        print(num)
