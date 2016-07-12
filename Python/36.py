def is_pal(x,b):
	origin = x
	test = 0
	while(x>0):
		test = b*test + x%b
		x /= b
	return origin == test

result = 0

for i in xrange(1,1000000):
	if(is_pal(i,10) & is_pal(i,2)):
		result += i

print result