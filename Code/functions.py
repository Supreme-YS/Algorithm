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

# Code02-04 ver1
# 반환 값이 여러 개인 함수
# 함수 선언 부분
def multi(v1, v2):
    retList = [] # 반환할 리스트
    res1 = v1 + v2
    res2 = v1 - v2
    retList.append(res1)
    retList.append(res2)
    return retList # 값이 두 개가 들어있는 리스트 하나를 리턴하는 것이기 때문에 문법상 오류가 없다.

# 전역 변수 선언 부분
myList = []
Sum, Diff = 0, 0

# 메인 코드 부분 ( main 형태로 작성해 보았다. )
if __name__ == "__main__":
    myList = multi(100, 200)
    Sum = myList[0]
    Diff = myList[1]
    print("multi() ver1에서 반환한 값 ==> %d, %d" % (Sum, Diff))

# Code02-04 ver2
def multi(v1, v2):
    res1 = v1 + v2
    res2 = v1 - v2
    return res1, res2 # 값을 두 개로 리턴한다면?

# 전역 변수 선언 부분
Sum, Diff = 0, 0

# 메인 코드 부분 ( main 형태로 작성해 보았다. )
if __name__ == "__main__":
    Sum, Diff = multi(100, 200) # 두 개의 변수를 통해 값을 담으면 된다.
    print("multi() ver2에서 반환한 값 ==> %d, %d" % (Sum, Diff))