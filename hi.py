from bs4 import BeautifulSoup
import requests


def scrap() -> None:
    f = open("bufftry.txt", "w")

    page = requests.get('http://www.airindia.in/time-table.htm')
    soup = bs4.BeautifulSoup(page.content, 'lxml')
    contents = soup.find(id='ContentPlaceHolder1_TimeTableControl1_gvTimeline')
    f.write(contents)
    f.close
