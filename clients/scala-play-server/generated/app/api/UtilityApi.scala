package api

import play.api.libs.json._
import model.LanguageDetail
import model.PaginatedLanguageSummaryList

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait UtilityApi {
  /**
    * List languages
    * Languages for translations of API resource information.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def languageList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedLanguageSummaryList

  /**
    * Get language
    * Languages for translations of API resource information.
    * @param id This parameter can be a string or an integer.
    */
  def languageRetrieve(id: String): LanguageDetail
}
