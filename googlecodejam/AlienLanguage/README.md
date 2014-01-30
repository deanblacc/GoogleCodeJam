<div id="dsb-problem-content-div0" class="dsb-problem-content-div" style="width: 40em;"><p class="problem-item">Problem</p>
<p>After years of study, scientists at Google Labs have discovered an alien language transmitted from a faraway planet.  The alien language is very unique in that every word consists of exactly <b>L</b> lowercase letters.  Also, there are exactly <b>D</b> words in this language.</p>

<p>Once the dictionary of all the words in the alien language was built, the next breakthrough was to discover that the aliens have been transmitting messages to Earth for the past decade.  Unfortunately, these signals are weakened due to the distance between our two planets and some of the words may be misinterpreted. In order to help them decipher these messages, the scientists have asked you to devise an algorithm that will determine the number of possible interpretations for a given pattern.</p>

<p>A pattern consists of exactly <b>L</b> tokens.  Each token is either a single lowercase letter (the scientists are very sure that this is the letter) or a group of unique lowercase letters surrounded by parenthesis ( and ). For example: (ab)d(dc) means the first letter is either a or b, the second letter is definitely d and the last letter is either d or c.  Therefore, the pattern (ab)d(dc) can stand for either one of these 4 possibilities: add, adc, bdd, bdc.</p>

<p class="problem-item">Input</p>
<p>The first line of input contains 3 integers, <b>L</b>, <b>D</b> and <b>N</b> separated by a space. <b>D</b> lines follow, each containing one word of length <b>L</b>. These are the words that are known to exist in the alien language. <b>N</b> test cases then follow, each on its own line and each consisting of a pattern as described above. You may assume that all known words provided are unique.</p>

<p class="problem-item">Output</p>
<p>For each test case, output </p><pre>Case #<b>X</b>: <b>K</b></pre> where <b>X</b> is the test case number, starting from 1, and <b>K</b> indicates how many words in the alien language match the pattern.<p></p>
<br>
<p class="problem-item">Limits</p>
<p>
</p>

<p class="problem-item">Small dataset</p>
<p>
1 ≤ <b>L</b> ≤ 10<br>
1 ≤ <b>D</b> ≤ 25<br>
1 ≤ <b>N</b> ≤ 10<br>
</p>
<p class="problem-item">Large dataset</p>
<p>
1 ≤ <b>L</b> ≤ 15<br>
1 ≤ <b>D</b> ≤ 5000<br>
1 ≤ <b>N</b> ≤ 500<br>
</p>

<p class="problem-item">Sample</p>
<div class="problem-io-wrapper">
<table>
<tbody><tr>
<td>
<br>
<span class="problem-item-gray">Input</span>
<br>&nbsp;
</td>
<td>
<br>
<span class="problem-item-gray">Output</span>
<br>&nbsp;
</td>
</tr>
<tr>
<td>
<code>
3 5 4<br>
abc<br>
bca<br>
dac<br>
dbc<br>
cba<br>
(ab)(bc)(ca)<br>
abc<br>
(abc)(abc)(abc)<br>
(zyx)bc<br>
</code>
</td>
<td>
<code>
Case #1: 2<br>
Case #2: 1<br>
Case #3: 3<br>
Case #4: 0<br>
</code>
</td></tr></tbody></table>
</div>
</div>