import sys
    
N, M = input().split()

M = int(M)
total = 0

    
for i in range(len(N)) :
    a = ord(N[i])
    if a in range(65, 91) :
        total += (a - 55) * (M**(len(N) - (i + 1)))
    elif a in range(48, 58) :
        total += (a - 48) * (M**(len(N) - (i + 1)))
        
print(total)