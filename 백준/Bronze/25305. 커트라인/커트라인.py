import sys

N , M= map(int, sys.stdin.readline().split())

arr = list(map(int, sys.stdin.readline().split()))

    
def insertion_sort(arr, n) :
    for i in range(1, n) :
        key = arr[i]
        j = i-1
        while j >= 0 and arr[j] > key :
            arr[j+1] = arr[j]
            j = j-1
        arr[j+1] = key
        
insertion_sort(arr, N)

print(arr[-M])