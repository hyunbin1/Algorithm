// let input = require("fs").readFileSync("/dev/stdin").toString().split("\n");

const sample = `5
54321`;
const input = sample.split("\n");

const num_count = input[0];
let number = input[1].split("").map(Number);
let sum = 0;
for (i = 0; i < num_count; i++) {
  sum += number[i];
}
console.log(sum);
