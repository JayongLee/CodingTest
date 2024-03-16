import sys

l = list(map(int, sys.stdin.readline().split()))

l.sort(reverse=True)

if l[0] == l[1] == l[2] :
    print(3*l[0])

elif l[0] < l[1] + l[2] :
    print(l[0] + l[1] + l[2])
    
else :
    while l[0] >= l[1] + l[2] :
        l[0] = l[0] - 1
    print(l[0] + l[1] + l[2])
    


