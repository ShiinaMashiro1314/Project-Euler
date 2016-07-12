import math

file1 = open("42.txt","r")
data = [line.strip().split(",") for line in file1]

result = 0

def is_tri(x):
	n = 8*x+1
	return (int(math.sqrt(n))*int(math.sqrt(n)) == n)

for i in xrange(len(data)):
	for j in xrange(len(data[i])):
		test = 0
		for k in xrange(len(data[i][j])):
			if(65 <= ord(data[i][j][k]) <= 90):
				test += ord(data[i][j][k]) - 64
		if(is_tri(test)):
			result += 1

print result