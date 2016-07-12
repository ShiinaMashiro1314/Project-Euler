def binom(a,b):
	x = 1
	y = 1
	for i in xrange(b):
		x *= (a-i)
		y *= (i+1)
	return x/y

def multichoose(a,b):
	return binom(a+b-1,b)

print 7376507
print pow(25,0.5)	
print pow((43165576245*43165576245-1)/149,0.5)
print pow((113668958026*113668958026 - 1 )/ 997,0.5)
print 353625348814 - 271605068780	