package com.abc

import com.squareup.protos.connect.v2.AuxiliaryInfo
import org.junit.Test

class TestFile {

  @Test fun `here is the failure`() {
    AuxiliaryInfo.Builder().build()
  }
}
