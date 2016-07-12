import math

d = {}

for i in xrange(2,101):
	for j in xrange(2,101):
		n = math.pow(i,j)
		if(not n in d):
			d[n] = 1

print(len(d))