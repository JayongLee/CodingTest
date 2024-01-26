import sys
read = sys.stdin.readline()

N , X = map(int, read.split())
    
line = list(map(int, sys.stdin.readline().split()))
f = []
for i in range(len(line)) :
    if (line[i] < X) :
        print(line[i], end=" ")
    
