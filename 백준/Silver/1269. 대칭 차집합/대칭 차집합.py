import sys

# X, Y, Z = map(int, sys.stdin.readline().split())
N, M = map(int, sys.stdin.readline().split())

s1 = set(map(int, sys.stdin.readline().split()))

s2 = set(map(int, sys.stdin.readline().split()))

print(len(s1 - s2) + len(s2 - s1))
