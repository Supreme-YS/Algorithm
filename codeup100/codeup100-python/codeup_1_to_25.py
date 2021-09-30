#1
print("hello")

#2
print("Hello World")

#3
print("Hello")
print("World")

#4
print("'Hello'")

#5
print('"Hello World"')

#6
print("\"!@#$%^&*()\"")

#7
print("\"C:\Download\hello.cpp\"")

#8
print('\u250C\u252C\u2510')
print('\u251C\u253C\u2524')
print('\u2514\u2534\u2518')

#10
i = int(input())
print(i)

#11
s = str(input())
print(s)

#12
f = float(input())
print(f)

#13
#input().split() 는 각각의 입력값이 공백으로 구분되어 있다는 뜻
#int : 정수형으로 바꿔줌
#map : 배열(iterable)의 객체를 int형으로 매핑(감싸준다.) map은 iterable 객체만 적용할 수 있다.
#iterable 객체 : List, Tuple, Dictionary 등과 같은 객체
a, b = map(int, input().split())
print(a,b)

#14
a, b = map(str, input().split())
print(b, a)

#15
round_f = float(input())
print("%.2f"%round_f)

#17
three_times = int(input())
print(three_times, end=' ')
print(three_times, end=' ')
print(three_times, end=' ')

#17-1
#위의 결과는 같음
three_times = int(input())
print(three_times,three_times,three_times)

#18
h, m = map(str, input().split(":"))
print(h+":"+m)

#19
year, month, day = input().split('.')
print('{0}.{1}.{2}'.format(year.zfill(4), month.zfill(2), day.zfill(2)))

#20
first, second = map(int, input().split("-"))
print("%s--%s"%(first,second))

#21
a = input()
print(a)

#22
string = input()
print(string)

#23
i, f = map(int, input().split('.'))
print("정수부 : %d"%i)
print("실수부 : 0.%d"%f)

#24
string = input()
for i in string:
    print(i)

#25
integer = input()
count = 5
for i in integer:
    count -= 1
    print([int(i+'0'*count)])