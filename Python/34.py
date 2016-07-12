import math

fact = [int(math.factorial(i)) for i in xrange(10)]

result = 0

def is_dig(x):
	origin = x
	test = 0
	while(x > 0):
		test += fact[x%10]
		x /= 10
	return origin == test

for i in xrange(10,1000000):
	if(is_dig(i)):
		result += i

print result