const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().split("\n");

// const sample = `5
// 1 1
// 2 3
// 3 4
// 9 8
// 5 2`
// const input = sample.split("\n");

let line_num = Number(input[0])
let add = ""
let answer = "";

for (let i = 1; i <= line_num; i++) {
    let num = input[i].split(" ");
    add += `Case #${i}: ${Number(num[0]) + Number(num[1])} \n`;
}

console.log(add)


