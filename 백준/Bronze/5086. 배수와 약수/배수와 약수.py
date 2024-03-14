import sys

while True :
    X , Y = map(int, sys.stdin.readline().split())
    if X == 0 and Y == 0 :
        break
    if Y % X == 0 :
        print("factor")
    elif X % Y == 0 :
        print("multiple")
    else :
        print("neither")