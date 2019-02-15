import numpy as np
INF = 9999

def chaseGame(x1, y1, x2, y2, limit,N):
    dr = [2,2,1,1,-1,-1,-2,-2]
    dc = [1,-1,2,-2,2,-2,1,-1]
    fb = np.zeros((N,N))
    sb = np.zeros((N,N))
    fb[x1][y1] = 1
    sb[x2][y2] = 1
    for step in range(0, limit):
        fn = np.zeros((N,N))
        sn = np.zeros((N,N))
        for sr in range(0,N):
            for sc in range(0,N):
                for i in range(0,8):
                    cr = sr + dr[i]
                    cc = sc + dc[i]
                    if cr >0 and cr<N and cc>0 and cc<N:
                        fn[cr][cc] += fb[sr][sc]
                        sn[cr][cc] += sb[sr][sc]
        ans = check(fn,sn,N)
        print(fn)
        print(sn)
        if ans:
            return step+1

        fb = fn
        sb = sn
    raise Exception


    return

def check(fn, sn, N):
    for a in range(0,N):
        for b in range(0,N):
            if(fn[a][b]>0 and sn[a][b] > 0):
                return True
    return False

test = chaseGame(0,0,7,7,10,8)
print(test)