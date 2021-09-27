# 선형 리스트의 일반 구현
katok = []
print("빈 배열 생성 : ", katok)

katok.append(None)
print("빈 배열에 None 추가 : ", katok)

배열길이 = len(katok)
print("배열의 길이 : ", 배열길이)

katok[배열길이-1] = '다현'
print("리스트 첫번째 자리에 데이터 삽입 : ", katok)

# 새로운 데이터 삽입
katok.append(None)
print("새로운 배열 칸 추가 : ", katok)

배열길이 = len(katok)
katok[배열길이-1] = '정연'
print("추가된 칸에 데이터 삽입 : ", katok)

# 위 과정을 함수로 만들어 보자
katok = []

def add_data(friend):
    katok.append(None)
    arrayLen = len(katok)
    katok[arrayLen - 1] = friend

add_data('다현')
add_data('정연')
add_data('쯔위')
add_data('사나')
add_data('지효')

print("함수를 이용한 배열 생성 : ", katok)