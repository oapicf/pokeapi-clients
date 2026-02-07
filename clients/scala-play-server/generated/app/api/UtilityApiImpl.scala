package api

import model.LanguageDetail
import model.PaginatedLanguageSummaryList

/**
  * Provides a default implementation for [[UtilityApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class UtilityApiImpl extends UtilityApi {
  /**
    * @inheritdoc
    */
  override def languageList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedLanguageSummaryList = {
    // TODO: Implement better logic

    PaginatedLanguageSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def languageRetrieve(id: String): LanguageDetail = {
    // TODO: Implement better logic

    LanguageDetail(0, "", None, "", "", List.empty[LanguageName])
  }
}
