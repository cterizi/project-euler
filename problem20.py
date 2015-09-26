import math

sumof = 0
x = math.factorial(100)
word = str(x)
print "X: " + str(x)
for i in range(1,10):
    letter = str(i)
    flag = word.count(letter)
    sumof = sumof + (flag*i)

print "digits sum: " + str(sumof)
