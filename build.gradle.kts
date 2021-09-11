plugins {
    `groovy`
    `java`
    `maven-publish`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.codehaus.groovy:groovy-all:3.0.5")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
    implementation(gradleApi())
    implementation(localGroovy())
}

publishing {
    publications {
        create<MavenPublication>("EasyDependencies") {
            groupId = "com.peterbucko"
            artifactId = "easy-dependencies"
            version = "0.1"

            from(components["java"])

        }
    }
    repositories {
        maven {
            name = "myRepo"
            url = uri(layout.buildDirectory.dir("repo"))
        }
    }

}

