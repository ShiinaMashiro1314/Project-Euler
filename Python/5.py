def gcd(a,b):
	if(b == 0):
		return a
	if(a < b):
		return gcd(b,a)
	else:
		return gcd(a%b,b)

def lcm(a,b):
	return a*b/gcd(a,b)

result = 1

for i in xrange(1,21):
	result = lcm(i,result)

print result