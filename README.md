# ALDAST lab 02
Github fork used for this assignment: [repository](https://github.com/nokacper24/aldast-lab02)

Contributors: 
- Kacper Lukasz Nowicki [kacperln@ntnu.no](mailto:kacperln@ntnu.no)
- Jakob Holkestad Molnes [jakobmo@ntnu.no](mailto:jakobmo@ntnu.no)

## Q1
### Q1.1
Insertion
``` java
public void insert(int item) {  
    if (this.length == this.capacity) {  
        this.capacity *= 2;  
        this.array = Arrays.copyOf(this.array, this.capacity);  
    }  
    this.array[this.length] = item;  
    this.length++;  
}
```

### Q1.2
Deletion
``` java
public void remove() {  
    // remove the last element of the array  
    this.array[this.length - 1] = 0;  
    this.length--;  
  
    if (this.length <= this.capacity / 4) {  
        this.capacity /= 2;  
        this.array = Arrays.copyOf(this.array, this.capacity);  
    }  
}
```

### Q1.3
Lookup
``` java
public int lookup(int elem) {  
    int i = 0;  
    while (i < this.length) {  
        if (elem == this.array[i]) {  
            return i;  
        }  
        i++;  
    }  
    return -1;  
}
```
