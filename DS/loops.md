## **Loops in C++**
Loops in C++ are used to **execute a block of code multiple times** until a specified condition is met. C++ provides **three types of loops**:

1. **`for` loop** – Used when the number of iterations is known.
2. **`while` loop** – Used when the number of iterations is unknown.
3. **`do-while` loop** – Similar to `while`, but executes at least once.

---

## **1. `for` Loop**
The `for` loop is best when the **number of iterations is known** beforehand.

### **Syntax:**
```cpp
for (initialization; condition; update) {
    // Code to execute
}
```

### **Example: Print numbers from 1 to 5**
```cpp
#include <iostream>
using namespace std;

int main() {
    for (int i = 1; i <= 5; i++) {
        cout << i << " ";
    }
    return 0;
}
```
**Output:**
```
1 2 3 4 5
```

---

## **2. `while` Loop**
The `while` loop is used **when the number of iterations is unknown** but depends on a condition.

### **Syntax:**
```cpp
while (condition) {
    // Code to execute
}
```

### **Example: Print numbers from 1 to 5**
```cpp
#include <iostream>
using namespace std;

int main() {
    int i = 1;
    while (i <= 5) {
        cout << i << " ";
        i++; // Increment
    }
    return 0;
}
```
**Output:**
```
1 2 3 4 5
```

---

## **3. `do-while` Loop**
The `do-while` loop is similar to `while`, but it **executes at least once**, even if the condition is false.

### **Syntax:**
```cpp
do {
    // Code to execute
} while (condition);
```

### **Example: Print numbers from 1 to 5**
```cpp
#include <iostream>
using namespace std;

int main() {
    int i = 1;
    do {
        cout << i << " ";
        i++; // Increment
    } while (i <= 5);

    return 0;
}
```
**Output:**
```
1 2 3 4 5
```

---

## **4. Nested Loops**
A **nested loop** is a loop inside another loop.

### **Example: Printing a 3x3 Pattern**
```cpp
#include <iostream>
using namespace std;

int main() {
    for (int i = 1; i <= 3; i++) {  // Outer loop
        for (int j = 1; j <= 3; j++) {  // Inner loop
            cout << "* ";
        }
        cout << endl;
    }
    return 0;
}
```
**Output:**
```
* * *
* * *
* * *
```

---

## **5. `break` and `continue` Statements**
### **`break` – Exit the loop early**
```cpp
#include <iostream>
using namespace std;

int main() {
    for (int i = 1; i <= 5; i++) {
        if (i == 3) {
            break; // Stops loop when i == 3
        }
        cout << i << " ";
    }
    return 0;
}
```
**Output:**
```
1 2
```

### **`continue` – Skip current iteration**
```cpp
#include <iostream>
using namespace std;

int main() {
    for (int i = 1; i <= 5; i++) {
        if (i == 3) {
            continue; // Skips iteration when i == 3
        }
        cout << i << " ";
    }
    return 0;
}
```
**Output:**
```
1 2 4 5
```

---

## **6. Infinite Loops**
An **infinite loop** runs **forever** unless stopped manually.

### **Example: Infinite `while` Loop**
```cpp
while (true) {
    cout << "This is an infinite loop";
}
```

### **Example: Infinite `for` Loop**
```cpp
for (;;) {  // No condition, runs forever
    cout << "Infinite loop";
}
```

---

## **7. Range-based `for` Loop (C++11)**
The **range-based for loop** simplifies iteration over arrays and vectors.

### **Example: Print elements of an array**
```cpp
#include <iostream>
using namespace std;

int main() {
    int arr[] = {10, 20, 30, 40, 50};

    for (int x : arr) {
        cout << x << " ";
    }

    return 0;
}
```
**Output:**
```
10 20 30 40 50
```

---

## **8. Loop Comparison Table**
| Loop Type  | When to Use | Executes At Least Once? |
|------------|------------|-------------------------|
| `for` loop | When number of iterations is known | No |
| `while` loop | When number of iterations is unknown | No |
| `do-while` loop | When the loop must run at least once | Yes |

---

## **Conclusion**
- Use **`for`** when the number of iterations is **fixed**.
- Use **`while`** when the number of iterations is **unknown**.
- Use **`do-while`** when the loop **must execute at least once**.
- **Nested loops** are useful for working with **grids** or **tables**.
- **`break`** exits the loop, while **`continue`** skips an iteration.

---
