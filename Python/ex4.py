#Escreva um algoritmo que receba a idade e o peso de sete pessoas. Calcule e exiba a quantidade de pessoas 
#com mais de 90 quilos. A média das idades das sete pessoas.

count_acima_90kg = 0
idade_total = 0
for i in range(7):
    idade = int(input(f"Digite a idade da {i+1}ª pessoa: "))
    peso = float(input(f"Digite o peso da {i+1}ª pessoa (em kg): "))
    if peso > 90:
        count_acima_90kg += 1
    idade_total += idade
print("Quantidade de pessoas com mais de 90 quilos:", count_acima_90kg)
print("Média das idades:", idade_total / 7)
