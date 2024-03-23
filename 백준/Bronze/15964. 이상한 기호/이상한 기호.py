import sys

def gol(A,B) :
    return (A+B) * (A-B)

A,B = map(int, sys.stdin.readline().split())

print(gol(A,B))