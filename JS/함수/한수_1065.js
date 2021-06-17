// let input = require('fs').readFileSync('/dev/stdin').toString();

const input = "110";
const N = Number(input);

function check(N) {
  let han = 0;
  for (let i = 1; i <= N; i++) {
    if (i < 100) {
      han++;
    } else {
      const arr = String(i).split("").map(Number);
      if (arr[0] - arr[1] === arr[1] - arr[2]) {
        han++;
      }
    }
  }
  console.log(han);
}

check(N);
