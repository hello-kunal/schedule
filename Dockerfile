FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY build.gradle gradlew settings.gradle ./
COPY gradle gradle

RUN ./gradlew dependencies --refresh-dependencies

#FROM eclipse-temurin:17-jre
