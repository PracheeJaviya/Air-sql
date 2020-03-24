# from bs4 import BeautifulSoup
# import requests

# try:
#     f = open("bufftry.txt", "w")
#     page = requests.get('http://www.airindia.in/time-table.htm')
#     soup = bs4.BeautifulSoup(page.content, 'lxml')
#     contents = soup.find("div", class_="tableData")
#     f.write(contents)
# except Exception:
#     f.write("Prachee hiii")

# f.close()

import requests
from bs4 import BeautifulSoup
f = open("bufftry.txt", "w")
url = 'http://www.airindia.in/time-table.htm'
r = requests.get(url)
soup = BeautifulSoup(r.content, "lxml")

b = soup.findAll(class_="tr3")
f.write(str(b))
f.close()
