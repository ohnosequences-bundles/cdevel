
```scala
package ohnosequencesBundles.statika

import ohnosequences.statika._, bundles._, instructions._

case object cdevel extends Bundle {

  def install: Results = Seq("yum", "group", "install", "-y", "Development Tools") ->-
		success(s"${bundleName} is installed")
}

```




[main/scala/cdevel.scala]: cdevel.scala.md