# >> 정수를 5개 입력하세요.
# 5
# -2
# 6
# 10
# -4
# >> 양수의 합은 21

count = 0
sum = 0
print("정수 5개를 입력하세요")

# 방법1
while count < 5:
    try:
        a = int(input())
    except:
        print("정확한 숫자를 입력해주세요")
        continue
    
    if a>0:
        sum += a
    count += 1

print("양수의 합은 "+ str(sum))

# 방법2
while count < 5:
    a = int(input())
    if a > 0:
        sum += a     
    count += 1
print("양수의 합은 "+ str(sum))








# print("양수의 합은" + sum)
    