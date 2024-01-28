import sys
#read = sys.stdin.readline()

#N , M = map(int, read.split())

arr = []
max = 0
index = 0

for i in range(9) :
    value =int(sys.stdin.readline())
    arr.append(value)
    if (value > max) :
        max = arr[i]
        index = arr.index(max) + 1
    
print(max)
print(index)