#1-1000
#numbers 1-9:
#one = 3, two = 3, three = 5, four = 4, five = 4, six = 3, seven = 5, eight = 5, nine = 4
#sum = 3 + 3 + 5 + 4 + 4 + 3 + 5 + 5 + 4
asum = 3 + 3 + 5 + 4 + 4 + 3 + 5 + 5 + 4

#numbers 10-19:
# ten = 3, eleven = 6, twelve = 6, thirteen = 8, fourteen = 8, fifteen = 7, sixteen = 7, seventeen = 9, eighteen = 8, nineteen = 8
bsum = 3 + 6 + 6 + 8 + 8 + 7 + 7 + 9 + 8 + 8

#numbers 20-29: 
#twenty = 6, twenty-one,two,...
csum = 6*10 + asum

#numbers 30-99:
#thirty = 6, thirty = 6, forty = 5, for-tee = 6, fifty = 5,
#sixty = 5, seventy = 7, SEV-en-tee = 8, eighty = 6, eighty-one ...
#ninety = 6, ninety-one ...
dsum =(7 * asum) + 10 * (6 + 5 + 5 + 5 + 7 + 6 + 6)

#numbers 100-999: 
#hundred = 7
esum = (9*(asum+bsum+csum+dsum)) + (7*9) + (9*99*10) + (asum * 100)

#1000:
#one thousand = 3 + 8 = 11
fsum = 11

sumfinall = asum + bsum + csum + dsum + esum + fsum

print "SUM: " + str(sumfinall)
