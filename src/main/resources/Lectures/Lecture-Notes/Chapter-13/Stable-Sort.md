# Stable Sort

#### where equal elements are distinguishable, stability is imperative
<pre>
<code>
Input:

how much wood would woodchuck chuck if woodchuck could chuck wood

Output:

how       1
much      1
wood      2
would     1
woodchuck 2
chuck     2
if        1
could     1
</code>
</pre>

#### 
Second step – sort the whole list lexicographically, then by word count:
<pre>
<code>
First pass, sorted lexicographically:

(chuck, 2)
(could, 1)
(how, 1)
(if, 1)
(much, 1)
(wood, 2)
(woodchuck, 2)
(would, 1)
</code>
</pre>
<pre>
<code>
Second pass, sorted by count using an unstable sort:

(wood, 2)
(chuck, 2)
(woodchuck, 2)
(could, 1)
(how, 1)
(if, 1)
(would, 1)
(much, 1)
</code>
</pre>

<b>As we have used an unstable sort, the second pass does not maintain the lexicographical order.</b>
That’s where the stable sort comes into the picture. <b>Since we already had sorted the list lexicographically, using
a stable sort to by word count does not change the order of equal elements anymore</b>. As a result words with the same
word count remain sorted lexicographically.
<pre>
<code>
Second pass, sorted by count using a stable sort:

(chuck, 2)
(wood, 2)
(woodchuck, 2)
(could, 1)
(how, 1)
(if, 1)
(much, 1)
(would, 1)
</code>
</pre>