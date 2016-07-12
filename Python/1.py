result = 0
for x in xrange(1000):
	if(x % 3 == 0):
		result += x
		continue
	if(x % 5 == 0):
		result += x
print result