for a in xrange(1,10):
	for b in xrange(a,10):
		for c in xrange(10):
			if((10*a+b)*c == (10*b+c)*a):
				print (a,b,c)