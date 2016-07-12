a = 1
b = 1
i = 2

def digit_num(x):
	y = 0
	while(x>0):
		y += 1
		x/=10
	return y

while(digit_num(a)<1000):
	temp = a
	a = a+b
	b = temp
	i += 1

print i