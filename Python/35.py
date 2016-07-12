import math

n = 1000001

isprime = [True for i in xrange(n)]

isprime[0] = False
isprime[1] = False

for i in xrange(2,int(math.floor(math.sqrt(n)))+1):
	for j in xrange(i,n/i+1):
		if(i*j<n):
			isprime[i*j] = False

result = 13

def is_cir(x):
	if(not isprime[x]):
		return False
	digits = int(math.floor(math.log10(x))) + 1
	for i in xrange(digits):
		x = x%10*int(math.pow(10,digits-1)) + x/10
		if(not isprime[x]):
			return False
	return True

for i in xrange(100,1000000):
	if(is_cir(i)):
		result += 1

print result