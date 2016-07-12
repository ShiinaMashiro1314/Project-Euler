l = []

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

for i in xrange(1000):
	if(is_prime(i)):
		l.append(i)

memo = {}

def num(x,l,i):
	if x in memo:
		return memo[x]
	if(l[0] > x):
		return (False,0)
	if(l[0] == x):
		return (True,1)
	if(l[0] < x):
		if(i == 1):
			n = num(x-l[0],l[1:],1)
			if(n[0]):
				return (True,n[1]+1)
			else:
				return (False,0)
		else:
			n = num(x-l[0],l[1:],1)
			m = num(x,l[1:],0)
			if(n[0] and m[0]):
				return(True,max(m[1],n[1]+1))
			if(n[0]):
				return(True,n[1]+1)
			if(m[0]):
				return(True,m[1])
			else:
				return(False,0)

result = 0
t = 0

for j in l:
	x = num(j,l,0)
	if(x[1] > result):
		result = x[1]
		t = j

print result
print t

s = 0
for i in xrange(3,24):
	s += l[i]
print s