file1 = open("345.txt");
data = [line.strip().split(" ") for line in file1]
data1 = []
for line in data:
	line = [int(x) for x in line if x != ""]
	data1.append(line)

pos = [(i,14-i) for i in xrange(15)]

for k in xrange(10):
	for i in xrange(14):
		for j in xrange(i+1,15):
			a = pos[i][0]
			b = pos[i][1]
			c = pos[j][0]
			d = pos[j][1]
			if(data1[a][b] + data1[c][d] < data1[a][d] + data1[c][b]):
				pos[i] = (a,d)
				pos[j] = (c,b)
	print pos

result = 0
for i in pos:
	print data1[i[0]][i[1]]
	result += data1[i[0]][i[1]]
print result