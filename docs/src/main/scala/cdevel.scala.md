
```scala
package ohnosequencesBundles.statika

import ohnosequences.statika._, bundles._, instructions._

case object cdevel extends Bundle() {

  def instructions: AnyInstructions = cmd("yum")("group", "install", "-y", "Development Tools")
}

```




[main/scala/cdevel.scala]: cdevel.scala.md