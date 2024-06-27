import com.android.build.gradle.LibraryExtension

apply<PublishPlugin>()

class PublishPlugin : Plugin<Project> {

    override fun apply(target: Project) = target.subprojects {
        afterEvaluate action@{
            if (!plugins.hasPlugin("maven-publish")) {
                return@action
            }

            publishing {
                publications {
                    register<MavenPublication>("release") {
                        groupId = "com.github.qq1322798305"
                        afterEvaluate { from(components["release"]) }
                    }
                }
            }

            android {
                publishing {
                    singleVariant("release") {
                        withSourcesJar()
                        withJavadocJar()
                    }
                }
            }
        }
    }

    private inline fun Project.publishing(block: PublishingExtension.() -> Unit) {
        extensions.getByType<PublishingExtension>().apply(block)
    }

    private inline fun Project.android(block: LibraryExtension.() -> Unit) {
        extensions.getByType<LibraryExtension>().apply(block)
    }
}