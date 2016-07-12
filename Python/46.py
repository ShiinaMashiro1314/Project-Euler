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

i = 35

while(True):
	if(not is_prime(i)):
		k = 0
		for j in xrange(1,int(math.floor(math.sqrt(i/2)))+2):
			if(is_prime(i - 2*j*j)):
				i += 2
				k = 1
				break
		if(k == 1):
			continue
		else:
			print i
			break
	else:
		i += 2