from bs4 import BeautifulSoup
with open("sample.html", "r") as f:

    contents = f.read()

    soup = BeautifulSoup(contents, 'lxml')

    print(soup.h1)
