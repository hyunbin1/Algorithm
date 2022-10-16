N, K = map(int, input().split())
coinlist = list()
for i in range(N):
    coinlist.append(int(input()))
    
count = 0

for i in reversed(range(N)):
    count += K // coinlist[i]
    K = K%coinlist[i]
    
print(count)
