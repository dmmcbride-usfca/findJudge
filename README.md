# Judge

This is a class for determining if there is a "judge" (or individual that is trusted by everyone and trusts no one) in a community, and if so who that individual is.

## Usage

Judge.findJudge() takes an array of pairs {a, b} where a "trusts" b.
It outputs the identifier of the judge or -1 if there is no judge.

```java 
public static void main(String [] Args)
{
    int[][] arr = {{1,3}, {2,3}, {4,3}, {2,4}};
    Judge judge = new Judge();
    System.out.println(judge.findJudge(4, arr));
}
```

## Complexity

### Time Complexity
The time complexity is O(n) because there are two O(n) for loops implemented in the findJudge() method.

### Space Complexity
The space complexity of O(n) because the only data member created in findJudge() is an array of length N+1 to store the trust scores.
