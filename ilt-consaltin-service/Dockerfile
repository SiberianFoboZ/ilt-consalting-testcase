#
# Build stage
#
FROM maven:3.8.4-eclipse-temurin-17-alpine as build
WORKDIR /workspace/app
COPY . .
RUN mvn package
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

#
# Package stage
#
FROM eclipse-temurin:17.0.2_8-jre-alpine
ARG DEPENDENCY=/workspace/app/target/dependency
COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","ilt.consalting.testcase.IltConsaltingService"]
