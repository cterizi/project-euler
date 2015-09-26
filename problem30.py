x = (9**5) * 6
finallsum = 0

for i in range(2,x+1):
    finall = 0
    for j in str(i):
        finall = finall + int(j)**5

    if finall == i:
        finallsum = finallsum + i

print "SUM: " + str(finallsum)
