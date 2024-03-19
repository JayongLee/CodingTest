import sys

# X, Y, Z = map(int, sys.stdin.readline().split())
N = int(sys.stdin.readline())

arr = set(map(int, sys.stdin.readline().split()))

M = int(sys.stdin.readline())

arr2 = list(map(int, sys.stdin.readline().split()))

for i in range(M) :
    if arr2[i] in arr :
        print(1, end=" ")
    else :
        print(0, end=" ")
        
