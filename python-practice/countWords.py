# 진달래꽃 시에서 4회 이상 나온 글자를 세보기

# 전역 변수 선언 부분
poet = '''
나 보기가 역겨워
가실 때에는
말없이 고이 보내드리오리다.

영변(寧邊)에 약산(藥山)
진달래꽃,
아름따다 가실 길에 뿌리오리다.

가시는 걸음 걸음
놓인 그 꽃을
사뿐히 즈려밟고 가시옵소서.

나 보기가 역겨워
가실 때에는
죽어도 아니 눈물 흘리오리다.'''

countDic = {}

# 메인 코드 부분
if __name__== "__main__":
    for ch in poet:
        if ch.isalpha(): # 영문자 또는 한글만 True를 반환 즉, 한 글자씩 체크하고 한글이나 영어일 때 True 반환
            if ch in countDic: # 추출한 문자가 딕셔너리에 있으면
                countDic[ch] += 1 # 개수 1개 증가
            else : # 추출한 문자가 딕셔너리에 없으면
                countDic[ch] = 1 # '문자':1 형식으로 딕셔너리에 추가한다.

    print('원문', poet)
    print('----------------------')
    print('문자 빈도수(4회 이상)')
    print('----------------------')
    for key in countDic: # for 문에서 key 값을 루프
        if countDic[key] >= 4: # 딕셔너리[key]의 방법으로 values값에 접근
            print(key, '-->', countDic[key])