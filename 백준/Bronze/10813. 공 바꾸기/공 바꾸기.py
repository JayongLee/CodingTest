import sys

N , M = map(int, sys.stdin.readline().split())

arr = []

for i in range(N) :
    arr.append(i+1)

for k in range(M) :
    i , j = map(int, sys.stdin.readline().split())
    temp = arr[i-1]
    arr[i-1] = arr[j-1]
    arr[j-1] = temp
    
    
for k in arr :
    print(k, end=" ")