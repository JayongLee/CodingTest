import sys 
# x, y = map(int, sys.stdin.readline().split())
X = int(input())

total = 0    
    
def is_group_word(A) :
    check = []
    value = 1
    for i in range(len(A) - 1) :
        if A[i] != A[i+1] :
            if A[i] in check :
                value = 0
                break
            else : check.append(A[i])
        if i == (len(A) - 2) :
            if A[i+1] in check :
                value = 0
    
    return value

for i in range(X) :
    total += is_group_word(input())
    
print(total)

