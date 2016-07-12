def test(x):
	for i in xrange(9,0,-1):
		if(not x % 10 == i):
			return False
		else:
			x /= 100
	return True

for i in xrange(100000000,200000000):
	if(i%10 == 3 or i%10 == 7):
		if(test(i*i)):
			print 10*i
			break