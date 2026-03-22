<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.school.app">

    <uses-permission android:name="android.permission.INTERNET"/>

    <application
        android:label="School App"
        android:theme="@android:style/Theme.NoTitleBar">

        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN"/>
                <category android:name="android.intent.category.LAUNCHER"/>
            </intent-filter>
        </activity>

    </application>
</manifest>
