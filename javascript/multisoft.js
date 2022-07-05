/**
 * Random ads posted by multisoft on public transportations in Gbg, usually found on r/programmerhumor. Solve these on paper before trying to code them
*/

//answer is '134711'
function rec(n) {
    if (n === 0) {
        return 2;
    } else if (n === 1) {
        return 1;
    } else {
        return rec(n - 1) + rec(n - 2)
    }
}

let s = ''
for (let i = 1; i < 6; i++) {
    s += rec(i).toString()
}
console.log('www.multisoft.se/'+s)

//answer is '271828'
let a = ''
s = '527918932189'
for (let i = 1; i < s.length - 1; i++) {
    if (Math.abs(parseInt(s[i-1]) - parseInt(s[i+1])) === parseInt(s[i])) {
        a += s[i];
    }
}
console.log('www.multisoft.se/'+a)