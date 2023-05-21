import math
t =int(input())
for i in range(t):
       a,b=input().split(" ")
       a=float(a)
       b=float(b)
       print(int(math.ceil(a/3.0))*int(math.ceil(b/3.0)))
