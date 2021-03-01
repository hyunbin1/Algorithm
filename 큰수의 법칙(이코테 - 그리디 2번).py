# 방법 1
from collections import OrderedDict
n, m, k = map(int, input().split())
data = list(map(int, input().split()))
set_data = list(OrderedDict.fromkeys(data))
first = set_data[-1]
second = set_data[-2]
print(first, second)
count = int(m/(k+1)) * k
count += m % (k+1)

result = 0
result += count * first
result += (m-count) * second

print(result)


# 방법 2
# 입출력 받기
n, m, k = map(int, input().split())
data = list(map(int, input().split()))
# 데이터 중복 없애기
set_data = set(data)
# set 데이터를 list로 변환해주기
data = list(set_data)
# 데이터 크기 순으로 나열하기
data.sort()
first = data[-1]
second = data[-2]
print(first, second)
count = int(m/(k+1)) * k
count += m % (k+1)

result = 0
result += count * first
result += (m-count) * second

print(result)


# 방법 3
for i in range 