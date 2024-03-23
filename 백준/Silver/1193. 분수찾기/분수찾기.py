import sys

# X, Y, Z = map(int, sys.stdin.readline().split())
N = int(sys.stdin.readline())

i = 1
s = 2
while True :
    if N in range((i*(i-1))//2, ((i+1)*i)//2 + 1) :
        k = N - ((i*(i-1))//2)
        if s % 2 == 0:
            print("{0}/{1}".format(s-k, k))
            break
        else :
            print("{0}/{1}".format(k,s-k))
            break
    else :
        i+=1
        s+=1

        