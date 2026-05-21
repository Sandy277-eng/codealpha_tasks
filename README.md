# Java Gradle CI/CD Demo

A simple Java application with automated CI/CD using Gradle and GitHub Actions.

## Project Structure
```
java-gradle-demo/
├── .github/workflows/build.yml   ← GitHub Actions CI pipeline
├── app/
│   ├── src/main/java/com/demo/App.java       ← Application code
│   ├── src/test/java/com/demo/AppTest.java   ← JUnit 5 tests
│   └── build.gradle                          ← Build config
├── gradle/wrapper/               ← Gradle wrapper
├── gradlew                       ← Unix build script
├── gradlew.bat                   ← Windows build script
└── settings.gradle               ← Project settings
```

## Run Locally

### Build everything
```bash
./gradlew build
```

### Run tests only
```bash
./gradlew test
```

### Run the application
```bash
./gradlew run
```

### Build the JAR
```bash
./gradlew jar
java -jar app/build/libs/java-gradle-demo-1.0.0.jar
```

### Clean build
```bash
./gradlew clean build
```

## CI/CD Pipeline

Push to `main` branch → GitHub Actions automatically:
1. Sets up JDK 17
2. Caches Gradle dependencies
3. Runs `./gradlew build`
4. Runs `./gradlew test`
5. Uploads JAR as downloadable artifact

## Expected Output
```
Hello from Java + Gradle CI/CD!
5 + 3 = 8
10 - 4 = 6
6 x 7 = 42
```
