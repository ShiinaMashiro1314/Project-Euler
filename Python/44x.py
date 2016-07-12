
n = 1000000

l = [0 for i in xrange(n)]

for i in xrange(n):
	l[i] = i*(3*i-1)/2

for i in xrange(len(l)/3):
	print i
	for j in xrange(i+1,min(l[i]/3,len(l)-1)+1):
		if((l[i] + l[j]) in l):
			if((l[i] + 2*l[j]) in l):
				print l[i]
