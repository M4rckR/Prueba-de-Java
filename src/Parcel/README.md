# Packages for Christmas
## Packing parcels correctly - a pre-Christmas sorting problem

### The scenario
- As Santa, you bring the presents (packed in cuboids) to their recipients.
- You are now thinking about how to get the parcels to their destination:
    - Flat and light ones by post.
    - More voluminous ones by shipping company.
    - You drive out particularly large and heavy ones yourself.
- There are so many that you first make a list of all the parcels with their key facts.

### The problem
- In order to redistribute the parcels as quickly as possible, you have to sort them!
    - According to the height (-> letter post).
    - According to volume (-> forwarding).
    - According to the weight (-> self-delivery).
- Write a programme that models parcels and which sorts a list of parcels according to different the listed criteria.

### Key topics involved:
- Create and manage arrays.
- Sort arrays of packages by criteria but try it without the predefined Java sorting algorithms.
    - Sorting based on comparison of objects.
    - State "sorted in ascending order" = each element is "smaller" than the following one.
    - If the state is not given, objects must be (swapped) into a different order.
- Two core problems:
    - How do I swap objects in an array?
    - How do I compare objects against each other?

### Hope these sorting algorithm descriptions help you:
- [Selection Sort](https://en.wikipedia.org/wiki/Selection_sort)
    - Search for the next smallest one and add it to the end of the sorted list (or swap the positions accordingly).
- [Insertion Sort](https://en.wikipedia.org/wiki/Insertion_sort)
    - Take the next element and find the right place and insert (or exchange).
- [Bubble Sort](https://en.wikipedia.org/wiki/Bubble_sort)
    - Elements "bubble" upwards until they are in the right position.


### Testcases

**Input:**
Not required

**Output:**
Before sorting:
[Parcel 210 x 297 x 148 (1400g, 9230760ccm), Parcel 210 x 297 x 3 (200g, 187110ccm), Parcel 297 x 420 x 105 (400g, 13097700ccm), Parcel 148 x 210 x 3 (100g, 93240ccm)]
Sorted by HEIGHT:
[Parcel 148 x 210 x 3 (100g, 93240ccm), Parcel 210 x 297 x 3 (200g, 187110ccm), Parcel 210 x 297 x 148 (1400g, 9230760ccm), Parcel 297 x 420 x 105 (400g, 13097700ccm)]
Sorted by VOLUME:
[Parcel 148 x 210 x 3 (100g, 93240ccm), Parcel 210 x 297 x 3 (200g, 187110ccm), Parcel 210 x 297 x 148 (1400g, 9230760ccm), Parcel 297 x 420 x 105 (400g, 13097700ccm)]
Sorted by WEIGHT:
[Parcel 148 x 210 x 3 (100g, 93240ccm), Parcel 210 x 297 x 3 (200g, 187110ccm), Parcel 297 x 420 x 105 (400g, 13097700ccm), Parcel 210 x 297 x 148 (1400g, 9230760ccm)]

To have the same output format as expected, you can use this String format function with those values:
```java
@Override
public String toString() {
    return String.format("Parcel %d x %d x %d (%dg, %dccm)", width, height, depth, weight, volume());
}
```
```java
import java.util.Arrays;

public class SantaClaus {
    public static void main(String[] args) {
        Parcel[] packages = new Parcel[] {
            new Parcel(210, 297, 148, 1400), // A4 base area, A5 height, 1.4kg
            new Parcel(210, 297, 3, 200), // A4 letter, 3mm height, 200g
            new Parcel(297, 420, 105, 400), // A3 base area, A6 height, 400g
            new Parcel(148, 210, 3, 100), // A5 letter, 3mm height, 100g
        };
 
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(packages));
        System.out.println();
 
        Sorter s = new Sorter(PackageType.HEIGHT);
        s.sort(packages);
        System.out.println("Sorted by HEIGHT:");
        System.out.println(Arrays.toString(packages));
        System.out.println();
 
        s = new Sorter(PackageType.VOLUME);
        s.sort(packages);
        System.out.println("Sorted by VOLUME:");
        System.out.println(Arrays.toString(packages));
        System.out.println();
 
        s = new Sorter(PackageType.WEIGHT);
        s.sort(packages);
        System.out.println("Sorted by WEIGHT:");
        System.out.println(Arrays.toString(packages));
    }
}
```
*To be able to access PackageType.HEIGHT, -VOLUME and -WEIGHT, it is advised to use an enumeration.