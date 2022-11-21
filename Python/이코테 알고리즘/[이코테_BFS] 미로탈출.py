
from collections import deque

n, m = map(int, input().split())
graph = []
for i in range(n):
    graph.append(list(map(int, input())))

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(x,y):
    queue = deque()
    queue.append((x,y))
   
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nextX = x + dx[i]
            nextY = y + dy[i]

            # 맵을 벗어낫을 경우
            if nextX < 0 or nextY < 0 or nextX >=n or nextY >= m:
                continue
            # 벽인 경우
            if graph[nextX][nextY] == 0:
                continue
            # 정상적인 경우
            if graph[nextX][nextY] == 1:
                graph[nextX][nextY] = graph[x][y] + 1
                queue.append((nextX,nextY))
                # print(queue.append((nextX,nextY)))
                # print(queue.append((x,y)))

    return graph[n-1][m-1]

print(bfs(0,0))
