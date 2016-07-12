d = {}

def is_pan(i,j,k):
	c = {}
	c[0] = 1
	while(i>0):
		if(not (i%10) in c):
			c[i%10] = 1
			i /= 10
		else:
			return False
	while(j>0):
		if(not (j%10) in c):
			c[j%10] = 1
			j /= 10
		else:
			return False
	while(k>0):
		if(not (k%10) in c):
			c[k%10] = 1
			k /= 10
		else:
			return False
	return len(c) == 10

for i in xrange(1,10):
	for j in xrange(1000,10000):
		if(i*j<10000):
			if(is_pan(i,j,i*j)):
				if(not (i*j) in d):
					d[i*j] = 1

for i in xrange(10,100):
	for j in xrange(100,1000):
		if(i*j<10000):
			if(is_pan(i,j,i*j)):
				if(not (i*j) in d):
					d[i*j] = 1

result = 0

for key in d:
	result += key

print result
print d