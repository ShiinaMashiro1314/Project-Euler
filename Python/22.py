file1 = open("22.txt","r")
data = [line.split(",") for line in file1][0]
data.sort()

def val(x):
	result = 0
	for i in xrange(len(x)):
		if(x[i] != "\""):
			result += ord(x[i]) - ord("A") + 1
	return result

result = 0

for i in xrange(len(data)):
	result += (i+1)*val(data[i])

print result