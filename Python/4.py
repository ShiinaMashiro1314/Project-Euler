def is_palindrome(x):
	origin = x
	y = 0
	while (x > 0):
		y = 10*y + x % 10
		x /= 10
	return (y == origin)
result = 0
for i in xrange(900,999):
	for j in xrange(900,999):
		if(is_palindrome(i*j)):
			if(i*j>result):
				result = i*j
print result