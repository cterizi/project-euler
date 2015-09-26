#http://www.robertdickau.com/lattices.html
#https://en.wikipedia.org/wiki/Lattice_path

#20x20 grid


import math
i = 20
j = 20

def latticePath(i,j):
    a = math.factorial(i + j)
    b = math.factorial(i)**2
    x = a / b
    print str(x)

latticePath(i,j)
