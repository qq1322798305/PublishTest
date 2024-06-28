plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.publishtest"
    defaultConfig { applicationId = "com.example.publishtest" }
    kotlinOptions { jvmTarget = Versions.jvmTarget }
}

dependencies {
    implementation(project(":mylibrary"))
    implementation(project(":mylibrary2"))
    implementation(Libs.`androidx-core-ktx`)
    implementation(Libs.`androidx-appcompat`)
    implementation(Libs.`androidx-constraintlayout`)
    implementation(Libs.material)
    testImplementation(Libs.junit)
    androidTestImplementation(Libs.`androidx-junit`)
    androidTestImplementation(Libs.`androidx-espresso-core`)
    implementation(Libs.insets)
    implementation(Libs.`insets-compat`)
    implementation(Libs.`insets-systembar`)
}