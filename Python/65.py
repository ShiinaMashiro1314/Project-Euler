a = 1
b = 1

def digit_sum(x):
	y = 0
	while(x>0):
		y += x%10
		x/=10
	return y

t = 66
for i in xrange(t,0,-2):
	if(i!=t):
		temp = a + b
		a = b
		b = temp
	temp = b*i + a
	a = b
	b = temp
	temp = a + b
	a = b
	b = temp

print a+2*b
print b
print digit_sum(a+2*b)