import math
import copy

def is_prime(x):
	if(x <= 1):
		return False
	if(x == 2):
		return True
	for i in xrange(2,int(math.floor(math.sqrt(x)))+1):
		if(x % i == 0):
			return False
	return True



for x1 in xrange(7,0,-1):
	l1 = [7,6,5,4,3,2,1]
	l1.remove(x1)
	for x2 in l1:
		l2 = copy.deepcopy(l1)
		l2.remove(x2)
		for x3 in l2:
			l3 = copy.deepcopy(l2)
			l3.remove(x3)
			for x4 in l3:
				l4 = copy.deepcopy(l3)
				l4.remove(x4)
				for x5 in l4:
					l5 = copy.deepcopy(l4)
					l5.remove(x5)
					for x6 in l5:
						l6 = copy.deepcopy(l5)
						l6.remove(x6)
						for x7 in l6:
							test = int(x1*math.pow(10,6)+x2*math.pow(10,5)+x3*math.pow(10,4)+x4*math.pow(10,3)+x5*math.pow(10,2)+x6*math.pow(10,1)+x7)
							if(is_prime(test)):
								print test
							