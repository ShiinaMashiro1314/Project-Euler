file1 = open("18.txt","r")
data = [line.strip().split(" ") for line in file1]

n = len(data)

result = [[0 for i in xrange(n)] for j in xrange(n)]

for i in xrange(n):
	for j in xrange(i+1):
		if(i == 0 & j == 0):
			result[i][j] = int(data[i][j])
		elif(j == 0):
			result[i][j] = int(data[i][j]) + result[i-1][j]
		elif(j == i):
			result[i][j] = int(data[i][j]) + result[i-1][j-1]
		else:
			result[i][j] = int(data[i][j]) + max(result[i-1][j],result[i-1][j-1])

maximum = 0

for i in xrange(n):
	if(result[n-1][i] > maximum):
		maximum = result[n-1][i]

print maximum