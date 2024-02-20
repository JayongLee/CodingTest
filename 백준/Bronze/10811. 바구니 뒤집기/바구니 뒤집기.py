import sys
    
N, M = map(int, sys.stdin.readline().split())

bucket = []

for i in range(N) :
    bucket.append(i+1)

for k in range(M) :
   i, j = map(int, sys.stdin.readline().split())
   swap_list = bucket[i-1:j]
   swap_list.reverse()
   for t in range(len(swap_list)) :
       bucket[i-1] = swap_list[t]
       i += 1
       
for i in range(len(bucket)) :
    print(bucket[i], end=' ')
    
