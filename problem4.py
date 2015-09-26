def ispalidromic(x):
    a = x
    b = x[::-1]
    if a == b :
        return 1
    else:
        return 0

maxvalue = 0
for i in range(100,1000):
    for j in range(100,1000):
        res = i * j
        word = str(res)
        k = ispalidromic(word)
        if k:
            if res > maxvalue :
                maxvalue = res
                print "Result : " + str(maxvalue)
