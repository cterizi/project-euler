res = []
for a in range(2,101):
    for b in range(2,101):
        x = a ** b
        if not(x in res):
            res.append(x)
        #print str(a) + "^" + str(b) + "=" + str(x)
    #print "-------------------------"

lenght = len(res)
print "L: " + str(lenght)
