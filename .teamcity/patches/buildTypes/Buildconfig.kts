package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.schedule
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs
import jetbrains.buildServer.configs.kotlin.v2019_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'Buildconfig'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("Buildconfig")) {
    triggers {
        add {
            vcs {
                branchFilter = ""
            }
        }
        add {
            schedule {
                schedulingPolicy = daily {
                    minute = 25
                }
                branchFilter = ""
                triggerBuild = always()
                withPendingChangesOnly = false
            }
        }
    }
}
