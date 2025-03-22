## **Everything About `vector` in C++**
The `vector` is a **dynamic array** in C++ that is part of the Standard Template Library (STL). It provides **automatic resizing, random access, and various useful functions**.

---

## **1. How to Include and Declare a Vector**
```cpp
#include <iostream>
#include <vector>  // Required for using vectors

using namespace std;

int main() {
    vector<int> v; // Declares an empty vector of integers
    return 0;
}
```

---

## **2. Initializing a Vector**
```cpp
vector<int> v1;                     // Empty vector
vector<int> v2(5);                   // Vector of size 5 (default initialized with 0)
vector<int> v3(5, 100);               // Vector of size 5, initialized with 100
vector<int> v4 = {1, 2, 3, 4, 5};     // Vector initialized with list
vector<int> v5(v4);                   // Copy constructor
vector<int> v6(v4.begin(), v4.begin()+3); // Partial copy
```

---

## **3. Basic Operations on Vectors**
### **Adding Elements**
```cpp
v.push_back(10);  // Adds 10 to the end of the vector
v.emplace_back(20); // More efficient than push_back
```

### **Accessing Elements**
```cpp
cout << v[0];     // Access element at index 0
cout << v.at(1);  // Safe access (throws an exception if out of bounds)
cout << v.front(); // First element
cout << v.back();  // Last element
```

### **Modifying Elements**
```cpp
v[1] = 50;  // Modifies the element at index 1
```

### **Removing Elements**
```cpp
v.pop_back();     // Removes last element
v.erase(v.begin());  // Removes the first element
v.erase(v.begin(), v.begin()+2); // Removes the first two elements
```

### **Inserting Elements**
```cpp
v.insert(v.begin(), 5); // Inserts 5 at the beginning
v.insert(v.begin()+2, 10); // Inserts 10 at index 2
```

### **Clearing and Resizing**
```cpp
v.clear();    // Removes all elements
v.resize(10); // Resizes to contain 10 elements
```

---

## **4. Iterating Over a Vector**
### **Using a For Loop**
```cpp
for (int i = 0; i < v.size(); i++) {
    cout << v[i] << " ";
}
```

### **Using an Iterator**
```cpp
for (vector<int>::iterator it = v.begin(); it != v.end(); ++it) {
    cout << *it << " ";
}
```

### **Using a Range-based For Loop**
```cpp
for (int x : v) {
    cout << x << " ";
}
```

---

## **5. Capacity Functions**
```cpp
v.size();       // Returns current size
v.capacity();   // Returns the allocated memory size
v.max_size();   // Returns maximum possible size
v.empty();      // Returns true if the vector is empty
v.shrink_to_fit(); // Reduces capacity to size
```

---

## **6. Other Useful Vector Functions**
| Function                  | Description |
|---------------------------|-------------|
| `push_back(value)`        | Adds an element to the end |
| `pop_back()`              | Removes last element |
| `insert(pos, value)`      | Inserts `value` at position `pos` |
| `erase(pos)`              | Removes element at position `pos` |
| `erase(start, end)`       | Removes elements in range `[start, end)` |
| `clear()`                 | Removes all elements |
| `size()`                  | Returns the number of elements |
| `capacity()`              | Returns the allocated size |
| `resize(n)`               | Resizes vector to contain `n` elements |
| `empty()`                 | Checks if vector is empty |
| `front()`                 | Returns first element |
| `back()`                  | Returns last element |
| `at(index)`               | Returns element at `index` (safe access) |
| `shrink_to_fit()`         | Reduces memory usage |
| `assign(n, value)`        | Assigns `n` elements with `value` |
| `swap(v2)`                | Swaps contents with another vector `v2` |
| `emplace(pos, value)`     | Inserts `value` at `pos` (faster than insert) |
| `emplace_back(value)`     | Adds `value` to the end (faster than push_back) |

---

## **7. Sorting and Reversing a Vector**
```cpp
#include <algorithm> // Required for sorting

sort(v.begin(), v.end()); // Sorts in ascending order
sort(v.begin(), v.end(), greater<int>()); // Sorts in descending order
reverse(v.begin(), v.end()); // Reverses the vector
```

---

## **8. Searching in a Vector**
```cpp
#include <algorithm>

if (find(v.begin(), v.end(), 10) != v.end()) {
    cout << "Element found";
} else {
    cout << "Element not found";
}
```

---

## **9. Merging Two Vectors**
```cpp
vector<int> v1 = {1, 2, 3};
vector<int> v2 = {4, 5, 6};
vector<int> merged(v1.size() + v2.size());

merge(v1.begin(), v1.end(), v2.begin(), v2.end(), merged.begin());
```

---

## **10. Removing Duplicates from a Sorted Vector**
```cpp
v.erase(unique(v.begin(), v.end()), v.end());
```

---

## **11. Checking If a Vector is Sorted**
```cpp
if (is_sorted(v.begin(), v.end())) {
    cout << "Sorted";
} else {
    cout << "Not sorted";
}
```

---

## **12. 2D Vectors**
```cpp
vector<vector<int>> matrix(3, vector<int>(4, 0)); // 3x4 matrix initialized with 0
```

---

## **13. Passing Vectors to Functions**
### **Pass by Value**
```cpp
void printVector(vector<int> v) {
    for (int x : v) cout << x << " ";
}
```
### **Pass by Reference**
```cpp
void modifyVector(vector<int>& v) {
    v.push_back(100);
}
```

---

## **14. Comparing Two Vectors**
```cpp
if (v1 == v2) {
    cout << "Equal";
} else {
    cout << "Not equal";
}
```

---

## **15. Converting Vector to Array**
```cpp
int arr[v.size()];
copy(v.begin(), v.end(), arr);
```

---

## **Conclusion**
The `vector` class in C++ is a **powerful and flexible** data structure that offers **dynamic resizing, efficient memory management, and a rich set of built-in functions**. It is widely used in competitive programming and real-world applications.
