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