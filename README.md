# 🚀 EasySharedPref

[![](https://jitpack.io/v/Kayuemkhan/easysharedpref.svg)](https://jitpack.io/#Kayuemkhan/easysharedpref)

**EasySharedPref** is a lightweight and developer-friendly Android library built on top of `SharedPreferences`. It makes reading and writing data effortless using simple `read()` and `write()` calls — no boilerplate or setup madness!

> ✅ Perfect for storing user sessions, app settings, flags, and lightweight key-value data.

---

## ✨ Features

- 🧠 Easy-to-use API — save and read data in a single line  
- 💡 Singleton pattern — initialized once, used everywhere  
- ⚡ Blazing fast — built on native `SharedPreferences`  
- 🔐 Safe and null-friendly  
- ☕ Java Compatible  

> 🛠 Current version supports saving **String values** (more types and features coming soon!).

---

## 📦 Installation

### ✅ Step 1. Add the JitPack repository

Add this in your root `build.gradle`:

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
### 💾 Step 2. Add the dependency 
```groovy
dependencies {
    implementation 'com.github.Kayuemkhan:easysharedpref:1.0.2'
}
```

### 📖 Step 3: Read/Retrieve Data

```groovy
String name = EasySharedPref.read("user_name", "Guest");

```

### 💡 Example

```groovy
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EasySharedPref.init(getApplicationContext());

        EasySharedPref.write("quote", "Stay motivated!");
        String quote = EasySharedPref.read("quote", "No data");

        Log.d("SharedPref", "Quote: " + quote);
    }
}
```

### ✅ Upcoming Features (Next Versions)

<b>Stay tuned! These exciting features are on the roadmap: </b>


✅ Support for all data types: int, boolean, float, long, Set<String>

🔐 EncryptedSharedPreferences support

⚙️ Batch writing & reading

📊 Key usage stats & debug logging

🔄 Preference change listeners

🧠 Kotlin + Jetpack Compose support

🌐 Export/import preferences as JSON

🔁 Reified generics and model saving

### 🙌 Contributions

Want to contribute or suggest features?
Open an issue or create a <b> PR </b>— let's improve this together!

### 🧑 Author

Abdul Kayuem


📃 License
MIT License © 2021 Abdul Kayuem

### ⭐️ Show Some Love

If you found this library useful, please give it a ⭐ on GitHub!

	Happy Coding



