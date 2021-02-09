from collections import OrderedDict

n, m, k = map(int, input().split())
data = list(map(int, input().split()))

# set_data = set(data)
# data = list(set_data)
data.sort()
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
