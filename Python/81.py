import sys
file1 = open(sys.argv[1],"r")
data = [line.strip().split(",") for line in file1]
result = [[0 for i in xrange(80)] for j in xrange(80)]

for i in xrange(158,-1,-1):
	for j in xrange(80):
		if(i-j>-1):
			if(i-j<80):
				if(j == 79):
					if(i-j == 79):
						result[j][i-j] = int(data[j][i-j])
					else:
						result[j][i-j] = int(data[j][i-j]) + result[j][i-j+1]
				elif(i-j == 79):
					result[j][i-j] = int(data[j][i-j]) + result[j+1][i-j]
				else:
					result[j][i-j] = int(data[j][i-j]) + min(result[j+1][i-j],result[j][i-j+1])
print result[0][0]