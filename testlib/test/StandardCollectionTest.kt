package test.collections

import std.*
import kool.test.*

class StandardCollectionTest() : TestSupport() {

  fun testDisabled() {
  }

  /*
  fun testAny() {
    // TODO requires KT-924 to be implemented
    val data: Iterable<String> = std.util.arrayList("foo", "bar")

    assertTrue {
      data.any{it.startsWith("f")}
    }
    assertNot {
      data.any{it.startsWith("x")}
    }
  }
  */
}