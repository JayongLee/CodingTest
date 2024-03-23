import sys

N = int(sys.stdin.readline())

def factorial(N) :
    if N == 0 :
        return 1
    if N == 1 :
        return 1
    else :
        return factorial(N-1) * N
        
print(factorial(N))