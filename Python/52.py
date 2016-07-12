result = 0

def num(x):
	test = x
	for i in xrange(2,x/2):
		test = test*(x-i+1)/i
		if(test > 1000000):
			break
	return (x-2*i+1)

for i in xrange(23,101):
	result += num(i)

print result