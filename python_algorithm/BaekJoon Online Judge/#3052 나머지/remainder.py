count = []
for i in range(10):
    temp = input()
    count.append(int(temp) % 42)

result = len(set(count))
print(result)
