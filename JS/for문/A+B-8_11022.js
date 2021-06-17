let input = require('fs').readFileSync('/dev/stdin').toString().split('\n');
// const sample = `5
// 1 1
// 2 3
// 3 4
// 9 8
// `
const input = sample.split("\n");
const line_num = Number(input[0]);
let a = ""

for (let i=1; i<=line_num; i++){
    let num = (input[i]).split(" ");

    // += 쓸때는 맨첨에 변수 선언해주기
    // a += `Case #${i}: ${Number (num[0])} + ${Number (num[1])} = ${Number (num[0])+ Number (num[1])}\n`
    a += `Case #${i}: ${num[0]} + ${num[1]} = ${num[0]+ num[1]}\n`
}

console.log(a)




