def gcd(x,y):
    r=0
    while x!=0:
        r = int(y % x)
        y = int(x)
        x = int(r)
    return y

T = int(input())
#print(gcd(5,10))
while T>0:
    T-=1
    n = int(input())
    ans = 0
    arr = [int(x) for x in input().strip().split(" ")]
    if n==1:
        print(arr[0])
    else:
        ans = arr[0]
        for p in range(1,n):
            ans = gcd(ans,arr[p])
        print(ans)