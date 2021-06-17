# 방법 1(내가 짠 코드)
# 시간복잡도 예측: N*3? == N
total = 0
count = 0
minute = 0
n = int(input())

for i in range(60):
    if '3' in str(i):
        count += 1

for j in range(60):
    if '3' in str(j):
        minute += 60
    else:
        minute += count

for t in range(n+1):
    if '3' in str(t):
        total += 60*60
    else:
        total += minute

print(total)

# 방법 2(교재 서술)
# 예상 시간복잡도: n**3
h = int(input())

count = 0
for i in range(h+1):
    for j in range(60):
        for i in range(60):
            # 매 시각 안에 '3'이 포함되어 있다면 카운트 증가
            if '3' in str(k) + str(j) + str(i):
                count += 1
print(count)