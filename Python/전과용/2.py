#2.
print("정수를 입력하고 마지막에 -1을 입력하세요.")
input = list(map(int, input().split()))
num = 0
count  = 0

for i in input:
    if i != -1:
        num += i    
        count += 1
    else:
        break
result = num/count

print("정수의 개수는 "+ str(count)+"개이며 "+ "평균은 "+str(result)+"입니다.")