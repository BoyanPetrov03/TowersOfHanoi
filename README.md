    I. Content 

1.       The task.   

2.       Analysis of the task’s problem and description of possible solutions.   

3.       Description of the solution approach used.   

4.       Complexity of the algorithm. 

 

    II.The task. 

In the Towers of Hanoi problem there are three pegs (posts) and n disks of different sizes. Each 	disk has a hole in the middle so that it can fit on any peg. At the beginning of the game, all n 	disks are all on the first peg, arranged such that the largest is on the bottom, and the smallest is 	on the top (so the first peg looks like a tower). The goal of the game is to end up with all disks on 	the third peg, in the same order, that is, smallest on top, and increasing order towards the 	bottom. But, there are some restrictions to how the disks are moved (which make the problem 	non-trivial): (1) The only allowed type of move is to grab one disk from the top of one peg and 	drop it on another peg. That is, you cannot grab several disks at one time. (2) A larger disk can 	never lie above a smaller disk, on any post. The legend says that the world will end when a group 	of monks, somewhere in a temple, will finish this task with 64 golden disks on three diamond 	pegs. 

    Analysis of the task’s problem and description of possible solutions. 

There are two possible approaches to the problem – an iterative and a recursive one.  

    III.Description of the solution approach used. 

To solve the task I have chosen the recursive method because it’s quite easier and a lot more efficient than the iterative one. Thinking about the problem recursively we want to move a stack of size n to some target. The simplest solution is to take a stack of size n-1, move it to a spare rod then move the bottom disk and move the stack on top. Basically we are taking a smaller problem and solving it, then we solve the base case, and resolve the smaller sized problem again.  

The program that does that is written in java and running on a spring boot server in a docker container. 

    IV.Complexity of the algorithm  

	The time taken by an algorithm will be proportional to the number of elementary moves made. 	In our case, an elementary move is to move a disk from one rod to another rod. Therefore, the 	time taken by an algorithm for Towers of Hanoi will be proportional to the number of times we 	move some disk. 

	Let the time required to for n disk be T(n). There are 2 recursive calls for n-1 disks and one 	constant time operation to move a disk from rod to rod. Let it be k1. Therefore, 

	T(n) = 2 T(n-1) + k1  

T(0) = k2 , a constant.  

T(1) = 2 k2 + k1 

T(2) = 4 k2 + 2k1 + k1 

T(2) = 8 k2 + 4k1 + 2k1 + k1 

Coefficient of k1 =2n  

Coefficient of k2 =2n-1  

Time complexity is O(2n) or O(an) where a is a constant greater than 1. So it has exponential time complexity. For single increase in problem size the time required is double the previous one. This is computationally very expensive. Most of the recursive programs take exponential time and that is why it is very hard to write them iteratively . 
