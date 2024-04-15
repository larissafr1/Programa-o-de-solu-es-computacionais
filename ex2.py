#Implemente um programa que solicite 5 números do tipo ponto flutuante ao usuário. Exiba o maior número informado

maior_numero = float('-inf')

for i in range(5):
    numero = float(input(f"Digite o {i+1}º número: "))
    if numero > maior_numero:
        maior_numero = numero

print("O maior número digitado é:", maior_numero)
