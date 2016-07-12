x = 0
a = 1
b = 1
c = 0
while(a < 4000000):
	if(a % 2 == 0):
		x += a
	c = a + b
	b = a
	a = c
print x