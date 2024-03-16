import sys

x = []
y = []

for _ in range(3) :
    X, Y = map(int, sys.stdin.readline().split())
    x.append(X)
    y.append(Y)

Y = 0
X = 0 
 
for i in range(3) :
    if x.count(x[i]) == 1 :
        X = x[i]
    
    if y.count(y[i]) == 1 :
        Y = y[i]
        
print(X, Y)
