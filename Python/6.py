def sum_square(x):
	return x*(x+1)*(2*x+1)/6

def square_sum(x):
	return x*(x+1)*x*(x+1)/4

print square_sum(100)-sum_square(100)