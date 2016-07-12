l = []

import math
def is_prime(x):
	if(x <= 1):
		return False
	if(x == 2):
		return True
	for i in xrange(2,int(math.floor(math.sqrt(x)))+1):
		if(x % i == 0):
			return False
	return True

for i in xrange(10000):
	if(is_prime(i)):
		l.append(i)

p = 0
a = 3
b = 543
for i in xrange(a,a+b):
	p += l[i]
print p
print is_prime(p)