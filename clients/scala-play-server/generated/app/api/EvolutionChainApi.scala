package api

import play.api.libs.json._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-24T08:45:05.479546Z[Etc/UTC]")
trait EvolutionChainApi {
  /**
    */
  def evolutionChainList(limit: Option[Int], offset: Option[Int]): String

  /**
    */
  def evolutionChainRead(id: Int): String
}