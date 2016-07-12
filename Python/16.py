import math
x = int(math.pow(2,1000))
result = 0
while(x>0):
	result += x%10
	x /= 10
print result