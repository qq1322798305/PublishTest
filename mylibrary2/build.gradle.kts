plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")
}

android {
    namespace = "com.example.mylibrary2"
    kotlinOptions { jvmTarget = Versions.jvmTarget }
}

dependencies {
    implementation(Libs.`androidx-core-ktx`)
    implementation(Libs.`androidx-appcompat`)
    testImplementation(Libs.junit)
    androidTestImplementation(Libs.`androidx-junit`)
    androidTestImplementation(Libs.`androidx-espresso-core`)
}