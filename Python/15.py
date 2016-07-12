result = [[0 for i in xrange(21)] for i in xrange(21)]
for i in xrange(21):
	result[0][i] = 1
	result[i][0] = 1
for i in xrange(2,41):
	for j in xrange(1,21):
		if(i-j>=1):
			if(i-j<21):
				result[j][i-j] = result[j-1][i-j] + result[j][i-j-1]

print result[20][20]