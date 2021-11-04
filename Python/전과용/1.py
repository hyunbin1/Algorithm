# 1. 
input = int(input("점수를 입력하세요(0~100): "))
result = ""

if 100 >= input >= 90:
    result = "A"
elif 90 > input >= 80:
    result = "B"
elif 80 > input >= 70:
    result = "C"
elif 70 > input >= 60:
    result = "D"
else: 
    result = "F"

print("학점은 " + result + "입니다.")

