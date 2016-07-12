import math
isprime = [True for i in xrange (100000001)]
print isprime
# for i in xrange(2,int(math.floor(math.sqrt(100000000)))+1):
# 	if(isprime[i]):
# 		for j in xrange(i,100000000/i+1):
# 			if(i*j<100000001):
# 				isprime[i*j] = False



def is_div(x):
	if(x == 1):
		return True
	if(x%2 == 1):
		return False
	if(x == 2):
		return True
	if(x%4 == 0):
		return False
	t = fact(x)
	if(t[0] == False):
		return False
	primes = t[1]
	l = len(primes)
	for i in xrange(int(math.pow(2,l-1))):
		factor = 1
		for j in xrange(l):
			if((i >> j) % 2 == 1):
				factor *= primes[j]
		if(isprime[factor + x/factor] == False):
			return False
	return True


def fact(x):
	result = [2]
	x /= 2
	i = 3
	while(i*i < x):
		if(x % i == 0):
			if(x % (i*i) == 0):
				return (False,[])
			else:
				result.append(i)
				x /= i
				i += 1
		else:
			i += 1
	if(isprime[x]):
		result.append(x)
		return (True,result)
	else:
		return (False,[])

result = 0

# for i in xrange(100000000):
# 	if(is_div(i)):
# 		print(i)
# 		print(fact(i)[1])
# 		result += i

# print result