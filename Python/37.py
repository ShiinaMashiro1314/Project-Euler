import math

n = 1000001

isprime = [True for i in xrange(n)]

isprime[0] = False
isprime[1] = False

for i in xrange(2,int(math.floor(math.sqrt(n)))+1):
	for j in xrange(i,n/i+1):
		if(i*j<n):
			isprime[i*j] = False


d = {}
d[1] = [3,7]

for i in xrange(2,6):
	d[i] = []
	for j in d[i-1]:
		 for k in [1,3,7,9]:
		 	if(isprime[k*int(math.pow(10,i-1))+j]):
		 		d[i].append(k*int(math.pow(10,i-1))+j)

result = 0
i = 0


def is_trun(x):
	if(not isprime[x]):
		return False
	x /= 10
	while(x>0):
		if(not isprime[x]):
			return False
		x /= 10
	return True

result = 0

i = 0

while(i<11):
	for j in xrange(1,6):
		for k in d[j]:
			for l in [2,3,5,7]:
				n = k+l*int(math.pow(10,j))
				if(is_trun(n)):
					result += n
					i += 1

print result