n = 7
ans = [0]*(n+1)
ans[0] = 1
for i in xrange(1,n):
	for j in xrange(i,n+1):
		ans[j] += ans[j-i]
print ans[n]