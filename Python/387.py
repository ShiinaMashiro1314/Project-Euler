import math
def is_prime(x):
	if(x == 1):
		return False
	if(x == 2):
		return True
	for i in xrange(2,int(math.floor(math.sqrt(x)))+1):
		if(x % i == 0):
			return False
	return True

def digit(x):
	tot = 0
	while(x>0):
		tot += x%10
		x /= 10
	return tot

def is_harshad(x):
	tot = 0
	origin = x
	while(x>0):
		tot += x%10
		x /= 10
	return (origin%tot == 0)

results = {}

results[1] = [1,2,3,4,5,6,7,8,9]
for i in xrange(2,14):
	results[i] = []

for i in xrange(2,14):
	for j in xrange(len(results[i-1])):
		for k in xrange(10):
			if(is_harshad(10*results[i-1][j] + k)):
				results[i].append(10*results[i-1][j] + k)
result = 0
for i in xrange(1,14):
	for j in xrange(len(results[i])):
		x = results[i][j]
		if(is_prime(x/digit(x))):
			for k in xrange(10):
				if(is_prime(10*x+k)):
					result += 10*x +k
					print 10*x+k
print result
