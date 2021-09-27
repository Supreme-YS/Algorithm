katok = []
katok.append(None)

배열길이 = len(katok)
katok[배열길이-1] = '다현'
print(katok)

# 새로운 데이터 삽입
katok.append(None)
print(katok)

배열길이 = len(katok)
katok[배열길이-1] = '정연'
print(katok)

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

print(katok)