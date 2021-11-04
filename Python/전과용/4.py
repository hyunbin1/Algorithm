print("양수 5개를 입력하세요.")

max1 = 0
arr1 = []


# 방법 1
while len(arr1) <5:
    try:
        a = int(input())
    except:
        print("양수를 입력하세요")
        continue
    
    if a>0:
        arr1.append(a)
    else:
        print("양수를 입력하세요")

for num in arr1:
    if max1 < num:
        max1 = num
    
print("가장 큰 수는 " +str(max1)+"입니다.")


arr2 = []
max2 = 0
# 방법 2
while len(arr2) < 5:
    a = int(input())
    arr2.append(a)
for i in arr2:
    if max2 < i:
        max2 = i
print (str(max2)) 

