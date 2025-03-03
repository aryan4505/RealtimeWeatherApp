Real-Time Weather App - Jetpack Compose & Kotlin

🚀 Real-Time Weather App is a modern Android application built using Jetpack Compose and Kotlin, providing users with real-time weather updates. The app follows the MVVM (Model-View-ViewModel) architecture and integrates Weather API using Retrofit for seamless API communication.  

---

 🌟 Key Features  

🔹 Real-Time Weather Updates
- Fetches live weather data from a trusted weather API.  
- Displays temperature, humidity, wind speed, and weather conditions.  

🔹 MVVM Architecture  
- Ensures clean code and separation of concerns.  
- Uses ViewModel for managing UI-related data.  
- Implements LiveData/StateFlow for reactive UI updates.  

🔹 Jetpack Compose UI  
- Fully declarative UI for modern Android development.  
- Uses Material Design 3 for an intuitive and responsive interface.  
- Dark mode support for better usability.  

🔹Retrofit for API Integration  
- Fetches weather data efficiently using Retrofit.  
- Uses Gson for JSON parsing.  
- Implements Coroutines for asynchronous API calls.  

🔹Coil for Image Loading  
- Dynamically loads weather icons from API using Coil.  
- Ensures smooth and efficient image rendering.  

🔹 Location-Based Weather  
- Fetches the user’s current location using FusedLocationProvider.  
- Displays weather details based on GPS coordinates.  

🔹 Search Feature
- Allows users to search for weather in different cities.  
- Implements a search bar with debounce to optimize API calls.  

🔹 Offline Support  
- Caches the last retrieved weather data for offline access.  
- Uses Room Database for storing data locally.  

---

📌 Tech Stack
✅ Kotlin – Primary language for Android development.  
✅ Jetpack Compose – UI toolkit for modern declarative UI.  
✅ Retrofit – For handling API requests.  
✅ Coil – For efficient image loading.  
✅ Coroutines & Flow – For asynchronous programming.   

---
