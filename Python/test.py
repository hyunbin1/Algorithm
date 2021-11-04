x = int(input("입력하시오"))
d = [0] * 100

for i in range(2, x+1):
    print(i)
    # 현재의 수에서 1을 빼는 경우
    d[i] = d[i-1] + 1
    print(100, d[i], d[i-1])

    if i % 2 == 0:
        # d[i] = min(d[i], d[i//2]+1)
        print(200, d[i], d[i//2]+1, min(d[i], d[i//2]+1))
    if i % 3 == 0:
        # d[i] = min(d[i], d[i//3 ]+1)
        print(300, d[i], d[i//3]+1, min(d[i], d[i//3]+1))
    if i % 5 == 0:
        # d[i] = min(d[i], d[i//5 ]+1)
        print(400, d[i], d[i//5 ]+1, min(d[i], d[i//5]+1))

print("총횟수는")
print(d[x])