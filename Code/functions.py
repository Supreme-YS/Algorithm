# Code02-01
# 함수 선언 부분
def plus(v1, v2):
    result = 0
    result = v1 + v2
    return result

# 전역 변수 선언 부분
total = 0

# 메인 코드 부분
total = plus(100, 200)
print("plus() 함수의 결과값 : %d" % total)

# 메인 코드 부분 ver2
if __name__ == "__main__":
    total = plus(100, 200)
    print("plus() 함수의 결과값 : %d" % total)

# Code02-02
# 함수 선언 부분
def func1():
    a = 10 # 지역 변수
    print("func1()에서 a의 값 %d" % a)

def func2():
    print("func2()에서 a의 값 %d" % a)

# 전역 변수 선언 부분
a = 20

# 메인 코드 부분
func1()
func2()

# Code02-03
def func1():
    global a # 이 함수 안에서 a는 전역 변수
    a = 10
    print("func1()에서 a의 값 %d" % a)

def func2():
    print("func2()에서 a의 값 %d" % a)

# 함수 변수 선언 부분
a = 20 # 전역 변수

# 메인 코드 부분
func1() # 10 출력
func2() # 10 출력
## 3행에서 global 예약어를 사용해서 a를 전역 변수로 지정했기 때문에 지역 변수 a는 존재하지 않는다. 따라서 모두 10 출력