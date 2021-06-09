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

# Self Study 2-1
# 100과 20의 더하기, 빼기, 곱하기, 몫, 나머지, 제곱이 출력되도록 프로그램 구현

# 함수 구현 부분
def multi(v1, v2):
    CalList = []
    Sum = v1 + v2
    Diff = v1 - v2
    Share = v1 // v2
    Remain = v1 % v2
    Square = v1 ** v2

    CalList.append(Sum)
    CalList.append(Diff)
    CalList.append(Share)
    CalList.append(Remain)
    CalList.append(Square)

    return CalList

# 전역 변수 선언 부분
myList = []
Sum, Diff, Share, Remain, Square = 0, 0, 0, 0, 0

# 메인 코드 부분
if __name__ == "__main__":
    myList = multi(100, 20)
    Sum = myList[0]
    Diff = myList[1]
    Share = myList[2]
    Remain = myList[3]
    Square = myList[4]
    print("multi()에서 반환한 값 \n Sum : %d \n Diff : %d \n Share : %d \n Remain : %d \n Square : %d"
          %(Sum, Diff, Share, Remain, Square))
