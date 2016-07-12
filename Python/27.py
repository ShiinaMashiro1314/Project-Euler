import math

n = 100000

isprime = [True for i in xrange(n)]

isprime[0] = False
isprime[1] = False

for i in xrange(2,int(math.floor(math.sqrt(n)))+1):
	for j in xrange(i,n/i):
		isprime[i*j] = False

def get_leng(i,j):
	n = 1
	check = n*n + i*n + j
	while(isprime[check]):
		n += 1
		check = n*n + i*n + j
	return n-1


leng = 0
result = 0

for i in xrange(-999,1000):
	for j in xrange(1000):
		if(isprime[j]):
			n = get_leng(i,j)
			if(n>leng):
				leng = n
				result = i*j

print result