# Brainfuck interpreter

Brainfuck is an esoteric programming language noted for its extreme minimalism.

#### Learn more about Brainfuck:
[Brainfuck](https://en.wikipedia.org/wiki/Brainfuck "Brainfuck")

#### Commands
The eight language commands, each consisting of a single character:

<table border="1">
	<tr>
		<th><b>Character</b></th>
		<th><b>Meaning</b></th>
	</tr>
	<tr><td><b> > </b></td><td>increment the data pointer (to point to the next cell to the right).</td></tr>
	<tr><td><b> < </b></td><td>decrement the data pointer (to point to the next cell to the left).</td></tr>
	<tr><td><b> + </b></td><td>increment (increase by one) the byte at the data pointer.</td></tr>
	<tr><td><b> - </b></td><td>decrement (decrease by one) the byte at the data pointer.</td></tr>
	<tr><td><b> . </b></td><td>output the byte at the data pointer.</td></tr>
	<tr><td><b> , </b></td><td>accept one byte of input, storing its value in the byte at the data pointer.</td></tr>
	<tr><td><b> [ </b></td><td>if the byte at the data pointer is zero, then instead of moving the instruction pointer forward to the next command, jump it forward to the command after the matching ] command.</td></tr>
	<tr><td><b> ] </b></td><td>if the byte at the data pointer is nonzero, then instead of moving the instruction pointer forward to the next command, jump it back to the command after the matching [ command.</td></tr>
</table>

#### Usage:

    java -jar brainfuck.jar {"sourcecode" | -f filename}

    where:
        "sourcecode"    - source text in brainfuck language
        filename        - name of the text file with brainfuck source
