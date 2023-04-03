import math

measure = 0
result = 0
number = []

for i in range(10):
    number.append(float(input("informe o valor aferido no multimetro: ")))
    measure += number[i] # valor total do elementos

media = measure / 10 # calcula a media dos elementos
healthMultimeter = media - (media - (media/10))

for i in range(10):
    result += (number[i] - media) * (number[i] - media) # valor do elemento menos a media dos elementos

detour = math.sqrt(result / 9) # calculo do desvio

if detour > healthMultimeter:
    print("o multimetro esta com problemas e nao pode ser utilizado")
else:
    print(f"a saude do multimetro esta ok. E o valor do desvio padrao e: {detour:.2f}")
