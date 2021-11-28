# Algorithm

🌞 매일 아침 시작하는 알고리즘 스터디 백준 편 🌞

- Python
- Java
- JS
- C





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

1.  **Prim's Algorithm**
2.  **Kruskal's Algorithm**

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

**수행시간: ** V+E == 노드의 개수 + 간선의 개수

<img src="https://user-images.githubusercontent.com/63040492/143373462-2e487fc6-8925-458f-97e8-55292c9468a4.png" alt="image" style="zoom:60%;"/>




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
4. 아직 방문하지 않은 노드 중 가장 짧은 경로의 노드를 택한다.  - 방문했음 표시
5. 3번과 동일한 과정을 되풀이 한 후, 3번의 노드들과 겹치는 노드가 있다면 더 짧은 것을 연결되어 있는 노드에 넣어준다. 



알고리즘 순서:

1. S의 집합을 공집합으로 초기화한다.
2. 모든 정점의 최단 경로 길이(d[u])를 가장 큰 값으로 초기화를 해놓는다. 
3. 시작점은 거리가 0이기 때문에 시작점 d[r]은 0으로 초기화 해준 뒤 시작한다. 

4. 종료조건: 최소인 정점들을 뽑아서 모두 S에 넣게 되어,  총 정점의 개수와 S의 원소의 개수가 같을 시에 종료한다.

5. 메서드 extractMin(Q, d[])를 사용하여 아직 방문하지 않는 정점들 중에서 최소의 거리값을 가지고 있는 정점을 택하게 된다.

   - extractMin(Q, d[]): 집합 Q(V-S= 아직 방문하지 않은 정점들의 집합)에서 d값이 가장 작은 정점 u를 리턴한다. 

6. 선택된 정점(u)은 탐구가 되었기 때문에 집합 S에 포함시킨다.

7.  방금 선택된 정점(u)로부터 연결되어 있는 많은 정점들(v)의 집합을 모두 탐색하며,  

8.  u를 통해서 다음 연결되어 있는 정점들(v)로 가는 경로가, u를 통하지 않고 다른 경로로 v로 직접 가는 것보다 더 짧다면

9. 다음 정점을 가는  많은 경로 들 중에서 u를 경유하고 가능 경로를 택하도록 한다. // 현재 d[v]는 모두 무한대로 설정이 되어 있기 때문에 이를 간선의 값으로 바꿔줄려는 과정이기도 하다. 

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

 1.  **음의 싸이클 존재 여부 확인**: 벨만 포드 알고리즘은 노드의 값을 모두 정한 후에, 한번 더 모든 간선을 탐색하며 노드의 값들을 변경해준다. 

     만일, 노드들의 값이 모두 정해졌음에도 불구하고, 간선을 탐색하며 노드들의 값이 바뀐다면 이는 음의 가중치를 가지고 있는 간선이 있다는 의미이기 때문이다. 그렇게 된다면 우리는 그 간선을 해가 없다고 표시해준다. 

2. **집합 S 존재 여부**: 벨만 포드 알고리즘은 앞서 사용했던 집합S의 개념을 사용하지 않는다. 



알고리즘 간단개요:

​	for 문을 돌 때, 바뀐 값들을 기준으로 이어진 다음 노드 값을 정한다. 이전 단계에서 노드가 바뀌었다면, 바뀐 노드 값으로 다시 탐색하기. 같은 단계에서 노드가 겹친다면, 작은 수 정하기.



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

1. D~t~^k^:  알고리즘 수행 중 최대 k개의 간선을 거쳐, 시작 정점에서 정점 t에 이르는 최단 거리

2. 목표:D~t~^n-1^ - 자신을 제외한 간선을 모두 봐야한다.

3. 재귀적 관계:

   - d~v~^k^ = min{d~u~^k-1^ +  w~uv~}, k>0

   - d~r~ = 0

   - d~r~^0^ = 9999999, t != r

