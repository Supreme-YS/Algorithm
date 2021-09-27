katok = ["다현", "정연", "쯔위", "사나", "지효"]
print(katok)

# 만약 새로운 데이터를 끝에 삽입한다면?
# 1. 선형 리스트에 빈칸을 추가한다.
# 2. 추가한 빈칸에 새로운 데이터를 삽입한다.
katok.append(None)
print(katok)

katok[5] = "모모"
print(katok)

# 만약 선형 리스트 중간에 새로운 데이터를 삽입한다면?
# 4번째 위치에 새로운 데이터를 삽입해보자
# 1. 선형 리스트에 빈칸을 추가한다.
# 2. 맨 마지막 데이터(6번째 데이터)를 한칸 씩 옮기면서 기존 위치를 비워준다.
katok.append(None)
print(katok)

katok[6] = katok[5] # 6번째 데이터를 맨 마지막 칸으로 옮긴 후,
katok[5] = None     # 빈칸으로 만들기
print(katok)
katok[5] = katok[4]
katok[4] = None
print(katok)
katok[4] = katok[3]
katok[3] = None
print(katok)

katok[3] = "미나" # 지정된 위치에 새로운 데이터 삽입
print(katok)

# 데이터 삭제
# 5번째 위치의 데이터를 삭제한다면?
# 1. 지정 위치 데이터를 삭제한다.
# 2. 지정 위치 뒤에 있는 데이터를 한 칸씩 앞으로 옮긴다.
# 3. 빈 자리를 del() 함수로 삭제한다.

katok[4] = None
print(katok)
katok[4] = katok[5]
katok[5] = None
print(katok)
katok[5] = katok[6]
katok[6] = None
print(katok)

del(katok[6])
print(katok)