import sys
read = sys.stdin.readline()

# N , X = map(int, read.split())
N = int(read)
    
line = list(map(int, sys.stdin.readline().split()))
min = 1000000
max = -1000000
for i in range(len(line)) :
    if (line[i] < min) :
        min = line[i]
    if (line[i] > max) :
        max = line[i]
        
print(f"{min} {max}")
    
