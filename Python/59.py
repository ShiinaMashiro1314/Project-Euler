import copy
import enchant
d = enchant.Dict("en_US")

file1 = open("59.txt","r")

data = [line.strip().split(",") for line in file1][0]

data1 = [int(x) for x in data]

m = 0

# for i in xrange(97,123):
# 	for j in xrange(97,123):
# 		for l in xrange(97,123):
# 			key = [i,j,l]
# 			data2 = copy.deepcopy(data1)
# 			words = 0
# 			for k in xrange(len(data2)):
# 				data2[k] = chr(data2[k] ^ key[k%3])
# 			test = ""
# 			for k in xrange(len(data2)):
# 				if(65<=ord(data2[k])<=122):
# 					test += data2[k]
# 					if(k == len(data2)-1):
# 						if(d.check(tets)):
# 							words += 1
# 				else:
# 					if(test == ""):
# 						continue
# 					if(d.check(test)):
# 						words += 1
# 						test = ""
# 					else:
# 						test = ""
# 						continue
# 			if(words>m):
# 				m = words
# 				print key

key = [103, 111, 100]

for i in xrange(len(data1)):
	data1[i] = chr(data1[i] ^ key[i%3])

print data1

result = 0

for i in xrange(len(data1)):
	result += ord(data1[i])

print result