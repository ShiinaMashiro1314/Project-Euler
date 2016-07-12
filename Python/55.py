def is_palindrome(x):
	origin = x
	y = 0
	while (x > 0):
		y = 10*y + x % 10
		x /= 10
	return (y == origin)

def next(x):
	origin = x
	y = 0
	while (x > 0):
		y = 10*y + x % 10
		x /= 10
	return origin+y

result = 0

for i in xrange(1,10000):
	k = i
	for j in xrange(50):
		k = next(k)
		if(is_palindrome(k)):
			break
		if(j == 49):
			result += 1

print result