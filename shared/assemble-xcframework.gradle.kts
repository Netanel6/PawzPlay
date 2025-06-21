import org.gradle.api.tasks.Exec

tasks.register("assembleXCFramework", Exec::class) {
    dependsOn(
        "linkDebugFrameworkIosSimulatorArm64",
        "linkDebugFrameworkIosArm64"
    )

    group = "build"
    description = "Assembles an XCFramework for iOS targets"

    val outputDir = buildDir.resolve("xcode-frameworks/Debug")

    doFirst {
        outputDir.mkdirs()
    }

    commandLine(
        "xcodebuild", "-create-xcframework",
        "-framework", buildDir.resolve("bin/iosArm64/debugFramework/shared.framework"),
        "-framework", buildDir.resolve("bin/iosSimulatorArm64/debugFramework/shared.framework"),
        "-output", outputDir.resolve("shared.xcframework")
    )
}
