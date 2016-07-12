memo = {}
memo[1] = 1

def chain(x):
	if(x == 1):
		return 1
	else:
		if x not in memo:
			if(x % 2 == 0):
				memo[x] = chain(x/2)+1
				return memo[x]
			else:
				memo[x] = chain(3*x+1)+1
				return memo[x]
		else:
			return memo[x]

result = 0
num = 0
print memo
for i in xrange(1,1000000):
	if(chain(i) > result):
		result = chain(i)
		num = i
print num