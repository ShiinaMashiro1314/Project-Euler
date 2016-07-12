import copy
import math

def is_prime(x):
	if(x <= 1):
		return False
	if(x == 2):
		return True
	for i in xrange(2,int(math.floor(math.sqrt(x)))+1):
		if(x % i == 0):
			return False
	return True

def test(a,b,c,d):
	l1 = [a,b,c,d]
	e = []
	n = 1000*a+100*b+10*c+d
	e.append(n)
	for i in l1:
		l2 = copy.deepcopy(l1)
		l2.remove(i)
		for j in l2:
			l3 = copy.deepcopy(l2)
			l3.remove(j)
			for k in l3:
				l4 = copy.deepcopy(l3)
				l4.remove(k)
				for l in l4:
					if(is_prime(1000*i+100*j+10*k+l)):
						if(not (1000*i+100*j+10*k+l) in e):
							e.append(1000*i+100*j+10*k+l)
	for i in xrange(1,len(e)):
		if(e[i]>n):
			if((2*e[i]-n) in e):
				return (True,n*100000000+e[i]*10000+2*e[i]-n)
	return(False,0)


# for i in xrange(1,10):
# 	l1 = [0,1,2,3,4,5,6,7,8,9]
# 	l1.remove(i)
# 	for j in l1:
# 		l2 = copy.deepcopy(l1)
# 		l2.remove(j)
# 		for k in l2:
# 			l3 = copy.deepcopy(l2)
# 			l3.remove(k)
# 			for l in l3:
# 				if(is_prime(1000*i+100*j+10*k+l)):
# 					print 1000*i+100*j+10*k+l
# 					if(test(i,j,k,l)[0]):
# 						print test(i,j,k,l)[1]

for a in xrange(1,10):
	for b in xrange(10):
		for c in xrange(10):
			for d in xrange(10):
				if(is_prime(1000*a+100*b+10*c+d)):
					if(test(a,b,c,d)[0]):
						print test(a,b,c,d)[1]