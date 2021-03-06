# easysharedpref
## How to :
To get a Git project into your build:

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

