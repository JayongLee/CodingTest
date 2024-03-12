import sys 
# x, y = map(int, sys.stdin.readline().split())
# X = int(input())

total_Y = 0
total_grade = 0

dic = {"A+" : 4.5, "A0" : 4.0, "B+" : 3.5, "B0" : 3.0, "C+" : 2.5, "C0" : 2.0, "D+" : 1.5, "D0" : 1.0, "F" : 0.0}

for i in range(20) :
    X, Y, Z  = map(str, sys.stdin.readline().split())
    if Z == "P" : 
        pass
    else : 
        total_Y += float(Y)
        total_grade += (dic[Z]) * float(Y)
    
print(total_grade / total_Y)