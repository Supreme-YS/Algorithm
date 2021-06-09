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