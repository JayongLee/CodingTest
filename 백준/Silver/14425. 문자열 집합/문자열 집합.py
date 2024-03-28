import sys

# N , M= map(int, sys.stdin.readline().split())
a, b = map(int, sys.stdin.readline().split())

arr = []

for i in range(a) :
    arr.append(sys.stdin.readline())

set1 = tuple(arr)

count = 0

for i in range(b) :
    k = sys.stdin.readline()
    if k in set1 :
        count += 1

print(count)