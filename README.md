# EasySharedPref
EasySharedPref is a library working as SharedPreferences . We can handling our data using only writing read and write after init.

## How to :

**Step 1.**  Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:
```css
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

**Step 2.** Add the dependency

```css
	dependencies {
	        implementation 'com.github.Kayuemkhan:easysharedpref:1.0.1'
	}
```
**That's it!**

## **In Java Code**
### Initialize easysharedpref
Should be initialized once in  `Application.onCreate()`:

```css
	EasySharedPref.init(Context context);
```
### Save/Write Data

Save any texts as saved  as key, value pair. 
```css
EasySharedPref.write("key","data");
```

### Read Data

Read as the key name
```css
EasySharedPref.read("key","");
```
**Thank you !** 
