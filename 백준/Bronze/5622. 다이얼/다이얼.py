import sys 
# x, y = map(int, sys.stdin.readline().split())
X = input()

dic = {'ABC' : 3, 'DEF' : 4, 'GHI' : 5, 'JKL' : 6, 'MNO' : 7, 'PQRS' : 8, 'TUV' : 9, 'WXYZ' : 10}
alpha = list(dic.keys())
total = 0

for i in range(len(X)) :
    x = X[i]
    for j in range(len(alpha)) :
        if x in alpha[j] :
            total += dic[alpha[j]]
            
print(total)