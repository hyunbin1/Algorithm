// let input = require("fs").readFileSync("/dev/stdin").toString().split("\n");

const sample = `2
3 ABC
5 /HTP`;

const input = sample.split("\n");
// 줄의 개수
const count_line = input[0];

let line_split = "";
let count_string = 0;
let string = "";
let result = "";

for (i = 1; i <= count_line; i++) {
  result = "";
  line_split = input[i].split(" ");
  count_string = line_split[0];
  string = line_split[1];
  for (let j = 0; j < string.length; j++) {
    result += string[j].repeat(count_string);
  }
  console.log(result);
}
