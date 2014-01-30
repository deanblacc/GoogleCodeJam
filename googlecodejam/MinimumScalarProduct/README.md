<div id="dsb-problem-content-div0" class="dsb-problem-content-div" style="width: 40em;"><p class="problem-item">Problem</p>
<p>
You are given two vectors v<sub>1</sub>=(x<sub>1</sub>,x<sub>2</sub>,...,x<sub>n</sub>) and v<sub>2</sub>=(y<sub>1</sub>,y<sub>2</sub>,...,y<sub>n</sub>). The scalar product of these vectors is a single number, calculated as x<sub>1</sub>y<sub>1</sub>+x<sub>2</sub>y<sub>2</sub>+...+x<sub>n</sub>y<sub>n</sub>.
</p>

<p>
Suppose you are allowed to permute the coordinates of each vector as you wish. Choose two permutations such that the scalar product of your two new vectors is the smallest possible, and output that minimum scalar product.
</p>

<p class="problem-item">Input</p>
The first line of the input file contains integer number <b>T</b> - the number of test cases. For each test case, the first line contains integer number <b>n</b>.
The next two lines contain <b>n</b> integers each, giving the coordinates of  v<sub>1</sub> and v<sub>2</sub> respectively.
<p></p>

<p class="problem-item">Output</p>
<p>
For each test case, output a line
</p><pre>Case #<b>X</b>: <b>Y</b></pre>
where <b>X</b> is the test case number, starting from 1, and <b>Y</b> is the minimum scalar product of all permutations of the two given vectors.
<p></p>

<p class="problem-item">Limits</p>
<p>
</p>

<p class="problem-item">Small dataset</p>
<p>
  <b>T</b> = 1000<br>
  1 ≤ <b>n</b> ≤ 8<br>
  -1000 ≤ <b>x</b><sub>i</sub>, <b>y</b><sub>i</sub> ≤ 1000
</p>

<p class="problem-item">Large dataset</p>
<p>
  <b>T</b> = 10<br>
  100 ≤ <b>n</b> ≤ 800<br>
  -100000 ≤ <b>x</b><sub>i</sub>, <b>y</b><sub>i</sub> ≤ 100000
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
2<br>
3<br>
1 3 -5<br>
-2 4 1<br>
5<br>
1 2 3 4 5<br>
1 0 1 0 1<br>
<br>
</code>
</td>
<td>
<code>
Case #1: -25<br>
Case #2: 6<br>
<br>
</code>
</td>
</tr>
</tbody></table>
</div></div>