import sys
read = sys.stdin.readline()

N = int(read)
    
line = list(map(int, sys.stdin.readline().split()))
v = int(sys.stdin.readline())
count = 0

for i in range(len(line)) :
    if (line[i] == v) :
        count += 1
    
print(count)