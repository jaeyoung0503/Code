with open('test.kt', 'r+', encoding='utf-8') as f:
  read_data=f.read()
  f.write('/this is test/\n')
  
print(read_data)

def expo(self):
  print(self)

expo("n")
expo("no")
expo("yes")

