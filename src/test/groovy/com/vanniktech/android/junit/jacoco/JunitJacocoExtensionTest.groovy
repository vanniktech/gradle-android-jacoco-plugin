package com.vanniktech.android.junit.jacoco

import org.junit.Test

class JunitJacocoExtensionTest {
  @Test void defaults() {
    def extension = new JunitJacocoExtension()

    assert extension.jacocoVersion == '0.8.2'
    assert extension.ignoreProjects.size() == 0
    assert extension.excludes == null
    assert !extension.includeNoLocationClasses
    assert !extension.includeInstrumentationCoverageInMergedReport
  }
}
