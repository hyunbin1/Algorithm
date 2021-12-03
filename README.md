# 꾸준히 정리하는 Algorithm 저장소

### ✅ 작성언어
- Python
- Java
- JS
- C

### 🎞️ 목차
#### [그래프](https://github.com/hyunbin1/Algorithm/wiki#%EA%B7%B8%EB%9E%98%ED%94%84)
1. 무향 연결 그래프
	* [최소신장트리](https://github.com/hyunbin1/Algorithm/wiki#%EC%B5%9C%EC%86%8C%EC%8B%A0%EC%9E%A5%ED%8A%B8%EB%A6%ACminimum-spanning-trees)

  	* [프림(Prim) 알고리즘](https://github.com/hyunbin1/Algorithm/wiki#%ED%94%84%EB%A6%BCprim-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98)
  	* [크루스칼(Kruskal) 알고리즘](https://github.com/hyunbin1/Algorithm/wiki#%ED%81%AC%EB%A3%A8%EC%8A%A4%EC%B9%BCkruskal-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98)

2. 유향 연결 그래프

  	* [위상 연결 그래프](https://github.com/hyunbin1/Algorithm/wiki#%EC%9C%A0%ED%96%A5%EC%97%B0%EA%B2%B0%EA%B7%B8%EB%9E%98%ED%94%84)
  	* [최단 경로 알고리즘](https://github.com/hyunbin1/Algorithm/wiki#%EC%B5%9C%EB%8B%A8-%EA%B2%BD%EB%A1%9C-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98shortest-paths)

#### [그리디 알고리즘]()
#### [문자열 알고리즘]()


# 그래프

## 전체 개요

**그래프를 공부해야 되는 이유(Why we have to use Grape Alogrithm?):**

1. 세상에는 서로 간의 관계로 이어져 있는 것들이 매우 많다. 예를 들어, 어떤 고객이 어떤 상품을 샀다던가, 어떤 지점 간에 도로가 있다던가 등

   **사건 A와 B가 서로 인과 관계로 이루어져있는 것 혹은 현상이 매우 많다.**

2. 컴퓨터가 이러한 관계들을 이용해서 무엇을 하려면 컴퓨터가 이해할 수 있는 '관계'를 표현 방식이 그래프이다.

**정의:** 그래프는 현상이나 사물을 정점(vertex)과 간선(edge)으로 표현한 것이다. 일반적으로 그래프 G는 노드 V와 간선 E의 집합으로 표현된다.

**표현 방식**:

```
- Graph G =(V. E)
  - V: 정점 집합, Vertex
  - E: 간선 집합, Edge

- 인접(adjacent)
  - 두 정점이 간선으로 연결되어 있는 경우를 말한다.
```

//그림 삽입

**그래프의 종류:**

- 무향 연결 그래프
- 유향 연결 그래프

#### **그래프의 표현:**

1. **인접 행렬**
2. **인접 리스트**
3. **인접 배열**

## 그래프에서 모든 정점 방문하기

### 대표적인 두가지 방법: DFS, BFS

## 최소신장트리(Minimum Spanning Trees)

**조건**: **무향 연결 그래프**(connected graph): 모든 정점 간에 경로가 존재하는 그래프

최소 신장 트리를 구하는 대표 알고리즘:

1. **Prim's Algorithm**
2. **Kruskal's Algorithm**

**필수 용어:**

- **트리**: **싸이클이 없는 연결 그래프이다**. <u>n개의 정점</u>을 가진 트리는 항상 <u>n-1개의 간선</u>을 갖는다.

- **신장**: 모든 노드를 포함한다는 의미이다.

- **그래프 (G)의 신장 트리**: G의 정점들과 간선들로만 구성된 트리이다.

  - Ex. 만약, 노드가 4개인 그래프 G의 신장 트리를 만든다면, 신장 트리는 반드시 4개의 노드를 포함하고 있어야 한다.
  - 주의할 점: 신장 트리는 트리의 일종이기 때문에 그래프와 트리의 차이인**순환 구조를 가지면 안된다.**

- **G의 최소 신장 트리**: G의 신장 트리들 중 간선의 합이 최소인 신장 트리이다.

---

### 프림(Prim) 알고리즘

- 기본적인 아이디어: **S라는 집합을 유지하는 것이다.**

- S는 **<u>공집합으로 시작**</u>하고, **<u>모든 정점 V를 포함할 때 종료</u>**(집합 S의 개수 = 정점 V의 개수 )한다.

- **특징:**

  - **최적해를 보장**하는 그리디 알고리즘이다.

  - **힙을 이용**한다.

- **수행시간**: **O**(|E|log|V|)

  cf) E = 간선의 수, V: 정점의 수

#### 알고리즘 사고 순서:

1. S를 공집합으로 만든다.

2. V의 모든 노드 값을 무한대로 설정한다.

3. 임의의 정점(r)을고른 후, 방문했음(=V 노드의 무한 값을 0으로 바꿔준다) 을 표시한다.

4. 해당 정점에 연결된 모든 간선 중에서 가장 **<u>최소 비용을 가진 간선</u>**을 선택한다.

5. 간선에 연결된 새로운 노드(y)를 집합 S에 추가하고, 방문했음(=y 노드의 값을 간선의 비용으로 바꿔준다 = 이완(relaxation))을 표시한다.

   - 더 이상 연결될 수 있는 간선이 없는 경우, y는 배열에서 더이상 신경 쓰지 않아도 된다.
   - 남은 노드의 개수: (V - S)

6. r과 y가 있는 **집합 S를 하나의 큰 정점이라고 생각**하고, 이를 기준으로 이어져 있는 간선의 값을 리스트에 넣어준다.

   = 골라야 할 선택지를 만들어 준 것이다. 만일 하나의 노드에 연결된 간선이 여러 개라면 작은 값을 넣어준다.

7. 리스트에 넣어준 값들 중 최소 값을 골라준다

8. 만일 S집합에 6번에서 선택지를 만들어주기 넣어준 노드의 값보다 새롭게 구하는 값이 더 작다면, 작은 값을 노드에 바꿔서 넣어준다.

9. S 집합의 개수가 V 정점의 개수와 같을 때까지 반복한다.

---

### 크루스칼(Kruskal) 알고리즘

- 기본적인 아이다어: **T라는 신장트리 집합을 만드는 것이다.**

- 간선 집합(Q)를 만들어 가중치가 작은 간선을 기준으로 작은 순서대로 집합을 만들어 알고리즘을 진행한다.

- **수행시간: O**(ElogE) = **O**(ElogV)

#### 알고리즘 사고 순서:

V: 7개라 가정하자.

1. 각각의 노드는 모두 각각의 집합이다. - 집합의 개수 = 7개
2. 가장 작은 간선을 찾는다.
3. 가장 작은 간선으로 연결된 두개의 노드가 하나의 집합으로 여겨진다. - 집합의 개수: 6개
4. 다음으로 작은 간선으로 연결된 노드를 찾아, 이를 또 하나의 집합으로 여긴다. - 집합의 개수: 5개
5. 만일 각 집합의 노드가 겹친다면, 서로 합쳐준다.
6. 이런 식으로 집합의 개수가 1이 될 때까지 줄인다.
7. 남은 간선은 버린다.

---

## 유향연결그래프

### 위상 정렬

만약에 **우리가 해야 할 일이 여러가지**가 있고, 이 **일들 간에는 서로 상호 선후 관계가 있다**면 이런 알고리즘은 어떻게 처리해야 할까?

쉽게 비유하자면, 우리가 라면을 끓일 때도

1. 라면 봉지 뜯기
2. 냄비에 물 붓기
3. 점화
4. 라면 넣기
5. 수프 넣기
6. 계란 풀기

와 같은 순서로 일을 상호 순서대로 처리하는 것과 같은 것이다. 여기서 조금 생각해볼만한 것은, **'이들 간의 순서가 바뀌어도 괜찮은 경우는 어떻게 처리할 것인가'**이다. 예를 들어, 누군가는 물을 끓이기 전에 라면 스푸를 넣는 사람도 있을 것이고, 물을 넣기 전에 라면 스프를 넣는 사람도 있을 것이기 때문이다. 이를 순서대로 나열한다면 아래와 같은 순서가 될 것이다. 우리는 컴퓨터가 해결해야하는 수 많은 문제들을 순서대로 처리하게 할 수 있도록 이러한 알고리즘을 사용하려고 한다.

1. 봉지 뜯기
2. 스프 넣기
3. 물 붓기
4. 점화
5. 라면 넣기
6. 계란풀기

**조건: 싸이클이 없는 유향 그래프**

**기본 아이디어:**

- 모든 정점을 일렬로 나열하되
- 정점 x에서 정점 y로 가는 간선이 있으면, x는 반드시 y보다 앞에 위치한다.
- 일반적으로 임의의 유향 그래프에 대해 복수의 위상 순서가 존재한다 (이는 하나의 일에 봉착하기 전에 이전의 일들은 순서에 상관없을 때가 있기 때문이다. 예를 들어 라면 스프를 넣는 순서처럼 말이다.)

**수행시간:** V+E == 노드의 개수 + 간선의 개수

<img src="https://user-images.githubusercontent.com/63040492/143373462-2e487fc6-8925-458f-97e8-55292c9468a4.png" alt="image" width="200" height="400">

```java
topologicalSort(G, v){
    for(int i=0; i<n; i++){
        // 1, 진입 간선이 없는 정점 u를 선택한다;
        // 2. Arr[i] = u;
        // 3. 정점 u와, u의 진출간선을 모두 제거한다.
    }
    // 이 시점에 배열 Arr[1~n]에는 정점들이 위상정렬 되어있다.

}
```

위의 식을 앞에서 배운 DFS를 사용하여 다르게 알고리즘을 기술할 수 있다.

수행 시간: V + E

```java
topologicalSort2(G){
    //1. 모든 노드에 방문하지 않았다는 NO 값을 초기화 해준다.
    for each v:V
        visited[v] = false;
    // 2. 정점 순서와는 무관하게 택한 정점을 기준으로 DFS를 수행한다.
    for each v:V
        if(visited[v]==false){
            DFS-TS(v)
        }
}

DFS-TS(v){
    // 1. DFS가 수행된 노드에는 방문함을 표시해준다.
    visited[v] = true;
    // 2. v의 인럽 리스트를 모두 돌며 방문에 안된 노드를 깊게 탐색한다.
    for each x:L(v) // L(v): v의 인접 리스트
        if(visited[x]== false){
            DFS-TS(x);
        // 3. 연결 리스트 R의 맨 아페 정점 v를 삽입한다.
        }
}
```

## 최단 경로 알고리즘(Shortest Paths)

**조건:**

- **간선 가중치가 있는 유향 그래프**
- 무향 그래프는 각 간선에 대해 양쪽으로 유향 간선이 있는 유향 그래프로 변환 시켜주어야한다.
  - 무향 간선(U - V) = 유향 간선(U -> V) + 유향 간선(U <- V)

**두 정점 사이의 최다 경로**

- 두 정점 사이의 경로들 중 간선의 가중치 합이 최소인 경로이다.
- **간선 가중치의 합이 음인 싸이클이 있으면 문제가 정의되지 않는다.**

### 최단 경로 알고리즘 유형

1. **단일 시작점 최단 경로**

- 단일 시작점으로부터 각 정점에 이르는 최단 경로를 구한다.
- 알고리즘
  1. **다익스트라 알고리즘**: 음의 가중치를 허용하지 않는 최단 경로이다.
  2. **벨만-포드 알고리즘**: 음의 가중치를 허용하는 최단 경로이다.

2. **모든 쌍 최단 경로**

- 모든 정점 쌍 사이의 최단 경로를 모두 구한다
- 알고리즘: **플로이드-워샬 알고리즘**

### 1. 다익스트라(Dijkstra) 알고리즘 - 단일 시작점(음의 가중치 불허) 최단 경로(1)

다익스트라 알고리즘을 알기 위해서는 먼저 알아두어야 할 자료구조가 있다.

1. d[u]: 각 정점들의 최단 경로 길이를 저장해 놓은 배열이다.
2. S: 이미 최단 거리가 알려져서 거리가 파악된 정점들만 모아놓은 집합이다.
3. w[u,v]: 정점 u에서 이어져 있는 정점 v까지 가는 경로 비용 == u->v 간선

간단 요약:

1. 시작 노드를 정한다.
2. 시작 노드를 기준으로 가장 짧은 노드를 택한다. - 방문했음을 표시해준다.
3. 가장 짧은 노드에 연결되어 있는 다른 노드들에, 짧은 노드의 경로 비용 + 짧은 노드에서 방문되지 않는 노드로 가는 경로 비용을 더한다.
4. 아직 방문하지 않은 노드 중 가장 짧은 경로의 노드를 택한다. - 방문했음 표시
5. 3번과 동일한 과정을 되풀이 한 후, 3번의 노드들과 겹치는 노드가 있다면 더 짧은 것을 연결되어 있는 노드에 넣어준다.

알고리즘 순서:

1. S의 집합을 공집합으로 초기화한다.

2. 모든 정점의 최단 경로 길이(d[u])를 가장 큰 값으로 초기화를 해놓는다.

3. 시작점은 거리가 0이기 때문에 시작점 d[r]은 0으로 초기화 해준 뒤 시작한다.

4. 종료조건: 최소인 정점들을 뽑아서 모두 S에 넣게 되어, 총 정점의 개수와 S의 원소의 개수가 같을 시에 종료한다.

5. 메서드 extractMin(Q, d[])를 사용하여 아직 방문하지 않는 정점들 중에서 최소의 거리값을 가지고 있는 정점을 택하게 된다.

   - extractMin(Q, d[]): 집합 Q(V-S= 아직 방문하지 않은 정점들의 집합)에서 d값이 가장 작은 정점 u를 리턴한다.

6. 선택된 정점(u)은 탐구가 되었기 때문에 집합 S에 포함시킨다.

7. 방금 선택된 정점(u)로부터 연결되어 있는 많은 정점들(v)의 집합을 모두 탐색하며,

8. u를 통해서 다음 연결되어 있는 정점들(v)로 가는 경로가, u를 통하지 않고 다른 경로로 v로 직접 가는 것보다 더 짧다면

9. 다음 정점을 가는 많은 경로 들 중에서 u를 경유하고 가능 경로를 택하도록 한다. // 현재 d[v]는 모두 무한대로 설정이 되어 있기 때문에 이를 간선의 값으로 바꿔줄려는 과정이기도 하다.

10. 이는

    - d[v] = d[u] + w[u,v]; // w[u, v]: u에서 다음 노드 v 로 가는 경로의 길이
    - prev[v] = u;

    로 초기화 해주면 된다.

**수행시간:** O( |E|log|V|) - 힙 이용한다.

```java
Duhjstra(G, r){
    // G(v, E): 주어진 그래프. 모든 간선의 가중치는 음이 아니여야한다.
    // r: 시작점으로 삼을 정점(root)
    S = {};
    for each u:V(모든 노드)
        d[u] = 9999999999;
    d[r] = 0;

    while(S != V){
        u = extractMin(V-s, d);
        S = S + {u};
        for each v:L(u){ // L(u): u로부터 연결된 정점들의 집합
            if(v=visetedFalse && d[u]+w[u,v] < d[v]){
                d[v] = d[u] + w[u,v];
                prev[v] = u;
            }
        }
    }
}

extractMin(Q, d[]){
    // 집합 Q에서 d값이 가장 작은 정점 u를 리턴한다. Q는 남은 정점들의 집합.
}
```

// 수행 사진, 리스트 과정 사진 첨가

### 2. 벨만포드(Bellman-Ford) 알고리즘 - 단일 시작점(음의 가중치 허용) 최단 경로(2)

**수행 시간:** O(|E||V|)

벨만포드 알고리즘은 위의 다익스트라 알고리즘과 앞부분은 매우 유사하다.

공통점:

1. 모든 정점의 값을 무한대로 설정한 후, 시작 점은 0으로 초기화 해준다.
2. 모든 정점과 간선을 돌면서 현재의 경로와 이전의 경로의 값 중에서 비용이 더 적은 것을 선택한다.

차이점:

1. **음의 싸이클 존재 여부 확인**: 벨만 포드 알고리즘은 노드의 값을 모두 정한 후에, 한번 더 모든 간선을 탐색하며 노드의 값들을 변경해준다.

   만일, 노드들의 값이 모두 정해졌음에도 불구하고, 간선을 탐색하며 노드들의 값이 바뀐다면 이는 음의 가중치를 가지고 있는 간선이 있다는 의미이기 때문이다. 그렇게 된다면 우리는 그 간선을 해가 없다고 표시해준다.

2. **집합 S 존재 여부**: 벨만 포드 알고리즘은 앞서 사용했던 집합S의 개념을 사용하지 않는다.

알고리즘 간단개요:

for 문을 돌 때, 바뀐 값들을 기준으로 이어진 다음 노드 값을 정한다. 이전 단계에서 노드가 바뀌었다면, 바뀐 노드 값으로 다시 탐색하기. 같은 단계에서 노드가 겹친다면, 작은 수 정하기.

```java
BellmanFord(G, r){
    for each u:V{
        d[u] = 9999999;
    }
    d[r] = 0;

    // 수행시간 가장 많이 걸리는 곳: E * V
    for(int i=1; i<= V-1; i++){ // 모든 정점 탐색
        for each (u,v):E{ // 모든 간선 탐색
            if(d[u] + w[u,v]) < d[v]) {
            d[v] = d[u] + w[u,v];
            prev[v] = u;
            }
        }
    }


    // 현재 모든 정점들에는 초기화가 완료되었다. 완료된 이후 모든 간선들을 탐색하며
    // 음의 싸이클 존재 여부를 확인한다.
    for each (u,v):E {// 모든 간선들 탐색
        if(d[u] + w[u, v] < d[v]){
            d[v] = "해가 없다"
        }
    }
}
```

#### 그래프가 아닌 동적 프로그래밍으로 본 벨만 포드 알고리즘

1. D~t~^k^: 알고리즘 수행 중 최대 k개의 간선을 거쳐, 시작 정점에서 정점 t에 이르는 최단 거리

2. 목표:D~t~^n-1^ - 자신을 제외한 간선을 모두 봐야한다.

3. 재귀적 관계:

   - d~v~^k^ = min{d~u~^k-1^ + w~uv~}, k>0

   - d~r~ = 0

   - d~r~^0^ = 9999999, t != r

### 3. 플로이드-워샬(Floyd-Warshall) 알고리즘 - 모든 정점들간의 최단 경로 구하기

응용 예:

1. Road Atlas
2. 네비게이션 시스템
3. 네트웍 커뮤니케이션

그래프에서 노드가 1, 2, 3 총 세 개가 있다고 가정하자. 이때, 1에서 3으로 바로 가는 간선의 비용보다, 1에서 2를 경유해서 3으로 가는 간선의 비용이 더 저렴할 수 있다. 플로이드 워샬 알고리즘에서는 이러한 **경유하는 점을 기준**으로 알고리즘을 수행한다.

//그림

경로가 없는 것은 무한으로 넣어준다. 자기 자신은 0으로 넣어준다.

다익스트라는 오직 1차원 배열을 사용해서 A을 기준으로 다른 노드로 가능 거리를 담았지만,

플로이드 워샬에서는 2차원 배열을 사용하여 모든 정점에서 모든 정점을 가는 모든 경우를 배열에 넣어준다. 현재 아래의 테이블이 의미하는 것은 '현재까지 계산된 최소 비용'이다. 따라서 이 2차원 배열을 반복적으로 갱신하여 최종적으로는 모든 최소 비용을 구해야한다. 그리고 이 반복의 기준은 앞서 말한 바와 같이 경유하는 노드가 기준이다.

**초기값**

|       |  A   |  B   |  C   |  D   |
| :---: | :--: | :--: | :--: | :--: |
| **A** |  0   |  5   | 무한 |  8   |
| **B** |  7   |  0   |  9   | 무한 |
| **C** |  2   | 무한 |  0   | 무한 |
| **D** | 무한 | 무한 |  3   |  0   |

1. 노드 A을 거처가는 경우

|       |  A   |  B   |  C   |  D   |
| :---: | :--: | :--: | :--: | :--: |
| **A** |  0   |  5   | 무한 |  8   |
| **B** |  7   |  0   | B->C | B->D |
| **C** |  2   | C->B |  0   | C->D |
| **D** | 무한 | D->B | D->C |  0   |

**비교해보기:**

- B->C의 기존 값 = 9 vs. B->A + A->C = 7 + 무한 =무한

  == 기존 값이 더 작으므로 기존 값 선택

- B->D의 기존 값 = 무한 vs. B->A + A->D = 7+ 8 =15

  == A를 경유하여 D로 가는 값이 더 작으므로 15 선택

- C->B의 기존값 = 무한 vs. C->A + A->B = 2+ 5 = 7

  == A경유 값 선택: 7

- C->D의 기존값 = 무한 vs. C->A + A->D = 무한+8 = 무한

  == 무한

- D->B의 기존값 = 무한 vs. D->A + A->B = 무한

  == 무한

- D->C의 기존값 = 3 vs. D->A + A->C = 무한

  == 기존 값 3 선택

**노드 1을 거치는 경우 결과**

|       |  A   |  B   |  C   |  D  |
| :---: | :--: | :--: | :--: | :-: |
| **A** |  0   |  5   | 무한 |  8  |
| **B** |  7   |  0   |  9   | 15  |
| **C** |  2   |  7   |  0   |  4  |
| **D** | 무한 | 무한 |  3   |  0  |

모든 정점들간의 상호 최단 경로 역시 동적 프로그래밍으로도 구할 수 있다.

d~ij~^k^: 정점 집합 V에 속하는 것들로만 거쳐 v~i~에서 v~j~ 에 이르는 최단 경로의 길이를 말한다.

d~ij~^k^ =

1. k=0일때: w~ij~
2. k가 1이상일 때: min{d~ij~^k-1^, d~ik~^k-1^ + d~kj~^k-1^}

```java
FloydWarshall(G){
    for(int i =0; i<n; i++){
        for(int j=0; j < n; j++){
            1. 처음 2차원 배열 초기화: 간선의 비용들 넣어주기
        }
    }
    for(int k=0; k<n; k++){
        for(int i =0; i<n; i++){ // i: 시작 정점
            for(int j=0; j < n; j++){ // j: 마지막 정점
                d(k)[ij] = min{d(k-1)[ij], d(k-1)[ik]+d(k-1)[kj]};
            }
        }
   }

}
```

# 그리디 알고리즘

그리디 알고리즘은 DP와 같이 특정한 조건에만 사용할 수 있다. 이를 매트로이드라고 부른다.

[목차]

1. 그리디 알고리즘의 특징

2. 그리디 알고리즘으로 최적해가 보장되는 예와 그렇지 않은 예

3. 매트로이드 정의

4. 매트로이드가 만드는 문제 공간의 특성

### 그리디 알고리즘

그리디 알고리즘은 현재 시점에 가장 이득이 되어 보이는 해를 선택하는 행위를 반복하는 알고리즘이다. 마치 탐욕에 눈이 멀어 눈 앞의 이익만을 취하고 보는 것이다. 그렇기 때문에 이는 대부분 최적의 해와는 거리가 멀지만, 가끔 최적의 해가 보장되는 경우도 있다. 이는 기존에 서술한 알고리즘들처럼 당장은 이득이 되지는 않지만 최종적으로 보았을 때는 최적의 해를 보장하려는 성격과는 매우 반대된다고 볼 수 있다.

```java
do{
    우선 가장 좋아 보이는 선택을 한다
}
util(해 구성 완료)
```

```java
Greed(C){ // C: 원소들의 총 집합
    S = {}; // S는 공집합으로 초기화
    while(C != 0 && S는 아직 온전한 해가 아님){
        x = C에서 가장 좋아보이는 원소
       집합 C에서 x를 제거
        if(S에 x를 더해도 되는지 체크){
        된다면 S에 x포함
}
        if(S가 온전한 해인 경우{
        return S;
}
        else  return "no solution!";
}
}
```

### 그리디 알고리즘으로 최적해가 보장 되지 않는 예:

1. 이진 트리의 최적합 경로 찾기: root에서 leaf까지 최대의 경로값을 선택하는 경우 - 깊게 가지 못하여 실패한다.

2. 동전 바꾸기: 500, 400, 100 총 3개의 단위가 있다고 가정하자. 이처럼 **바로 아래 단위의 배수가 되지 않으면 **최적해가 보장되지 않는다.

### 최적해가 보장되는 예:

1. 회의실 배정 문제: 회의실은 1개이지만, 여러 부서에서 회의실 사용을 요쳥할 경우 - 회의 시작 시간 & 종료시간을 명시해서 신청할 경우 최적해가 보장된다.

2. Activity Selection Problem: 주어진 상황(시간)에서 최대한 많은 활동을 끝내야 하는 경우.

### Activity Selection Problem

|       i        |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  | 10  | 11  |
| :------------: | :-: | :-: | :-: | :-: | :-: | :-: | :-: | :-: | :-: | :-: | :-: |
|  S(시작 시간)  |  1  |  3  |  0  |  5  |  3  |  5  |  6  |  8  |  8  |  2  | 12  |
| F(끝나는 시간) |  4  |  5  |  6  |  7  |  8  |  9  | 10  | 11  | 12  | 13  | 14  |

- 수행시간 순서대로 나열해 놓는 것이 좋다.

![](C:\Users\kimgu\AppData\Roaming\marktext\images\2021-11-30-17-07-57-image.png)

- Greddy한 아이디어들

  1. 소요 시간이 가장 짧은 회의 순으로 배정

  2. 시작 시간이 가장 이른 회의 순 배정

  3. 종료 시간이 가장 이른 회의 순으로 배정 - **이것만 최적해를 보장한다.**

- 종료 시간이 가장 이른 것을 기준으로 한 그리디

  - Why 이것이 최적해인 것인가?

    A. 앞으로 남은 공간에 초점을 맞춘 것으로, 끝난 이후 많은 시간이 남을 수록 사람들이 더 활동을 할 수 있기 때문이다.

  - 과정:

    1. 가장 이른 시간에 끝나는 활동을 선택하기

    2. 선택된 활동 제거하기

### Fractional Knapsack Problem - 물건을 자를 수 있는 경우만 성립, 개수는 1개뿐.

Q. 가방 안에 가장 높은 가치가 되도록 물건을 담아라

가방의 무게: 5

|    아이템id     |  1  |  2  |  3   |  4  |
| :-------------: | :-: | :-: | :--: | :-: |
|      가치       | 12  | 10  |  20  | 15  |
|      무게       |  2  |  1  |  3   |  2  |
| 1파운드 당 가치 |  6  | 10  | 6.67 | 7.5 |

기준: 단위를 고정하기. 주어진 기준 단위 1파운드 당의 가치를 고려하기

순위(id): 2 > 4 > 3 > 1

단위 무게당 큰 것부터 가방에 넣기: id 2 넣기 + id 4 넣기 + id 3 짤라서 2파운드만큼만 넣기

결과: 10 + 15 + 13.3 = 38.3 파운드

### 허프만 코드 - 데이터 압축에 관련된 알고리즘

20~90% 정도 기존의 데이터를 효과적으로 압축할 수 있다.

기준: 특정 알파벳 등장의 빈번도 - 덜 등장하는 것은 코드가 길어도 되고, 많이 등장하는 것은 코드를 압축한다.

과정: 모든 알파벳이 고정된 크기(아스키 코드 등)로 문자를 나타내려고 한다.

| 문자             |  a  |  b  |  c  |  d  |
| ---------------- | :-: | :-: | :-: | :-: |
| 문자 길이(2진법) | 00  | 01  | 10  | 11  |

abacdaacac = 00 01 00 10 11 00 00 10 00 10: 20개의 이진 문자열

이를 허프만 코드에서는 사람들이 빈번하게 사용하면 비트수를 작게, 거의 쓰지 않는다면 비트수를 늘려서 계산하려고 한다.

빈도수 계산 표:

| 문자          |  a   |  b   |  c   |  d   |
| ------------- | :--: | :--: | :--: | :--: |
| 빈번도        | 0.60 | 0.05 | 0.30 | 0.05 |
| 변화된 문자열 |  0   | 110  |  10  | 111  |

abacdaacac = 0 110 0 10 111 0 0 10 0 10

비트수: 17개로 압축됨.

이러한 예는 n개의 문자열을 인코딩하는데 필요하다.

고정된 문자열이 2n개라면, 이를 사용하면 1.5n개로 줄일 수 있다. == 25% 줄어듬.

0.6 x 1 + 0.05 x 3 + 0.3 x 2 + 0.05 x 3 = 1.5n

중요 포인트: 변경한 문자가 겹치면 안된다. 그렇다면 어떻게 바꾸면 될까? 예를 들어 a가 1이라면 a가 연속으로 3번 나오면 이는 d로 해석될 될 문제가 있기 때문이다. 이를 위해서 우리는 이진 트리를 사용하여 허프만 코드를 부여한다.

루트에서 리프로 가게 되는데, 왼쪽은 0이고 오른쪽으로 가면 1이다. 리프 단계에 도달하는 아이들은 1 혹은 0 중 한가지를 철로로 사용하여 끝나기 때문에 앞의 숫자들과 조합되더라도 중복되는 수가 없다.

### 수식으로 알아보는 허프만 기호

$$
B(T) = ΣP(x)Dt(x)
$$

B(T): 인코딩이 다 되었을 때, 예상되어지는 결과 값.

P(x): 문자 x가 나올 확률

Dt(x): x의 코드 길이

= **각 문자의 빈도수(나올 확률) x 문자의 코드 길이를 합친 것이 B(T)라는 총 문자열의 길이이다.**

### 알고리즘

- 알고리즘 과정 - 루트부터 리프 단계까지 코드를 지정하는 알고리즘:

  1. 가장 빈도가 낮은 2개의 문자를 뽑는다. - x, y
  2. 가상의 노드 z를 만들어서 왼쪽, 오른쪽에 자식으로 x, y를 넣어준다.

     - 이 때 노드 z의 값은 x, y의 빈도수를 합친 값이다.

  3. 남아 있는 문자열들 중에서 또 가장 빈도가 낮은 2개의 문자를 뽑아서 이 위(부모)노드로 올린다.
  4. 이를 끝날때까지 반복한다.



```java
huffman(C, prob){ // C: chars, prob: 빈도수
    for each(x in C){
        add x to Q sorted by prob[x] // 모든 우선 순위 큐를 저장한다.
    }
    for (int i =0; i <|C|){
        z = new 초기 노드;
        left[z] = x;
        right[z] = y
        prob[z] = prob[x] + prob[y];
        Q = z
    }
    return 마지막 왼쪽 요소를 루트로 변경하기
}
```

## 메트로이드

유한 집합 S의 부분 집합인 I={A집합, X 집합, Y 집합 등등}이 다음 성질을 만족하면 매트로이드라고 한다.

1. 집합 A가 I에 속하고 B는 A에 속해있거나 같다면 B의 모든 부분 집합도 I에 속한다. (**상속성**)
   - 전체를 구성하고 있는 작은 부분이 점점 커지면서 큰 문제에 대한 답이 될 수 있다.
2. 크기가 다른 두 집합A, B(|A| <= |B|)가 I에 속하면, **B에는 속하지만 A의 원소가 아닌 것**을 A에 더하면 I에 속하게 하는 원소가 된다.(I= 해답) (**증강성 또는 교환성**)

이때 I가 의미하는 것은 우리가 풀려고 하는 문제에 대한 최적의 답들을 모아놓은 집합을 의미한다.

### 그래프 메트로이드 성격 - 대표 예제: 숲

[정리]

- 그래프 G = (V, E)

- 숲(forest): 싸이클이 없는 나무들의 집합이다.

  1. 하나 이상의 트리들로 이루어진 집합
  2. or, 싸이클을 이루지 않은 간선들의 집합을 말한다

- 숲 집합 F ⊆ 2^E는 매트로이드이다.

[증명]

숲이 메트로이드 성격을 가지고 있다고 주장하기 위해서는 앞서 말했던 메트로이드 성격인 상속성과 증강성을 모두 만족해야한다.

1. 상속성: 어떤 숲의 부분 집합도 당연히 숲이다

2. 증강성:

   조건:

   1. A는 적어도 2개 이상의 분리된 트리라고 구성되었다,
   2. B가 A보다 간선 수가 많다.

 결론:

1. B에는 A의 서로 다른 트리를 연결하는 간선이 적어도 하나 이상 존재한다.
1. 이 간선 중 하나를 A에 더하면 사이클을 만들지 않아서 역시 숲이 된다.

1. 숲의 형식을 가지고 있다면 이는 그리디 알고리즘으로 만들 수 있다.

### 메트로이드의 확장

메트로이드 확장이란?

가정: 메트로이드 I ⊆ 2^e가 있고, A는 I에 속해 있다.

A에 속하지 않는 어떤 원소 x ∈ S에 대하여 **A ∪ {x} ∈ I** 이면 '**x가 A를 확장한다**' 라고 한다.

즉, 임의의 집합인 A에 속해 있지 않은 어떤 원소 x를 A에 더했더니 해답이 되었다면, 이를 A에 포함하게 된다. A가 더이상 확장되지 않으면, A를 **포화 집합**이라고 한다. 메트로이드 I의 모든 포화 집합은 같은 크기를 가진다.

Ex. 숲 집합 F의 포화 집합은 트리로 모두 |V|-1(=간선의 개수)의 크기를 같는다.

#### 최대 가중치 매트로이드

매트로이드의 원집합 S의 원소들이 양의 가중치를 가지고 있을 때, 원소들의 합을 최대화 하는 부분 집합 A를 찾고자 한다. (이때 A는 I의 부분집합임)

```java
//최대 가중치 합을 구하는 그리디 알고리즘
Greedy(I, w[]){ // I: 매트로이드. w[]: 가중치 배열
	A = {};  // A는 공집합
    S의 원소들을 가중치 크기를 기준으로 내림차순으로 정렬한다;
    for each(x:S){ // 더이상 추가되는 x가 없을 때까지 추가하기 - 모든 원소 탐색
        if(A ∪ {x} ∈ I){ // x가 해답이 된다면 I에 포함하기
            A = A + {x}; // x를 A에 포함
        }
    }
    return A;
}
```

# 문자열 매칭

문자열 매칭은 우리가 많은 정보 속에서 내가 원하는 단어가 있는지 찾아보는 것이다. 예를 들어 absoapedgj 와 같은 정보 속에서 비누 'soap'라는 단어가 있는지 찾는 것이다. 이렇게 absoapedgj와 같은 정보를 **'텍스트 문자열(A[1...n])'**이라 하고, soap와 같이 우리가 찾아야 하는 단어를 **'패턴 문자열(P[1...m])'**이라고 한다.

따라서 우리가 해야 할 작업은 텍스트 문자열 A[]에 패턴 문자열 P가 포함하는지 알아보는 것이다. 



### 1. 원시적인 매칭

원시적인 매칭은 우리 텍스트 문자열 A[1] 부터 마지막 인덱스까지 일일히 P[1..m]의 패턴과 일치하는지 매칭하는 방법이다. 이렇게 되면 시간 복잡도는 O(nm)이 된다. 하지만 우리 일상 생활에서, A라는 정보는 정보의 호수라고 불릴만큼 너무 많다. 그렇기 때문에, 이 많은 정보를 원시적인 매칭으로 처리하기에는 불가능하다.

```java
navieMatching(A,P){
    for i =1; i <= n-m+1 {
        if(P[1..m] = A(i...i+m-1){
            A[i] 자리에서 매칭되었음을 알린다;

        }
    }
}
```



### 2. 오토마타를 이용한 매칭

앞서 말한 원시적인 매칭에서 비효율적인 모습을 보여주는 예를 한번 이야기 해보고자한다. 예를 들어 정보라는 A[1..n] 텍스트 문자열이 abcdabcda.... 있다고 가정하자. 그리고 우리가 찾으려는 문자는 abcdabcwz라는 패턴 문자열이다. 이를 기존의 원시적인 매칭처럼 수행한다면 인텍스 a(1)부터 b,c,d,a,b... n까지 일일히 매칭 시키게 될 것이다. 하지만 우리는 A와 P가 abcdabc까지는 일치하지만 다음 문자에서 A는 d이고 P는 w이기 때문에, 일치하지 않는 다는 것을 알 수 있다. 그렇다면 우리는 앞에 부분을 뛰어 넘고 매칭이 불일치한 부분부터 보는 것이 더 효율적이지 않은가. 오토마타는 이러한 방법을 사용하는 알고리즘이다. 

여기서 주요한 포인트는 **부분적으로 일치하는 정보를 유지하면** 효율으로 매칭을 수행할 수 있다는 것이다. 

  

- 오토마타는 **문제 해결의 절차를 사태의 전이로 나타낸 것이다**. 이는 1. 상태 집합, 2. 시작 상태, 3. 목표 상태들의 집합, 4. 입력 알파벳, 5. 상태전이 함수 총 5개의 요소으로 이루어져 있다. 이는 상태 집합에서 입력 알파벳이 들어왔을 때,  다음번 어떤 상태로 바뀌는지 상태 전이 함수가 계속해서 정의를 한다. 그러다 목표 상태 집합과 일치하게 되면 알고리즘이 종료하게 된다. 

  - Q: 상태 집합 
  - q0: 시작상태
  - F: 목표 상태들의 집합 - 상태 변화를 계속 하다, 목표 상태에 도달하게 되면 알고리즘이 끝나게 된다. 
  - ∑: 입력 알파벳 - input으로 들어갈 패턴 문자열
  - δ: 상태 전이 함수 - 매칭이 진행된 상태를 유지

  => 매칭 O되면 종료



어떤 상태 집합에서 어떤 특정한 입력이 들어왔을 때, 다음번 어떤 함수로 바뀌는지가 들어간다. 



```java
FA-Matcher(A, δ, f){
    // f: 목표 상태 - 패턴 문자열
    
    String[] A = new String[n];
    q = 0;
    for(int i=0; i<n; i++){
        q = δ(q, A[i]);
        if(q == f){
//             A[i-m+1]에서 매칭이 발생했음을 알린다. 
        }
    } 
}
```

총 수행시간: O(n + 패턴 문자열*m)





### 3. 라빈-카프 알고리즘

### 4. KMP 알고리즘

### 5. 보이어-무어 알고리즘

