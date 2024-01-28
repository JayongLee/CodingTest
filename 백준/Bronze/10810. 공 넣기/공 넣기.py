import sys
read = sys.stdin.readline()

N , M = map(int, read.split())

arr = []
for i in range(N) :
    arr.append(0)

for s in range(M) : 
    i, j, k = map(int, sys.stdin.readline().split())
    for index in range(i-1, j) :
        arr[index] = k

for k in range(len(arr)) :
    print(arr[k], end=" ")