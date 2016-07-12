import sys

file1 = open(sys.argv[1],"r")
data = [line.strip().split(" ") for line in file1]

result = 0

def tran(x):
	if(x[0] == "T"):
		a = 10
	elif(x[0] == "J"):
		a = 11
	elif(x[0] == "Q"):
		a = 12
	elif(x[0] == "K"):
		a = 13
	elif(x[0] == "A"):
		a = 14
	else:
		a = int(x[0])
	b = x[1]
	return (a,b)

def is_straight(a1,a2,a3,a4,a5):
	if(a1[0]+1==a2[0]):
		if(a2[0]+1==a3[0]):
			if(a3[0]+1==a4[0]):
				if(a4[0]+1==a5[0]):
					return True
	return False

def is_flush(a1,a2,a3,a4,a5):
	if(a1[1] == a2[1]):
		if(a2[1] == a3[1]):
			if(a3[1] == a4[1]):
				if(a4[1] == a5[1]):
					return True
	return False

def level(a1,a2,a3,a4,a5):
	if(a1[0] == a2[0]):
		if(a2[0] == a3[0]):
			if(a3[0] == a4[0]):
				return (7,a1[0],a5[0],0,0,0)
			elif(a4[0] == a5[0]):
				return (6,a1[0],a4[0],0,0,0)
			else:
				return (3,a1[0],a5[0],a4[0],0,0)
		elif(a3[0] == a4[0]):
			if(a4[0] == a5[0]):
				return (6,a3[0],a1[0],0,0,0)
			else:
				return (2,a3[0],a1[0],a5[0],0,0)
		elif(a4[0] == a5[0]):
			return (2,a4[0],a1[0],a3[0],0,0)
		else:
			return (1,a1[0],a5[0],a4[0],a3[0],0)
	else:
		if(a2[0] == a3[0]):
			if(a3[0] == a4[0]):
				if(a4[0] == a5[0]):
					return(7,a2[0],a1[0],0,0,0)
				else:
					return(3,a2[0],a5[0],a1[0],0,0)
			elif(a4[0] == a5[0]):
				return(2,a4[0],a2[0],a1[0],0,0)
			else:
				return(1,a2[0],a5[0],a4[0],a1[0],0)
		else:
			if(a3[0] == a4[0]):
				if(a4[0] == a5[0]):
					return(3,a3[0],a2[0],a1[0],0,0)
				else:
					return(1,a3[0],a5[0],a2[0],a1[0],0)
			elif(a4[0] == a5[0]):
				return(1,a4[0],a3[0],a2[0],a1[0],0)
			else:
				if(is_straight(a1,a2,a3,a4,a5)):
					if(is_flush(a1,a2,a3,a4,a5)):
						if(a1[0] == 10):
							return(9,0,0,0,0)
						else:
							return(8,a1[0],0,0,0,0)
					else:
						return(4,a1[0],0,0,0,0)
				elif(is_flush(a1,a2,a3,a4,a5)):
					return(5,a5[0],a4[0],a3[0],a2[0],a1[0])
				else:
					return(0,a5[0],a4[0],a3[0],a2[0],a1[0])

for i in xrange(len(data)):
	a = data[i][:5]
	b = data[i][5:]
	x = [tran(l) for l in a]
	y = [tran(l) for l in b]
	x.sort()
	y.sort()
	a1 = x[0]
	a2 = x[1]
	a3 = x[2]
	a4 = x[3]
	a5 = x[4]
	b1 = y[0]
	b2 = y[1]
	b3 = y[2]
	b4 = y[3]
	b5 = y[4]
	if(level(a1,a2,a3,a4,a5)>level(b1,b2,b3,b4,b5)):
		result += 1
print result
