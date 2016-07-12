import math

def get_digit(x):
	if(1 <= x <10):
		return x
	i = 1
	while(x > i*9*int(math.pow(10,i-1))):
		x -= i*9*int(math.pow(10,i-1))
		i += 1
	a = (x-1) / i + int(math.pow(10,i-1))
	b = i - ((x-1) % i + 1)
	return (a / (int(math.pow(10,b)))) % 10

print get_digit(1)*get_digit(10)*get_digit(100)*get_digit(1000)*get_digit(10000)*get_digit(100000)*get_digit(1000000)