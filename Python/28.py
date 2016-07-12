result = 0

for i in xrange(1,1001,2):
	result += (i*i + (i+2)*(i+2)) * 5 / 2
	if(i != 1):
		result -= i*i

print result