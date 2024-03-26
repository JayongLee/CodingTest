import sys

A, B = map(int, sys.stdin.readline().split())

test_bw = ['BWBWBWBW', 'WBWBWBWB'] * 4
test_wb = ['WBWBWBWB', 'BWBWBWBW'] * 4

N = []
for _ in range(A) :
    k = sys.stdin.readline()
    N.append(k)

dis_8_a = A - 7
dis_8_b = B - 7

error1 = 0
error2 = 0
min_e = 32
for a in range(A - 7) :
    for b in range(B - 7) :
        for i in range(8) :
            for j in range(8) :
                if test_bw[i][j] != N[i+a][j+b] :
                    error1 += 1 
                if test_wb[i][j] != N[i+a][j+b] :
                    error2 += 1
        if min_e > min(error1, error2) :
            min_e = min(error1, error2)
        error1 = 0
        error2 = 0
            
print(min_e)