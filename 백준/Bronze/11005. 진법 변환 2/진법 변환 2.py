import sys

N, B = map(int, sys.stdin.readline().split())

arr = []
while N != 0 :
    arr.append(N % B)
    N = N // B

arr.reverse()

result = ''
for i in range(len(arr)) :
    if arr[i] < 10 :
        result += str(arr[i])
        
    else :
        result += chr(arr[i] + 55)
        
print(result)