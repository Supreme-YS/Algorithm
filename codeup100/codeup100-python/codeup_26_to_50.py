#26
h, m, s = map(int, input().split(":"))
print(m)

#27
year, month, day = input().split('.')
if len(month) == 1:
    month = '0' + month
else:
    month

if len(day) == 1:
    day =  '0' + day
else:
    day

print(day, "-", month, "-", year)

#28
integer = int(input())
print(integer)

#29
a = float(input());
print("%.11f" % a) # 소수점 이하 11자리까지 표현

#30
a = int(input())
print(a)

#41
a = input("문자를 입력 : ")
n = ord(a) # 문자 -> 아스키 코드
character = chr(n+1) # 아스키 코드 -> 문자
print(character)

#42 몫
a, b = map(int, input().split())
print(a // b)

#43 나머지
a, b = map(int, input().split())
print(a % b)

#44
a = int(input())
print(a+1)

#45
a, b = map(int, input().split())
def total(a, b):
    hap = a + b
    cha = a - b
    gob = a * b
    mok = a // b
    nam = a % b
    gap = a / b

    print(hap, cha, gob, mok, nam, gap)

total(a, b)

#46
a, b, c = map(int, input().split())
print(a+b+c)
print("%.1f" % ((a+b+c)/3))

#47 비트연산
# >>1 : 1/2배, <<1 : 2배, <<2 : 4배 (비트연산자 계산)
n = int(input())
print(n << 1)

#48
a, b = map(int, input().split())
print(a<<b)

#49
a, b = map(int,input().split())
c = 1 if a > b else 0
print(c)

#50
a, b = map(int, input().split())
c = 1 if a == b else 0
print(c)
