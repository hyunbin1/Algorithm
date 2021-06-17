# CHAPTER 3_4번 1이 될때까지

# 방법 1: 직관적 코드
n, k = map(int,input().split())
count = 0
while n > 1:
    if n % k == 0:
        n //= k 
        count += 1
    else:
        n -= 1
        count += 1
print(count)

#방법 2: 효율적인 코드(두번째 과정 전까지 실행되는 첫번째 과정의 반복을 반복없이 한번에 처리한다.)
n, k = map(int,input().split())
result = 0
while True:
    target = (n//k) * k
    result += n-target
    n = target 
    if n < k:
        break
    result += 1
    n = n//k
result = result+ (n-1)
print (result)

# 방법 3
n, k = map(int,input().split())
result = 0
while True:
    if n < k:
        break
    else:
        target = (n//k) * k
        result += (n - target)
        n = target
        result += 1
        n = n // k
result = result + (n-1)
print (result)