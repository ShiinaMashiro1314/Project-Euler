import math
x = math.factorial(100)
result = 0
while(x>0):
	result += x%10
	x /= 10
print result