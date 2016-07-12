p = 8
tot = 13
n = 49
i = 7

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

while(10*p>=tot):
	tot += 4
	for j in xrange(1,5):
		n += (i+1)
		if(is_prime(n)):
			p += 1
	i += 2

print i
