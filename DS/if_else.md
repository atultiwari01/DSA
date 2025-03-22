## **if-else in C++**
The `if-else` statement in C++ is a **conditional statement** that executes different blocks of code depending on whether a condition is `true` or `false`.

---

## **1. Basic `if` Statement**
The `if` statement executes a block of code **only if the condition is true**.

### **Syntax:**
```cpp
if (condition) {
    // Code to execute if condition is true
}
```

### **Example:**
```cpp
#include <iostream>
using namespace std;

int main() {
    int x = 10;

    if (x > 5) {
        cout << "x is greater than 5" << endl;
    }

    return 0;
}
```
**Output:**
```
x is greater than 5
```

---

## **2. `if-else` Statement**
The `if-else` statement executes one block of code **if the condition is true**, and another **if the condition is false**.

### **Syntax:**
```cpp
if (condition) {
    // Code if condition is true
} else {
    // Code if condition is false
}
```

### **Example:**
```cpp
#include <iostream>
using namespace std;

int main() {
    int num = 3;

    if (num % 2 == 0) {
        cout << "Even Number";
    } else {
        cout << "Odd Number";
    }

    return 0;
}
```
**Output:**
```
Odd Number
```

---

## **3. `if-else if-else` Ladder**
When you have multiple conditions, you can use **`else if`** to check additional cases.

### **Syntax:**
```cpp
if (condition1) {
    // Code if condition1 is true
} else if (condition2) {
    // Code if condition2 is true
} else {
    // Code if all conditions are false
}
```

### **Example:**
```cpp
#include <iostream>
using namespace std;

int main() {
    int marks = 85;

    if (marks >= 90) {
        cout << "Grade: A";
    } else if (marks >= 75) {
        cout << "Grade: B";
    } else if (marks >= 50) {
        cout << "Grade: C";
    } else {
        cout << "Grade: F";
    }

    return 0;
}
```
**Output:**
```
Grade: B
```

---

## **4. Nested `if-else`**
A nested `if-else` means an `if` statement inside another `if` or `else`.

### **Example:**
```cpp
#include <iostream>
using namespace std;

int main() {
    int num = 10;

    if (num > 0) {
        if (num % 2 == 0) {
            cout << "Positive Even Number";
        } else {
            cout << "Positive Odd Number";
        }
    } else {
        cout << "Number is negative";
    }

    return 0;
}
```
**Output:**
```
Positive Even Number
```

---

## **5. `if-else` with Logical Operators**
You can use **logical operators** (`&&`, `||`, `!`) with `if-else` conditions.

| Operator | Meaning |
|----------|---------|
| `&&`     | Logical AND (Both conditions must be true) |
| `||`     | Logical OR (At least one condition must be true) |
| `!`      | Logical NOT (Negates the condition) |

### **Example Using `&&` (AND)**
```cpp
if (age >= 18 && age <= 60) {
    cout << "You are eligible to work.";
}
```

### **Example Using `||` (OR)**
```cpp
if (age < 18 || age > 60) {
    cout << "You are not eligible to work.";
}
```

### **Example Using `!` (NOT)**
```cpp
if (!isStudent) {
    cout << "You are not a student.";
}
```

---

## **6. Ternary Operator (`? :`) – Shorter `if-else`**
The **ternary operator** is a shorthand for `if-else`.

### **Syntax:**
```cpp
condition ? expression_if_true : expression_if_false;
```

### **Example:**
```cpp
#include <iostream>
using namespace std;

int main() {
    int x = 10, y = 20;

    int max = (x > y) ? x : y; // Shorter if-else
    cout << "Maximum: " << max;

    return 0;
}
```
**Output:**
```
Maximum: 20
```

---

## **7. `if-else` vs. `switch`**
If you're comparing a variable against multiple values, **`switch`** may be better than `if-else`.

### **Example: Using `if-else`**
```cpp
if (day == 1) cout << "Monday";
else if (day == 2) cout << "Tuesday";
else if (day == 3) cout << "Wednesday";
else cout << "Invalid day";
```

### **Example: Using `switch`**
```cpp
switch (day) {
    case 1: cout << "Monday"; break;
    case 2: cout << "Tuesday"; break;
    case 3: cout << "Wednesday"; break;
    default: cout << "Invalid day";
}
```

---

## **8. Common Mistakes**
### ❌ **Missing Braces (`{}`)**
```cpp
if (x > 10) 
    cout << "Greater";
    cout << "This will always execute!";
```
✅ **Corrected Code:**
```cpp
if (x > 10) {
    cout << "Greater";
}
```

### ❌ **Using `=` Instead of `==`**
```cpp
if (x = 5) {  // Wrong: Assigns 5 to x
    cout << "True";
}
```
✅ **Corrected Code:**
```cpp
if (x == 5) {  // Correct: Compares x with 5
    cout << "True";
}
```

---

## **Conclusion**
- `if-else` allows **conditional execution** of code.
- Use **logical operators (`&&`, `||`, `!`)** to combine conditions.
- Use **ternary operator (`? :`)** for short if-else.
- For multiple conditions on one variable, **switch** may be better.

---