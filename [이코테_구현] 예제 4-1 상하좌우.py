n = int(input())
plans = input().split()

# 시작점
# X = 행, Y = 열
x,y = 1,1

direction_types = ['R', 'L', 'U', 'D']
movex = [0, 0, -1, 1]
movey = [1, -1, 0, 0]

for plan in plans:
    # 리스트의 값만 필요하다면 아래와 같이 사용했겠지만, 우리는 for문에서 movex[i]를 사용하려면 원소가 몇번째 순서인지도 고려해야되서 len을 사용한다.
    # for i in direction_types: 

    for i in range(len(direction_types)):
        if plan == direction_types[i]:
            resultx = x + movex[i]
            resulty = y + movey[i]
    if resultx < 1 or resultx > n or resulty < 1 or resulty > n:
        continue
    x, y = resultx, resulty
print(x,y)

