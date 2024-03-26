import sys

N = int(sys.stdin.readline())

arr = []
for i in range(N) :
    arr.append(int(sys.stdin.readline()))
    
def insertion_sort(arr, n) :
    for i in range(1, n) :
        key = arr[i]
        j = i-1
        while j >= 0 and arr[j] > key :
            arr[j+1] = arr[j]
            j = j-1
        arr[j+1] = key
        
insertion_sort(arr, N)

for i in range(N) :
    print(arr[i])