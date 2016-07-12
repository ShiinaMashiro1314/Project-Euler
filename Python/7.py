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

i = 0
result = 1
while(i < 10001):
	result += 1
	if(is_prime(result)):
		i += 1

print result