# Date Class in Java

## Project Overview

This project implements a custom `Date` class in Java that represents calendar dates and provides several useful operations such as:

- Validating if a date is correct (including leap year consideration)
- Updating the date with new values
- Getting the day of the week
- Calculating the number of days between two dates
- Printing the date in a readable format
- Sorting a list of dates using `Collections.sort()` (implements `Comparable<Date>`)

A `Main` class is also included to demonstrate how to use the `Date` class with user input and output.

---

## Additional Notes and Challenges
- `LocalDate` is used for robust and error-free date handling.

- The `isValidDate` method uses exception handling to validate date input.

- Date sorting is supported by overriding the `compareTo` method.

## Challenges Encountered
- Ensuring proper date validation without using external libraries.

- Handling leap years and invalid dates smoothly.

- Making the output clean and informative for users.

- Designing user-friendly prompts for input and readable output formatting.