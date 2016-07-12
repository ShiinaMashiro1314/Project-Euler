def num(p):
	result = 0
	for a in xrange(1,p/3+1):
		for b in xrange(a+1,p/2+1):
			c = p - a - b
			if(c > b):
				if(a*a+b*b == c*c):
					result += 1
	return result


result = 0
t = 0

for i in xrange(1000):
	n = num(i)
	if(n > result):
		result = n
		t = i

print t