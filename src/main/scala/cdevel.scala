package ohnosequencesBundles.statika

import ohnosequences.statika._

case object cdevel extends Bundle() {

  def instructions: AnyInstructions = cmd("yum")("group", "install", "-y", "Development Tools")
}
