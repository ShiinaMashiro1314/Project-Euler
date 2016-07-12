import math
import sys

file1 = open(sys.argv[1],"r")
data = [line.strip().split(",") for line in file1]
for i in xrange(len(data)):
	data[i].append(i+1)

def compare(x,y):
	a = int(x[0])
	b = int(x[1])
	c = int(y[0])
	d = int(y[1])
	if(a<c & b<d):
		return -1
	if(a>c & b>d):
		return 1
	if(a==c):
		if(b==d):
			return 0
		if(b<d):
			return -1
		else:
			return 1
	if(a<c & b==d):
		return -1
	if(a>c & b==d):
		return 1
	if(a<c & b>d):
		x = math.pow(a,float(b)/float(d))
		if(x<c):
			return -1
		else:
			return 1
	else:
		x = math.pow(c,float(d)/float(b))
		if(a<x):
			return -1
		else:
			return 1

print sorted(data,cmp = compare)[len(data)-1][2]