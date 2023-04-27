let str1 = 'abc111';
let str2 = '123';
let mergedStr = '';

for (let i = 0; i < str1.length || i < str2.length; i++) {


    if (i < str1.length) {
        mergedStr += str1[i];
    }
    if (i < str2.length) {
        mergedStr += str2[i];
    }
}

console.log(mergedStr); 