import sys
read = sys.stdin.readline()

c = int(read)
for i in range(1, c+1) :
    a,b = map(int, sys.stdin.readline().split())
    print(f"Case #{i}: {a} + {b} = {a+b}")