result = 0
for i in xrange(1,1001):
	result += pow(i,i)
print result%pow(10,10)