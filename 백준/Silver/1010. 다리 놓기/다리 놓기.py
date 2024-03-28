import sys
import math

N = int(sys.stdin.readline())

for i in range(N) :
    A, B = map(int, sys.stdin.readline().split())
    k = math.comb(B, A)
    print(k)