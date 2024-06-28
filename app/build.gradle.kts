plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.publishtest"
    defaultConfig { applicationId = "com.example.publishtest" }
    kotlinOptions { jvmTarget = "1.8" }
}

dependencies {
    implementation(project(":mylibrary"))
    implementation(project(":mylibrary2"))
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.7.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.0")
    val version = "1.2.4"
    implementation("com.github.xiaocydx.Insets:insets:${version}")
    implementation("com.github.xiaocydx.Insets:insets-compat:${version}")
    implementation("com.github.xiaocydx.Insets:insets-systembar:${version}")
}