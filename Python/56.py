def digit_sum(x):
	y = 0
	while(x>0):
		y += x%10
		x/=10
	return y

result = 0

for i in xrange(100):
	for j in xrange(100):
		n = digit_sum(int(pow(i,j)))
		if(n > result):
			result = n

print result