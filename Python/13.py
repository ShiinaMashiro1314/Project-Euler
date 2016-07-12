file1 = open("13.txt","r")
data = [int(line) for line in file1]

result = 0

for i in xrange(len(data)):
	result += data[i]

print result