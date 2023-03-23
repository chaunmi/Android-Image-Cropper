pluginManagement {
  repositories {
    maven { url=uri("https://maven.aliyun.com/repository/public") }
    maven { url=uri("https://maven.aliyun.com/repository/google") }
    maven {
      url=uri("https://maven.aliyun.com/repository/gradle-plugin")
    }
    maven { url=uri("https://maven.aliyun.com/repository/jcenter") }
    maven { url=uri("https://maven.aliyun.com/repository/central") }
  }
}

dependencyResolutionManagement {
  repositories {
    maven { url=uri("https://maven.aliyun.com/repository/public") }
    maven { url=uri("https://maven.aliyun.com/repository/google") }
    maven {
      url=uri("https://maven.aliyun.com/repository/gradle-plugin")
    }
    maven { url=uri("https://maven.aliyun.com/repository/jcenter") }
    maven { url=uri("https://maven.aliyun.com/repository/central") }
  }
}

include(":cropper")
include(":sample")
