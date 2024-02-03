import sys

arr = list(map(int, sys.stdin.readline().split()))

chess = [1, 1, 2, 2, 2, 8]

new = []
for i in range(len(chess)) :
    new.append(chess[i] - arr[i])
    
for i in range(len(new)) :
    print(new[i], end=" ")