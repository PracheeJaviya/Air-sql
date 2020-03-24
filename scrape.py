import requests
import csv
url_airindia = requests.get('http://www.airindia.in/time-table.htm').text

from bs4 import BeautifulSoup
f = open("bufftry.txt", "w")
soup = BeautifulSoup(url_airindia, 'lxml')


tb = soup.find('table')

tr_data = tb.find_all('tr')

td_data_final = []
for tr in tr_data:
    td_data = tr.find_all('td')
    row = [i.text for i in td_data]
    td_data_final.append(row)

print(td_data_final)
f.write(str(td_data_final))
f.close()
#td_data_final = [sub.replace('\xa0', '0') for sub in td_data_final] 

#with open('data.csv', 'w') as file:
 #   writer = csv.writer(file, delimiter='|')
  #  writer.writerows(td_data_final)