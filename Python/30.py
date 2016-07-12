import math

# for a in xrange(10):
# 	for b in xrange(10):
# 		for c in xrange(10):
# 			for d in xrange(10):
# 				for e in xrange(10):
# 					for f in xrange(10):

def is_fifth(x):
	origin = x
	test = 0
	while(x>0):
		test += math.pow(x%10,5)
		x /= 10
	return test == origin

result = 0

for i in xrange(10,1000000):
	if(is_fifth(i)):
		result += i

print result