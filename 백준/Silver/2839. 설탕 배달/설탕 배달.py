import sys

N = int(sys.stdin.readline())

arr = []

for i in range(N // 3 + 2) :
    for j in range(N // 5 + 2) :
        if 3*i + 5*j == N :
            arr.append(i+j)
        
if len(arr) == 0 :
    print(-1)
else : 
    print(min(arr))