# Review of what we have done

-  ArrayList
    -- When wanting to get the index
    -- list.get(i)
- Normal List 
    -- When wanting to get the index
    -- list[i]

# 2D Array
```java
int a[][] = new int[10][10];
boolean b[][] = new boolean[4][4];
Student s[][] = new Student [5][6];
```

## Accessing 
- Always [row][column]
```java
int x = a[3][4];
boolean y = b[0][1];
Student z = s[3][5];
```
## Setting/Changing
```java
a[3][4] = 6;
b[0][1] = true;
z[3][5] = new Student("John");

z[3][5].setName("Jack");
```

```java
// Length

a.length; //number of rows;
b.length; //number of rows;
c.length; //number of rows;

a[0].length //number of columns in row 0;

// All rows will always have the same number of columns. 
// Therefore, it is valid to assume a[0].length can be used everytime
// you want to know the number of columns
```

```java
// Getting an entire row
a[0]; //this is an entire row

int temp[] = a[0]; //store row 0 in temp
// cannot easily do the same with an entire column
```

```java
// Get entire column

public int[] getColumn(int arr[][], int col) {
    int[] colArr = new int[arr.length];
    for(int i = 0; i < arr.length; i++) {
        colArr[i] = arr[i][col];
    }
    return colArr;
}
```