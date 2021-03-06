import pandas as pd
from bs4 import BeautifulSoup
import requests
import csv
url_airindia = requests.get('http://www.airindia.in/time-table.htm').text

soup = BeautifulSoup(url_airindia, 'lxml')
tb = soup.find('table')
tr_data = tb.find_all('tr')
td_data_final = []
for tr in tr_data:
    td_data = tr.find_all('td')
    row = [i.text for i in td_data]
    td_data_final.append(row)

# dict ={td_data_final}
# df1=pd.DataFrame(dict)
# df1.to_csv('data.csv',index=False)

for row in td_data_final:
    for s_data in row:
        s_data = [el.replace('\xa0', '0') for el in s_data]

# with open('data.csv', 'w', newline='\n') as file:
#     writer = csv.writer(file)
#     writer.writerow(td_data_final)

df = pd.read_csv('data.csv')
df.to_csv('chk.csv', index=False)
