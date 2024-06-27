import org.gradle.api.publish.PublishingExtension

apply<PublishPlugin>()

class PublishPlugin : Plugin<Settings> {

    override fun apply(settings: Settings) {
        settings.gradle.projectsEvaluated {
            allprojects { publishing() }
        }
    }

    private fun Project.publishing() {
        extensions.findByType<PublishingExtension>()?.apply {
            publications {
                register<MavenPublication>("release") {
                    groupId = "com.github.qq1322798305"
                    from(components["release"])
                }
            }
        }
    }
}