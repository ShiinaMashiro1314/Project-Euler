def com(a,b):
	if(b == 0):
		return 1
	if(b == a):
		return 1
	num = 1
	denum = 1
	for i in xrange(1,b+1):
		denum *= i
		num *= (a+1-i)
	return num/denum

def val(x1,x2,x3,x4,x5,x6,x7):
	num = 0
	if(x1 != 0):
		num += 1
	if(x2 != 0):
		num += 1
	if(x3 != 0):
		num += 1
	if(x4 != 0):
		num += 1
	if(x5 != 0):
		num += 1
	if(x6 != 0):
		num += 1
	if(x7 != 0):
		num += 1
	return num

result = 0

for x1 in xrange(21):
	if(x1<11):
		for x2 in xrange(0,21-x1):
			if(x2<11):
				for x3 in xrange(0,21-x1-x2):
					if(x3<11):
						for x4 in xrange(0,21-x1-x2-x3):
							if(x4<11):
								for x5 in xrange(0,21-x1-x2-x3-x4):
									if(x5<11):
										for x6 in xrange(0,21-x1-x2-x3-x4-x5):
											if(x6<11):
												x7 = 20-x1-x2-x3-x4-x5-x6
												if(x7<11):
													result += val(x1,x2,x3,x4,x5,x6,x7)*com(10,x1)*com(10,x2)*com(10,x3)*com(10,x4)*com(10,x5)*com(10,x6)*com(10,x7)

print float(result)/float(com(70,20))