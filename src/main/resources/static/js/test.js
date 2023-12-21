/*
const mysql = require('mysql');

const connection = mysql.createConnection({
    host: "localhost",
    port: 3306,
    user: "menu",
    password: "menu",
    database: "opez"
});

const query = 'SELECT USER_CODE, USER_NAME FROM tbl_all_users';

connection.query(query, (error, results) => {
    if (error) {
        console.error(error);
    } else {
        console.log(results);
    }
});

const results = connection.query(query);

for (const row of results) {
    console.log(row.USER_CODE, row.USER_NAME);
}*/

/*import mysql from 'mysql';

// createConnection : 접속하고 싶은 DB정보 입력

var connection = mysql.createConnection({
    host: "localhost",
    port: 3306,
    user: "menu",
    password: "menu",
    database: "opez"
});

// DB 연결

connection.connect();

const query = 'SELECT USER_CODE, USER_NAME FROM tbl_all_users';

connection.query(query, (error, results) => {
    if (error) {
        console.error(error);
    } else {
        console.log(results);
    }
});

connection.end();*/