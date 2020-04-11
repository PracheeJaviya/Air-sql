import psycopg2
from config import config


def connect():
    """ Connect to the PostgreSQL database server """
    conn = None
    try:
        # read connection parameters
        params = config()
        conn = psycopg2.connect(**params)

        # create a cursor
        cur = conn.cursor()

        sel_from_dest = " select * from flight where fcity = 'Delhi' "

        # execute a statement
        # print('PostgreSQL database version:')
        cur.execute(sel_from_dest)

        records =cur.fetchall()
        print("DATASET")
        for row in records :
            print( "From " , 'Delhi')
            print(" To ", row[1])
        # display the PostgreSQL database server version
        db_version = cur.fetchone()
        print(db_version)

    except (Exception, psycopg2.DatabaseError) as error:
        print(error)
    finally:
        if conn is not None:
            conn.close()
            cur.close()
            print('Database connection closed.')


if __name__ == '__main__':
    connect()
