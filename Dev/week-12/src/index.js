"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
// Import the pg library
const { Client } = require('pg');
const connectionString = 'postgresql://postgres:mysecretpassword@localhost:3000/postgres';
// Create a new client instance with the connection string
const client = new Client({
    connectionString: connectionString
});
// Connect to the database
// client.connect((err:any) => {
//   if (err) {
//     console.error('connection error', err.stack);
//   } else {
//     console.log('connected to the database');
//   }
// });
function insertUserData(username, password, email) {
    return __awaiter(this, void 0, void 0, function* () {
        yield client.connect();
        const result = yield client.query(`INSERT INTO users (username, password, email) VALUES ('${username}','${password}','${email}')`);
        console.log(result);
        client.end();
    });
}
// // Run a simple query (Example: Fetching the current date and time from PostgreSQL)
// client.query(`CREATE TABLE users (
//     id SERIAL PRIMARY KEY,
//     username VARCHAR(50) UNIQUE NOT NULL,
//     email VARCHAR(255) UNIQUE NOT NULL,
//     password VARCHAR(255) NOT NULL,
//     created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
// );`, (err:any, res:any) => {
//   if (err) {
//     console.error(err);
//   } else {
//     console.log(res);
//   }
//   // Close the connection
//   client.end();
// });
insertUserData('Harizibam', '1234567', 'harizibam@gmail.com');
