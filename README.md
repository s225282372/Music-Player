# 🎵 Android Music Player App

This Android application was developed using **Android Studio**. It allows users to select and play from at least two songs with standard playback controls. It includes a splash screen on startup and ensures that the user interface behaves contextually with the playback state.

---

## 📱 Features

- 🔊 Play, Pause, and Stop audio playback
- ✅ Disable irrelevant buttons based on the current state (e.g. disable Pause when already paused)
- 🎶 Includes **2 preloaded songs**
- ⏳ Splash screen on launch to improve user experience

---

## 🧑‍💻 Technologies Used

- **Java** or **Kotlin** (depending on your implementation)
- **Android Studio**
- **MediaPlayer API**
- **Intents** and **Handlers** (for managing activity transitions and timing)

---

## 🚀 How It Works

1. On launching the app, a **splash screen** appears for a few seconds.
2. The user is then taken to the **main screen** with song options and controls.
3. Once a song is selected, the user can:
   - ▶️ Start playback
   - ⏸ Pause playback (disabled if already paused)
   - ⏹ Stop playback (resets to beginning)
4. The UI adjusts buttons dynamically based on playback status.

---

## 📁 Project Structure

---

## 🎯 Best Practices Followed

- Contextual enabling/disabling of buttons
- Resource management (e.g., releasing `MediaPlayer` on stop)
- Clean UI transitions (Splash to Main)
- Separation of logic and layout (MVC-ish structure)

---

## ✅ Requirements

- Android Studio (latest stable)
- Android SDK 21+
- At least two `.mp3` files placed in `res/raw/`

---

## 🧑‍🎓 Author
 **Maselaelo Glen** 
 
*Developed for educational and portfolio purposes.*
