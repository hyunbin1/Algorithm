let input = require("fs").readFileSync("/dev/stdin").toString().split("\n");

// let sample = `10 5
// 1 10 4 9 2 3 8 5 7 6`
const input = sample.split("\n");

let first_line = input[0].split(" ");
let second_line = input[1].split(" ");

// first_line
let n = Number(first_line[0]); //10
let x = Number(first_line[1]); //5

//  secondline
for (i = 0; i <= n - 1; i++) {
  if (second_line[i] < x) {
    console.log(second_line[i]);
  }
}
