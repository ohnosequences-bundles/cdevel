package ohnosequencesBundles.statika

import ohnosequences.statika._

case object cdevel extends Bundle() {

  def instructions: AnyInstructions = cmd("yum")("groupinstall", "-y", "Development Tools")
}
