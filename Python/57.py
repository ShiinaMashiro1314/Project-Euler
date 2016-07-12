def digit_num(x):
	y = 0
	while(x>0):
		y += 1
		x/=10
	return y

x = 1
y = 1

result = 0

for i in xrange(1000):
	temp1 = x+2*y
	temp2 = x+y
	x = temp1
	y = temp2
	if(digit_num(x)>digit_num(y)):
		result += 1

print result