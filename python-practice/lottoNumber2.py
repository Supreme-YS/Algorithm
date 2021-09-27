import random

totalLotto = []
lotto = []
pickNum = 0
cnt = 0

# 메인 코드
print("** 로또 번호 생성을 시작합니다 **")
# 사용자 입력 변수
cnt = int(input("몇 번을 뽑을까요 ? "))

# 사용자 입력 횟수만큼 반복
for _ in range(cnt):
    lotto = []
    while True :
        # 1~45 숫자 중 랜덤 정수 하나 할당
        pickNum = random.randint(1, 45)

        # 할당된 숫자의 중복 방지를 위한 처리
        # 중복이 아닌 것만 lotto에 추가
        if pickNum not in lotto:
            lotto.append(pickNum)

        # 6개 이상일 때 루프를 종료
        if len(lotto) >= 6:
            break
    # 루프 종료 이후 리스트를 totalLotto에 할당
    totalLotto.append(lotto)

# totalLotto는 이중 리스트 형태 [ [], [], [], ..[] ]
# 이중 리스트 -> 단일 리스트로 하나씩 가져온 후 처리 로직
for lotto in totalLotto:
    lotto.sort()
    print('자동번호-->', end=' ')
    for i in range(0, 6):
        print("%2d" % lotto[i], end=' ')
