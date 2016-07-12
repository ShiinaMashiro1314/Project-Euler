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

result = 0

for i in xrange(5,100):
	if(is_prime(i)):
		result += i - 101%i
		print (i - 101%i)

print result