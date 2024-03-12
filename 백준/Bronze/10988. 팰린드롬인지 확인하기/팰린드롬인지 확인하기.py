import sys 
# x, y = map(int, sys.stdin.readline().split())
X = input()

result = 1

for i in range(len(X) // 2) :
    if X[i] != X[-(i+1)] :
        result = 0
        break
    
print(result)