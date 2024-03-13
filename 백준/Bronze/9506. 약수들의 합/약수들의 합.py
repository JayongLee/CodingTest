import sys

def is_complete_num(A) :
    divide = []
    for i in range(1, A) :
        if A % i == 0 :
            divide.append(i)
    
    if sum(divide) == A :

        return print(A, " = ", " + ".join(str(i) for i in divide), sep="")
    
    else :
        return print("{0} is NOT perfect.".format(A))
        

while True :
    A = int(input()) 
    if A == -1 :
        break
    else : is_complete_num(A)