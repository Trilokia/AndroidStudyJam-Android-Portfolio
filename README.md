
# Android Portfolio App Codelab

In this codelab, you create your first Android app with a project template provided by Android Studio

## Prerequisites

* Intermediate computer skills, including understanding file structure and using moderately complex applications, such as a spreadsheet, word processor, and photo editor.
* Computer navigation skills, so that you can open and adjust settings and identify browser and operating system (OS) versions.
* Android Studio installed on your machine. You can find installation instructions at [Android official website](https://developer.android.com/studio/install).

## What you'll learn
* How to create an Android App with Android Studio
* How to run apps with the Preview tool in Android Studio
* How to update text with Kotlin
* How to update a User Interface (UI)
* How to see a preview of your app with Preview


## What you'll build
An app that lets you customize your introduction!
Just like a simple Portfolio app. The app will display the user's contact information like a Portfolio, and you'll learn how to use basic UI components to create a visually appealing and functional UI.

## Step 1: Create a new  project
* Double click the Android Studio icon to launch Android Studio.
* In the Welcome to Android Studio dialog, click New Project. The New Project window opens with a list of templates provided by Android Studio.
* Click the Empty View Activity template to select it as the template for your project and make sure the Phone and Tablet tab is selected.
* Click Next. The New Project dialog opens. This has some fields to configure your project. Now configure your project as follows:
    * The Name field is used to enter the name of your project, for this codelab type "My Portofolio".
    * Leave the Package name field as is. This is how your files will be organized in the file structure. In this case, the package name will be com.example.myapplication.
    * Leave the Save location field as is. It contains the location where all the files related to your project are saved. Take a note of where that is on your computer so that you can find your files.
    * Language defines which programming language you want to use for your project. Make sure the Language is Kotlin.
    * Select API 24: Android 7.0 (Nougat) from the menu in the Minimum SDK field. Minimum SDK indicates the minimum version of Android that your app can run on.
* Click Finish. This may take a while - this is a great time to get a cup of tea! While Android Studio is setting up, a progress bar and message indicates whether Android Studio is still setting up your project. 

## Step 2: Understanding basics
* In Android Studio, take a look at the Project tab. The Project tab shows the files and folders of your project. When you were setting up your project the package name. You can see that package right here in the Project tab. A package is basically a folder where code is located. Android Studio organizes the project in a directory structure made up of set of packages.
* Click Split on the top right of Android Studio, this allows you to view both code and design. You can also click Code to view code only or click Design to view design only.
    * The Project view (1) shows the files and folders of your project
    * The Code view (2) is where you edit code
    * The Design view (3) is where you preview what your app looks like

## Step 3: Update layout
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="160dp"
        android:layout_height="160dp"
        android:layout_above="@id/tv_title"
        android:layout_centerInParent="true"
        app:srcCompat="@drawable/profile" />

    <TextView
        android:id="@+id/tv_title"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_above="@id/tv_subtitle"
        android:layout_centerInParent="true"
        android:text="Abhinandan Trilokia"
        android:textAppearance="@style/TextAppearance.AppCompat.Large"
        android:textSize="34sp"
        android:textStyle="bold"
        android:typeface="sans" />

    <TextView
        android:id="@+id/tv_subtitle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:layout_marginTop="8dp"
        android:text="Android Developer"
        android:textSize="24sp" />




    <LinearLayout
        android:padding="10dp"
        android:id="@+id/lyt_phone"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"
        android:layout_above="@id/lyt_share"
        android:orientation="horizontal">

        <ImageView
            android:layout_weight="1"
            android:id="@+id/imageView4"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            app:srcCompat="@drawable/ic_phone" />

        <TextView
            android:id="@+id/textView4"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="3"
            android:text="+91:9469084068"
            android:textSize="20sp" />
    </LinearLayout>

    <LinearLayout
        android:padding="10dp"
        android:id="@+id/lyt_share"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"
        android:layout_above="@id/lyt_email"
        android:orientation="horizontal">

        <ImageView
            android:layout_weight="1"
            android:id="@+id/imageView5"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            app:srcCompat="@drawable/ic_share" />

        <TextView
            android:id="@+id/textView5"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="3"
            android:text="Imtrilokia.dev"

            android:textSize="20sp" />
    </LinearLayout>


    <LinearLayout
        android:padding="10dp"
        android:id="@+id/lyt_email"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:orientation="horizontal">

        <ImageView
            android:layout_weight="1"
            android:id="@+id/imageView6"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_marginBottom="16dp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:srcCompat="@drawable/ic_email" />

        <TextView
            android:id="@+id/textView6"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_marginBottom="16dp"
            android:layout_weight="3"
            android:text="hi@imtrilokia.dev"
            android:textSize="20sp"
            app:layout_constraintBottom_toBottomOf="parent" />
    </LinearLayout>

</RelativeLayout>

```
## Code Description
Now that you have gotten to know Android Studio, it's time to start making your greeting card!

Look at the Code view of the MainActivity.kt file. Notice there are some automatically generated functions in this code, specifically the onCreate() and the setContent() functions.

The onCreate() function is the entry point to this Android app and calls other functions to build the user interface. In Kotlin programs, the main() function is the entry point/starting point of execution. In Android apps, the onCreate() function fills that role.

The setContent() function within the onCreate() function is used to define your layout through composable functions

## Step 4: Prepare your assets

1. Place an image named `profile.jepg` in the `drawable` folder of your project. This image will be used as the Portfolio owner's profile picture.

## Step 5: Run the app

Simply click on Run icon or Shift+F10(Windows and Linux)	Control+R(Mac)

## Step 6: Adding more feature

 Use your creativity to enhance app's experience
* Tip:
    * Added intent on click
    * Change Background color
    * Try different text font 
    * Change Imageview Shape


## Conclusion

Congratulations! You've just created a basic Portfolio app using Android. You've learned how to use basic components to build the user interface and display contact information like a Portfolio. Feel free to enhance the app by adding more features and personalizing it to your liking.

You can find the complete source code for this codelab on [GitHub](https://github.com/atul573/flutter-businessCard).

Happy coding! 🚀
