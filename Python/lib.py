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

def binom(a,b):
	x = 1
	y = 1
	for i in xrange(b):
		x *= (a-i)
		y *= (b+1)
	return x/y

def multichoose(a,b):
	return binom(a+b-1,b)

n = 100

isprime = [True for i in xrange(n)]

isprime[0] = False
isprime[1] = False

for i in xrange(2,int(math.floor(math.sqrt(n)))+1):
	for j in xrange(i,n/i+1):
		if(i*j<n):
			isprime[i*j] = False

def is_palindrome(x):
	origin = x
	y = 0
	while (x > 0):
		y = 10*y + x % 10
		x /= 10
	return (y == origin)

def gcd(a,b):
	if(b == 0):
		return a
	if(a < b):
		return gcd(b,a)
	else:
		return gcd(a%b,b)

def lcm(a,b):
	return a*b/gcd(a,b)

def numOfDiv(x):
	i = 2
	d = {}
	while(i*i<=x):
		if(x % i == 0):
			x /= i
			if(i in d):
				d[i] += 1
			else:
				d[i] = 1
		else:
			i += 1
	if(x != 1):
		if(x in d):
			d[x] += 1
		else:
			d[x] = 1
	result = 1
	for key in d:
		result *= (d[key]+1)
	return result


def sum_proper(x):
	i = 2
	d = {}
	while(i*i<=x):
		if(x % i == 0):
			x /= i
			if(i in d):
				d[i] += 1
			else:
				d[i] = 1
		else:
			i += 1
	if(x != 1):
		if(x in d):
			d[x] += 1
		else:
			d[x] = 1
	result = 1
	tot = 0
	for key in d:
		result *= d[key]+1
	for i in xrange(result-1):
		divisor = 1
		j = i
		for key in d:
			divisor *= math.pow(key,(j%(d[key]+1)))
			j /= d[key]+1
		tot += divisor
	return int(tot)

def digit_sum(x):
	y = 0
	while(x>0):
		y += x%10
		x/=10
	return y

memo = {}
memo[1] = 1

def chain(x):
	if(x == 1):
		return 1
	else:
		if x not in memo:
			if(x % 2 == 0):
				memo[x] = chain(x/2)+1
				return memo[x]
			else:
				memo[x] = chain(3*x+1)+1
				return memo[x]
		else:
			return memo[x]

result = 0
num = 0
print memo
for i in xrange(1,1000000):
	if(chain(i) > result):
		result = chain(i)
		num = i
print num