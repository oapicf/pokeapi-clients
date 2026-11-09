package api

import model.LanguageDetail
import model.PaginatedLanguageSummaryList
import model.PokeapiMetaResponse

/**
  * Provides a default implementation for [[UtilityApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
class UtilityApiImpl extends UtilityApi {
  /**
    * @inheritdoc
    */
  override def languageList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedLanguageSummaryList = {
    // TODO: Implement better logic

    PaginatedLanguageSummaryList(0, None, None, List.empty[LanguageSummary])
  }

  /**
    * @inheritdoc
    */
  override def languageRetrieve(id: String): LanguageDetail = {
    // TODO: Implement better logic

    LanguageDetail(0, "", None, "", "", List.empty[LanguageName])
  }

  /**
    * @inheritdoc
    */
  override def metaRetrieve(): PokeapiMetaResponse = {
    // TODO: Implement better logic

    PokeapiMetaResponse("", "", "")
  }
}
