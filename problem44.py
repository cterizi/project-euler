import math

def pentagon(n):
    #type for pentagon number : n(3n-1)/2
    return (n * ((3 * n) - 1)) / 2

def isPentagon(x):
    #type for check in wiki
    n = ( math.sqrt( (24 * x) + 1 ) + 1 ) / 6
    if n == int(n) and n > 0:
        return 1
        #isPentagon
    else:
        return 0
        #isnotPentago

k = 0
D = 0
exitwhile = 0
pentagonalsNumbers = []

while True:
    k = k + 1
    penNum = pentagon(k)

    for l in pentagonalsNumbers:
        sum = penNum + l
        if isPentagon(sum):
            D = abs( penNum - l )
            if isPentagon(D):
                print "Result is " + str(D)
                exitwhile = 1
                break

    if exitwhile == 1:
        break

    pentagonalsNumbers.append(penNum)

    
