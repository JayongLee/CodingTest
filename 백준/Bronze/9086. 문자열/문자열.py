import sys
    
# N, M = map(int, sys.stdin.readline().split())
N = int(sys.stdin.readline())
for i in range(N) :
    sentense = input()
    print(sentense[0]+sentense[-1])
