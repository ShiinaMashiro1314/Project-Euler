def numOfDiv(x):
	i = 2
	d = {}
	while(i*i<=x):
		if(x % i == 0):
			x /= i
			if(i in d):
				d[i] += 1
			else:
				d[i] = 1
		else:
			i += 1
	if(x != 1):
		if(x in d):
			d[x] += 1
		else:
			d[x] = 1
	result = 1
	for key in d:
		result *= (d[key]+1)
	return result

i = 7
num = i*(i+1)/2
while(numOfDiv(num)<= 500):
	i += 1
	num = i*(i+1)/2

print num