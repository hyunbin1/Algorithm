// let input = require("fs").readFileSync("/dev/stdin").toString().split("\n");

const sample = `baaa`;
let input = sample.split("");
input = input.map((input) => input.toUpperCase());
lineLength = input.length;
let count = 0;
let arr = "";
let acc = "";

for (i = 0; i < lineLength; i++) {
  if (input[i] !== undefined) {
    count = 0;
    for (j = 0; j < lineLength; j++) {
      if (input[i] === input[j] && input[j] !== undefined) {
        count += 1;
      }
    }
    arr = { name: input[i], count: count };
    for (let key in arr) {
      acc += arr[key];
    }
  }
  input = input.filter((element) => element !== input[i]);
}

// console.log(acc);
let max = 0;
let result = "";
for (k = 0; k < acc.length; k++) {
  if (k % 2 == 1 && max !== acc[k]) {
    if (acc[k] > max) {
      max = acc[k];
      result = acc[k - 1];
    }
  } else if (max === acc[k]) {
    result = "?";
  }
}
console.log(result);
