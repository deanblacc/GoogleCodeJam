<div id="dsb-problem-content-div0" class="dsb-problem-content-div" style="width: 40em;"><h3>Problem</h3>
<p>
A company is located in two very tall buildings. The company intranet connecting the buildings consists of many wires, each connecting a window on the first building to a window on the second building.</p>
<p>You are looking at those buildings from the side, so that one of the buildings is to the left and one is to the right. The windows on the left building are seen as points on its right wall, and the windows on the right building are seen as points on its left wall. Wires are straight segments connecting a window on the left building to a window on the right building.</p>
<p><img src="/codejam/contest/images/?image=RopeIntranet.png&amp;p=599117&amp;c=619102"></p>
<p>You've noticed that no two wires share an endpoint (in other words, there's at most one wire going out of each window). However, from your viewpoint, some of the wires intersect midway. You've also noticed that exactly two wires meet at each intersection point.</p>
<p>On the above picture, the intersection points are the black circles, while the windows are the white circles.</p>
<p>How many intersection points do you see?</p>

<h3>Input</h3>
<p>
The first line of the input gives the number of test cases, <b>T</b>. <b>T</b> test cases follow. Each case begins with a line containing an integer <b>N</b>, denoting the number of wires you see.
</p>

<p>
The next <b>N</b> lines each describe one wire with two integers <b>A<sub>i</sub></b> and <b>B<sub>i</sub></b>. These describe the windows that this wire connects: <b>A<sub>i</sub></b> is the height of the window on the left building, and <b>B<sub>i</sub></b> is the height of the window on the right building.
</p>

<h3>Output</h3>
<p>
For each test case, output one line containing "Case #x: y", where x is the case number (starting from 1) and y is the number of intersection points you see.
</p>

<h3>Limits</h3>
<p>
1 ≤ <b>T</b> ≤ 15.<br>
1 ≤ <b>A<sub>i</sub></b> ≤ 10<sup>4</sup>.<br>
1 ≤ <b>B<sub>i</sub></b> ≤ 10<sup>4</sup>.<br>
Within each test case, all <b>A<sub>i</sub></b> are different.<br>
Within each test case, all <b>B<sub>i</sub></b> are different.<br>
No three wires intersect at the same point.
</p>

<h4>Small dataset</h4>
<p>
1 ≤ <b>N</b> ≤ 2.
</p>

<h4>Large dataset</h4>
<p>
1 ≤ <b>N</b> ≤ 1000.
</p>

<h3>Sample</h3>
<div class="problem-io-wrapper">
<table>
<tbody><tr>
<td>
<br>
<span class="io-table-header">Input</span>
<br>&nbsp;
</td>
<td>
<br>
<span class="io-table-header">Output</span>
<br>&nbsp;
</td>
</tr>
<tr>
<td>
<code>
2<br>
3<br>
1 10<br>
5 5<br>
7 7<br>
2<br>
1 1<br>
2 2<br>
</code>
</td>
<td>
<code>
Case #1: 2<br>
Case #2: 0<br>
<br>
</code>
</td></tr></tbody></table>
</div>
</div>