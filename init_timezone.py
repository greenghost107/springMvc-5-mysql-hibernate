import mysql.connector
#pip install mysql-connector
cnx = mysql.connector.connect(user='root',password='password',
                              host='127.0.0.1',
                              database='cuma')
cursor = cnx.cursor()

query = ("set @@global.time_zone='+00:00';")

cursor.execute(query,multi=False)

cursor.close()
cnx.close()
