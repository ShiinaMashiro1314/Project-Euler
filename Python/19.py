
result = 0

t = 2

for i in xrange(1901,2001):
	for j in xrange(1,13):
		print(i,j,t)
		if(t == 0):
			result += 1
		if(j == 2):
			if(i%4 == 0):
				t = (t+1)%7
		elif(j in [4,6,9,11]):
			t = (t+2)%7
		else:
			t = (t+3)%7

print result