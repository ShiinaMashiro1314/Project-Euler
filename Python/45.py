import math

def is_pen(x):
	y = int(math.sqrt(1+24*x))
	return (y%6 == 5) & (y*y == 1+24*x)

i = 144
test = i*(2*i-1)

while(not is_pen(test)):
	i += 1
	test = i*(2*i-1)

print test