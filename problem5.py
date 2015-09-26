from fractions import gcd

#lcm(a,b) = (a*b) / gcd(a,b)
#number theory

lcm = 1
for i in xrange(1, 21):
    lcm = (i * lcm)/gcd(i, lcm)
print str(lcm)
