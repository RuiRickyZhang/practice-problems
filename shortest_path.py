import numpy as np
#sp = [[[0 for i in range(4)]for j in range(4)]for l in range(4)]
INF = 9999

def shortest_path(graph, u, v, k):
    V = 4
    sp = np.zeros((4,4,k+1))
    print(sp)
    for step in range(0,k):

        for a in range(0,V):

            for b in range(0,V):
                print(a,"",b," ",step)
                sp[a][b][step] = INF
                if(step==0 and a==b):
                    sp[a][b][step] = 0
                    print(a, "", b, "equals to zero, step: ", step)
                if(step == 1 and graph[a][b]!=INF):
                    sp[a][b][step] = graph[a][b]
                    print(a, "", b, "is reachable for ", graph[a][b])
                if(step > 1):
                    for c in range(0,V):
                        if(graph[a][c]!=INF and a!=c and b!=c and a!=b and sp[c][b][step-1]!=INF):
                            sp[a][b][step] = min(sp[a][b][step-1], graph[a][c] + sp[c][b][step - 1])
                            print(a," to ",b," via ",c," is ",sp[a][b][step])
            print("At ",step," ",sp[u][v][step])
    return sp[u][v][k-1]
pic = [[0,INF,122,INF],[INF,0,INF,50],[341,INF,0,205],[INF,INF,186,0]]
res = shortest_path(pic, 0, 3, 3)
print(res)

