# Digital Counter App

A simple Android application that allows users to perform basic count operations through an interactive and user-friendly interface.

## 📌 Features
* **Increment Counter:** Increase the counter value by 1 with each tap.
* **Decrement Counter:** Decrease the counter value by 1 with a check to prevent negative values.
* **Reset Counter:** Instantly reset the counter back to zero.
* **State Management:** Dynamically updates and displays the current application state.

## 🛠️ Tools & Technologies
* **Language:** Kotlin
* **UI Layout:** XML (ConstraintLayout)
* **IDE:** Android Studio
* **Target OS:** Android

## 🚀 How to Run the Project
1. Clone or download this repository to your local machine.
2. Open **Android Studio** and click **Open**, then select the project folder.
3. Wait for **Gradle** to sync all dependencies.
4. Select an Android Emulator (AVD) or connect a physical Android device with USB Debugging enabled.
5. Click the green **Run (▶)** button in the top toolbar to build and run the app.

## ❓ Interview & Technical Questions

### 1. How is application state maintained?
In this implementation, the state is stored in an in-memory instance variable (`private var count = 0`) inside `MainActivity`. When user events occur (button clicks), this variable updates, and a helper function (`updateCounter()`) reflects the updated state on the `TextView`.

### 2. What happens when a button is clicked?
When a button is clicked:
1. An `OnClickListener` event triggers the corresponding Kotlin logic.
2. The state variable `count` is updated (incremented, decremented, or reset).
3. The `TextView` is refreshed with the new value, immediately updating the user interface.
