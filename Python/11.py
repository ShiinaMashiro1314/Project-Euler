file1 = open("11.txt","r")
data = [line.strip().split(" ") for line in file1]

result = 0
for i in xrange(17):
	for j in xrange(17):
		a = int(data[i][j]) * int(data[i+1][j]) * int(data[i+2][j]) * int(data[i+3][j])
		b = int(data[i][j]) * int(data[i][j+1]) * int(data[i][j+2]) * int(data[i][j+3])
		c = int(data[i][j]) * int(data[i+1][j+1]) * int(data[i+2][j+2]) * int(data[i+3][j+3])
		if(max(a,b,c) > result):
			result = max(a,b,c)
for i in xrange(17):
	for j in xrange(3,20):
		a = int(data[i][j]) * int(data[i+1][j-1]) * int(data[i+2][j-2]) * int(data[i+3][j-3])
		if(a>result):
			result = a
print result