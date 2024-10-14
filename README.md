# DesenhoAnimado Sorting and Searching Project

This project manages and manipulates a list of animated shows (`DesenhoAnimado`) with various functionalities such as sorting, searching, and data export/import. It uses Java to handle different algorithms for sorting and recursive methods for computations, offering a command-line menu interface.

## Features

### Main Functionalities
- **Add new animated show**: Allows users to input a new animated show with attributes like ID, name, release year, episodes, rating, producer, and season.
- **Sort Options**: Users can choose from several sorting algorithms:
  - `Selection Sort`: Sort by release year.
  - `Bubble Sort`: Sort by rating.
  - `Merge Sort`: Sort by the number of episodes.
  - `Quick Sort`: Sort by the number of seasons.
- **Binary Search**: Perform a binary search to find a show by its rating.
- **Recursive Methods**: 
  - Method 1: Recursively calculates the sum of the ratings.
  - Method 2: Recursively finds a show with a specific rating.
- **Export and Import**:
  - Export the current list of shows to a CSV file.
  - Import shows from a CSV file into the list.

### Menu
The following options are available through a menu interface:
1. **Register a new animated show**
2. **Sort by release year (Selection Sort)**
3. **Sort by rating (Bubble Sort)**
4. **Sort by episode count (Merge Sort)**
5. **Sort by season count (Quick Sort)**
6. **Binary search by rating**
7. **Recursive method 1: Sum of ratings**
8. **Recursive method 2: Find rating**
9. **Display current list**
10. **Export data to CSV**
11. **Import data from CSV**
12. **Exit**

## Classes Overview

### `DesenhoAnimado`
Represents an animated show with the following attributes:
- `id`: Unique identifier
- `nome`: Name of the show
- `anoLancamento`: Year of release
- `episodios`: Number of episodes
- `nota`: Rating of the show
- `produtora`: Name of the producer
- `temporada`: Number of seasons

### `ListaObj<T>`
A generic list implementation with methods to:
- Add, search, and remove elements.
- Replace elements and count occurrences.
- Sort the list and perform operations like clearing the list.

### `Ordinare`
This class implements several sorting algorithms (`Selection Sort`, `Bubble Sort`, `Merge Sort`, and `Quick Sort`) and binary search for handling `DesenhoAnimado` objects.

### `RecursiveMethods`
This class contains two recursive methods:
- `metodoRecursivo1`: Calculates the sum of all ratings.
- `metodoRecursivo2`: Recursively searches for a rating in the list.

### `Writer` and `Reader`
- `Writer`: Exports data to a CSV file.
- `Reader`: Imports data from a CSV file and populates the list.

## Example

Here’s an example of the command-line menu you can interact with:

## Menu
The following options are available through a menu interface:
Option Menu:

- Register a new cartoon
- Sort by Release Year (Selection Sort)
- Sort by Rating (Bubble Sort)
- Sort by Number of Episodes (Merge Sort)
- Sort by Number of Seasons (Quick Sort)
- Binary Search by Rating
- Recursive Method 1
- Recursive Method 2
- View Vector
- Export Data
- Import Data
- Exit Choose an option:

