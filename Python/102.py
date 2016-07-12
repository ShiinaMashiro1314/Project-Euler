import math

file1 = open("102.txt")

data = [line.strip().split(",") for line in file1]

for i in xrange(len(data)):
	for j in xrange(6):
		data[i][j] = int(data[i][j])

result = 0

def test(a,b,c):
	if(a<0):
		a += 2*math.pi
	if(b<0):
		b += 2*math.pi
	if(c<0):
		c += 2*math.pi
	x = min(a,b,c)
	z = max(a,b,c)
	y = a+b+c-x-z
	if(y-x > math.pi):
		return False
	if(z-y > math.pi):
		return False
	if(z-x < math.pi):
		return False
	return True

for i in xrange(len(data)):
	a = math.atan2(data[i][0],data[i][1])
	b = math.atan2(data[i][2],data[i][3])
	c = math.atan2(data[i][4],data[i][5])
	if(test(a,b,c)):
		result += 1

print result