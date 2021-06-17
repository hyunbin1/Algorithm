let fs = require("fs")

// 문자 하나
let input = fs.readFileSync("/dev/stdin").toString().split(" ")


let answer = "";


for (let i = 1; i <= input; i++) {
    answer += i + "\n";
}

console.log(answer);







