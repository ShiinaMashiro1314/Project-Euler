import math

# x = 1
# for i in xrange(1,11):
# 	p = pow(5,i)
# 	for j in xrange(1,6):
# 		if(x*j > 100):
# 			test = pow(2,100) % p
# 			test = pow(test,(x*j/100))
# 		else:
# 			test = pow(2,x*j)
# 		if(test % p == 1):
# 			x = x*j
# 			break

# print x

# t = 5

x = pow(5,9)*4

print 7830457%x

print pow(2,17957) % pow(5,10)

print (3038247*28433) % pow(5,10) + 1

for i in xrange(pow(2,10)):
	if((9523827+pow(5,10)*i) % pow(2,10) == 1):
		print 9523827+pow(5,10)*i
		break