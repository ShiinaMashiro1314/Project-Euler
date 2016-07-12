import math

def get_leng(x):
	i = 10
	while((i-1) % x != 0):
		i *= 10
	return (int(math.log10(i)))

leng = 0
result = 0
for i in xrange(1000):
	if(i%2 != 0):
		if(i%5 != 0):
			x = get_leng(i)
			if(x>leng):
				leng = x
				result = i

print result