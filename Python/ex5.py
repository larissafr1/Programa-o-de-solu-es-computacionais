# Escreva um algoritmo que receba a idade, a altura e o peso de 25 pessoas. Calcule e exiba.
# a) Quantidade de pessoas com idade superior a 50 anos.
# b) A média das alturas das pessoas com idade entre 10 e 20 anos;
# c) A porcentagem de pessoas com peso inferior a 40 quilos entre todas as analisadas.

count_acima_50 = 0
total_altura_10_20 = 0
count_10_20 = 0
count_inferior_40kg = 0
for i in range(25):
    idade = int(input(f"Digite a idade da {i+1}ª pessoa: "))
    altura = float(input(f"Digite a altura da {i+1}ª pessoa (em metros): "))
    peso = float(input(f"Digite o peso da {i+1}ª pessoa (em kg): "))
    if idade > 50:
        count_acima_50 += 1
    if 10 <= idade <= 20:
        total_altura_10_20 += altura
        count_10_20 += 1
    if peso < 40:
        count_inferior_40kg += 1
media_altura = total_altura_10_20 / count_10_20 if count_10_20 > 0 else 0
porcentagem_under_40kg = (count_inferior_40kg / 25) * 100
print("Quantidade de pessoas com idade superior a 50 anos:", count_acima_50)
print("Média das alturas das pessoas com idade entre 10 e 20 anos:", media_altura)
print("Porcentagem de pessoas com peso inferior a 40 quilos:", porcentagem_under_40kg)
