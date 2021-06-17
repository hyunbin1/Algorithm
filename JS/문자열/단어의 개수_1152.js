// let input = require("fs").readFileSync("/dev/stdin").toString().split(" ");

const sample = ` Mazatneunde Wae Teullyeoyo `;
const input = sample.trim().split(" ");

let count = 0;
for (i = 0; i < input.length; i++) {
  if (input[i] !== "") {
    count++;
  }
}

console.log(count);
