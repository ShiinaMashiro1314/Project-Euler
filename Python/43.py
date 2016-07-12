import math
import copy

result = 0
for x1 in xrange(1,10):
	l1 = [9,8,7,6,5,4,3,2,1,0]
	l1.remove(x1)
	for x2 in l1:
		l2 = copy.deepcopy(l1)
		l2.remove(x2)
		for x3 in l2:
			l3 = copy.deepcopy(l2)
			l3.remove(x3)
			for x4 in l3:
				if(x4 % 2 == 0):
					l4 = copy.deepcopy(l3)
					l4.remove(x4)
					for x5 in l4:
						if((x3+x4+x5) % 3 == 0):
							l5 = copy.deepcopy(l4)
							l5.remove(x5)
							for x6 in l5:
								if(x6 % 5 == 0):
									l6 = copy.deepcopy(l5)
									l6.remove(x6)
									for x7 in l6:
										if((2*x5+3*x6+x7) % 7 == 0):
											l7 = copy.deepcopy(l6)
											l7.remove(x7)
											for x8 in l7:
												if((x6+x8-x7) % 11 == 0):
													l8 = copy.deepcopy(l7)
													l8.remove(x8)
													for x9 in l8:
														if((100*x7+10*x8+x9)%13 == 0):
															l9 = copy.deepcopy(l8)
															l9.remove(x9)
															for x10 in l9:
																if((100*x8+10*x9+x10)%17 == 0):
																	result += x1*int(math.pow(10,9))+x2*int(math.pow(10,8))+x3*int(math.pow(10,7))+x4*int(math.pow(10,6))+x5*int(math.pow(10,5))+x6*int(math.pow(10,4))+x7*1000+x8*100+x9*10+x10
																	print x1*int(math.pow(10,9))+x2*int(math.pow(10,8))+x3*int(math.pow(10,7))+x4*int(math.pow(10,6))+x5*int(math.pow(10,5))+x6*int(math.pow(10,4))+x7*1000+x8*100+x9*10+x10
print result