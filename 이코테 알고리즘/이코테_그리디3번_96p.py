# n = 행의 개수, m = 열의 개수
# 즉 총 m
n, m = list(map(int, input().split()))
# 결과값을 담아줄 빈 배열를 만들어준다
result = []

for i in range(n):
    line = list(map(int, input().split()))
    # result
    result.append(min(line))
print(max(result))

# 방법 2

result = 0
for i in range(n):
    data = list(map(int, input().split()))
    min_value = min(data)
    # max(result, min_value)는 result와 min_value 중에 가장 큰 수를 고르는 것이다.
    # 이는 for문이 2번째 돌면서부터 result에 그 전 값이 담기면서 효과가 발휘되기 시작한다.
    result = max(result, min_value)