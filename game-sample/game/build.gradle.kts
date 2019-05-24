plugins {
    application
}

application {
	mainClassName="game.sample.Main"
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

val jar by tasks.getting(Jar::class) {
   manifest {
        attributes["Main-Class"] = "game.sample.Main"
   }
}