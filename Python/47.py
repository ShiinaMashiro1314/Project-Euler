def numOfPrimeFact(x):
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
	return len(d)

i = 2

while(True):
	if(numOfPrimeFact(i) == 4 & numOfPrimeFact(i+1) == 4 & numOfPrimeFact(i+2) == 4 & numOfPrimeFact(i+3) == 4):
		print i
		break
	i += 1