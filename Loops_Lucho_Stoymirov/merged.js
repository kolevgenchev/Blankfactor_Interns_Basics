var word1 = "ABC"
var word2 = "DEF"
var mixed = '';
var biggerNum = Math.max(word1.length, word2.length);

for (var i = 0; i < biggerNum; i++) {
  if (i < word1.length) {
    mixed += word1.charAt(i);
  }
  if (i < word2.length) {
    mixed += word2.charAt(i);
  }
}

alert(mixed);