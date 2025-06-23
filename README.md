# foundation-android

The **foundation-android** package provides utility functions for Android development, including string utilities and date/time handling extensions.

## Why

Using `foundation-android` simplifies common tasks in Android development:

1. **String Utilities**: Provides a clean way to get empty strings without creating new objects.
2. **Date/Time Handling**: Offers extension functions for kotlinx.datetime classes to easily format dates and times or convert them to epoch milliseconds.

```kotlin
// Using emptyString() instead of ""
val emptyText = emptyString()

// Converting LocalDate to epoch milliseconds
val date = LocalDate(2023, 1, 1)
val epochMillis = date.toEpochMillis()

// Formatting dates
val formattedDate = date.toShortDateString() // e.g., "1/1/23"

// Formatting date-times
val dateTime = LocalDateTime(2023, 1, 1, 12, 30)
val formattedDateTime = dateTime.toShortDateTimeString() // e.g., "1/1/23, 12:30 PM"
val formattedTime = dateTime.toShortTimeString() // e.g., "12:30 PM"
```

## Installation

To install the dependency in your project, add the following to your `settings.gradle.kts` file in the section `dependencyResolutionManagement -> repositories`:

```kotlin
dependencyResolutionManagement {
    repositories {
        maven { url = uri("https://jitpack.io") }
    }
}
```

then add the following to your `build.gradle.kts` file in the section `dependencies`:

```kotlin
implementation("com.github.felipearpa:foundation-android:main-SNAPSHOT")
```

## Contributing

If you would like to contribute, please open a pull request or submit an issue. We are happy to review your changes or ideas!

## License

This project is licensed under the [MIT License](LICENSE).
You are free to use, modify, and distribute this software for both personal and commercial use.
There are no restrictions on usage.

## API

### String Utilities

#### `emptyString()`

Returns an empty string constant.

```kotlin
val empty = emptyString() // Returns ""
```

### Date/Time Utilities

#### `LocalDate.toEpochMillis(timeZone: TimeZone = TimeZone.currentSystemDefault()): Long`

Converts a LocalDate to epoch milliseconds.

```kotlin
val date = LocalDate(2023, 1, 1)
val epochMillis = date.toEpochMillis() // Converts to epoch milliseconds using system default timezone
val epochMillisUtc = date.toEpochMillis(TimeZone.UTC) // Converts to epoch milliseconds using UTC
```

#### `LocalDate.toShortDateString(locale: Locale = Locale.getDefault()): String`

Formats a LocalDate as a short date string.

```kotlin
val date = LocalDate(2023, 1, 1)
val formatted = date.toShortDateString() // e.g., "1/1/23" (depends on locale)
val formattedFr = date.toShortDateString(Locale.FRANCE) // e.g., "01/01/23" (French format)
```

#### `LocalDateTime.toShortDateString(locale: Locale = Locale.getDefault()): String`

Formats the date part of a LocalDateTime as a short date string.

```kotlin
val dateTime = LocalDateTime(2023, 1, 1, 12, 30)
val formatted = dateTime.toShortDateString() // e.g., "1/1/23" (depends on locale)
```

#### `LocalDateTime.toShortDateTimeString(locale: Locale = Locale.getDefault()): String`

Formats a LocalDateTime as a short date-time string.

```kotlin
val dateTime = LocalDateTime(2023, 1, 1, 12, 30)
val formatted = dateTime.toShortDateTimeString() // e.g., "1/1/23, 12:30 PM" (depends on locale)
```

#### `LocalDateTime.toShortTimeString(locale: Locale = Locale.getDefault()): String`

Formats the time part of a LocalDateTime as a short time string.

```kotlin
val dateTime = LocalDateTime(2023, 1, 1, 12, 30)
val formatted = dateTime.toShortTimeString() // e.g., "12:30 PM" (depends on locale)
```
