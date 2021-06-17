const fs = require('fs');

// 문자 하나
const input = fs.readFileSync("/dev/stdin").toString().split(" ");


let answer = "";


for (let i = Number(input); i >= 1; i--) {
    answer += i + "\n";
}

console.log(answer);




