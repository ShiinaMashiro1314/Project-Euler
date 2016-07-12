import math
def sum1(x):
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

def is_abundant(x):
	return sum1(x)>x

abundant = []
for i in xrange(2,28124):
	if(is_abundant(i)):
		abundant.append(i)

result = 0
l = [True for i in xrange(28125)]

for i in xrange(len(abundant)):
	for j in xrange(len(abundant)):
		if(abundant[i]+abundant[j]<28125):
			l[abundant[i]+abundant[j]] = False

for i in xrange(28124):
	if(l[i]):
		result += i
		print i

print result