import sys
read = sys.stdin.readline()

c = int(read)
for i in range(c) :
    a,b = map(int, sys.stdin.readline().split())
    print(a+b)