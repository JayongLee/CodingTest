import sys

A, B = map(int, sys.stdin.readline().split())

count = 0
result = 0

for i in range(1, A + 1) :
    if A % i == 0 :
        count += 1
        if count == B :
            result = i
            break

print(result)