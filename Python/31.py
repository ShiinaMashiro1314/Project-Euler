result = 7
for a in xrange(100):
	for b in xrange(40):
		for c in xrange(20):
			for d in xrange(10):
				for e in xrange(4):
					for f in xrange(2):
						if(200 - 2*a - 5*b - 10*c - 20*d - 50*e - 100*f >=0):
							result += 1
print result