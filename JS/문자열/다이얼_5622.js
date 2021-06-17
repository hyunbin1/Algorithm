// let input = require("fs").readFileSync("/dev/stdin").toString().split("");

const sample = `UNUCIC`;
const input = sample.trim().split("");
const charMap = {};
let dialCharStack = "";
let time = 3;

for (let i = 65; i <= 90; i++) {
  dialCharStack += String.fromCharCode(i);

  if (
    dialCharStack.length === 3 &&
    i !== "R".charCodeAt(0) &&
    i !== "Y".charCodeAt(0)
  ) {
    charMap[dialCharStack] = time;
    time++;
    dialCharStack = "";
  } else if (dialCharStack.length === 4) {
    charMap[dialCharStack] = time;
    time++;
    dialCharStack = "";
  }
}
// 출력 결과: { ABC: 3, DEF: 4, GHI: 5, JKL: 6, MNO: 7, PQRS: 8, TUV: 9, WXYZ: 10 }

const result = input.reduce((acc, char) => {
  for (let dialString in charMap) {
    if (dialString.includes(char)) {
      acc += charMap[dialString];
    }
  }
  return acc;
}, 0);
// 0은 reduce의 두번째 인자로써 초기값 0을 설정해준다.

console.log(result);
