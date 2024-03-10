import sys 
# x, y = map(int, sys.stdin.readline().split())
A , B = sys.stdin.readline().split()

for i in range(len(A)) :
    a = int(A[len(A) - (i+1)])
    b = int(B[len(B) - (i+1)])
    
    r_a = A[2] + A[1] + A[0]
    r_b = B[2] + B[1] + B[0]
    
    if a > b :
        print(r_a)
        break
    elif a < b :
        print(r_b)
        break