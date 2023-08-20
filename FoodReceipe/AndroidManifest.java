<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:abdroid="https://schemas.android.com/apk/res/android"
	package="com.example.foodrecipe">

	<user-permission android:name="android.permission.INTERNET"/>
	<user-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>

	<application
		android:allowBackup="true"
		android:icon="@mipmap/ic_launcher"
		android:label="@string/app_name"
		android:roundIcon="@mipmap/ic_launcher_round"
		android:supportsRtl="true"
		android:theme="@style/Theme.FoodRecipe">
		<activity
			android:name=".MainActivity"
			android:exported="false">
		</activity>
		<activity
			android:name=".GridLayout"
			android:exported="false">
		</activity>
		<activity
			android:name=".GridLayout2"
			android:exported="false">
		</activity>
		<activity
			android:name=".splashscreen"
			android:theme="@style/Theme.AppCompat.DayNight.NoActionBar"
			android:exported="true">
			<intent-filter>
				<action android:name="android.intent.action.MAIN" />

				<category android:name="android.intent.category.LAUNCHER" />
			</intent-filter>
		</activity>
	</application>

</manifest>