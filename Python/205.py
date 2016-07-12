import math

dict1 = {}
for i in xrange(9,37):
	dict1[i] = 0

for a in xrange(4):
	for b in xrange(4):
		for c in xrange(4):
			for d in xrange(4):
				for e in xrange(4):
					for f in xrange(4):
						for g in xrange(4):
							for h in xrange(4):
								for i in xrange(4):
									dict1[9+a+b+c+d+e+f+g+h+i] += 1

dict2 = {}
for i in xrange(6,37):
	dict2[i] = 0

for a in xrange(6):
	for b in xrange(6):
		for c in xrange(6):
			for d in xrange(6):
				for e in xrange(6):
					for f in xrange(6):
						dict2[6+a+b+c+d+e+f] += 1

result = 0

for i in dict1:
	for j in dict2:
		if(i>j):
			result += dict1[i]*dict2[j]

print float(result)/(math.pow(4,9)*math.pow(6,6))