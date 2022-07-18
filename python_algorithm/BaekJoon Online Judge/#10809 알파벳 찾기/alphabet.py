S = input()

# 알파벳 소문자 갯수만큼 -1로 초기화
result = []

for i in range(97, 123):
    result.append(-1)

if len(S) <= 100 and S.isalpha():  # 단어 길이가 100글자 이하, 소문자로만 이루어졌을 때만 실행
    S = S.lower()  # 소문자로 변환

    num = 0
    for tmp in S:
        temp = ord(tmp) - 97
        if result[temp] == -1:
            result[temp] = num
        num = num + 1

for i in result:
    print(i, end=' ')
