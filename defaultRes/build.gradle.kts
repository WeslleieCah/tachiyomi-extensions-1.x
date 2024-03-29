plugins {
  id("com.android.library")
  id("kotlin-android")
}

android {
  compileSdkVersion(Config.compileSdk)

  defaultConfig {
    minSdkVersion(Config.minSdk)
  }

  sourceSets {
    named("main") {
      manifest.srcFile("AndroidManifest.xml")
      res.setSrcDirs(listOf("res"))
    }
  }

  libraryVariants.all {
    generateBuildConfigProvider?.configure {
      enabled = false
    }
  }
}
