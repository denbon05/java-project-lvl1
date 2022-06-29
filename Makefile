test:
	./gradlew test

start:
	./gradlew run

start-prod:
	app/build/install/app/bin/app

build:
	./gradlew clean && ./gradlew installDist

.PHONY: test
