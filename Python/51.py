i = 100000

def same(a,b):
	d = {}
	e = {}
	while (a>0):
		if(a%10 in d):
			d[a%10] += 1
		else:
			d[a%10] = 1
		a /= 10
	while (b>0):
		if(b%10 in e):
			e[b%10] += 1
		else:
			e[b%10] = 1
		b /= 10
	return d == e

def test(i):
	for j in xrange(2,7):
		if(not same(i,i*j)):
			return False
	return True

while(not test(i)):
	i += 1

print i