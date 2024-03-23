import sys

N = int(sys.stdin.readline())

count = 0 

for i in range(666, 66666666) :
    if '666' in str(i) :
        count += 1
        
    if count == N :
        print(i)
        break
