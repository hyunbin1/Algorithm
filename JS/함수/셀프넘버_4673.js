// let input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

// 각 자리수 + 자기자신 더하기
function D(n) {
  let sum = n;
  let num = String(n);
  for (i = 0; i < num.length; i++) {
    sum += Number(num[i]);
  }
  return sum;
}

// 1~10000까지 배열을 flase로 채우기
const j = 10000;
const check = new Array(j);
check.fill(false);

for (k = 1; k <= j; k++) {
  check[D(k)] = true;
  if (!check[k]) {
    console.log(k);
  }
}
