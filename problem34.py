import math

finallsum = 0
fact = []
for k in range(1,11):
    fact.append(math.factorial(k))
for i in range(3,100000):
    print i
    total = 0
    word = str(i)
    for ch in word:
        total = total + fact[int(ch)-1]

    if i == total :
        finallsum = finallsum + i
        #print "Same"
        
print "SUM: " + str(finallsum)
