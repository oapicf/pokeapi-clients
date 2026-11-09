package org.openapitools.server.model


/**
 * @param effect The localized effect text for an API resource in a specific language. for example: ''null''
 * @param shortEffect The localized effect text in brief. for example: ''null''
 * @param language The language this effect is in. for example: ''null''
*/
final case class AbilityEffectText (
  effect: String,
  shortEffect: String,
  language: LanguageSummary
)

