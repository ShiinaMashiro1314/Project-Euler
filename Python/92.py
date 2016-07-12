memo = {}
memo[1] = False
memo[89] = True

def digit_sum(x):
	y = 0
	while(x>0):
		y += (x%10)*(x%10)
		x/=10
	return y

def chain(x):
	if x in memo:
		return memo[x]
	else:
		memo[x] = chain(digit_sum(x))
		return memo[x]

result = 0

for i in xrange(1,10000000):
	if(chain(i)):
		result += 1

print result