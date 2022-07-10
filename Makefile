test:
	./gradlew test

run:
	./gradlew run

run-dist:
	./build/install/app/bin/app

build:
	./gradlew clean && ./gradlew installDist

check:
	./gradlew check

.PHONY: test, build
