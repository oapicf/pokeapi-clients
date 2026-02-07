package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param order  for example: ''null''
 * @param formOrder  for example: ''null''
 * @param isDefault  for example: ''null''
 * @param isBattleOnly  for example: ''null''
 * @param isMega  for example: ''null''
 * @param formName  for example: ''null''
 * @param pokemon  for example: ''null''
 * @param sprites  for example: ''null''
 * @param versionGroup  for example: ''null''
 * @param formNames  for example: ''null''
 * @param names  for example: ''null''
 * @param types  for example: ''null''
*/
final case class PokemonFormDetail (
  id: Int,
  name: String,
  order: Option[Int] = None,
  formOrder: Option[Int] = None,
  isDefault: Option[Boolean] = None,
  isBattleOnly: Option[Boolean] = None,
  isMega: Option[Boolean] = None,
  formName: String,
  pokemon: PokemonSummary,
  sprites: PokemonFormDetailSprites,
  versionGroup: VersionGroupSummary,
  formNames: Seq[PokemonFormDetailFormNamesInner],
  names: Seq[PokemonFormDetailFormNamesInner],
  types: Seq[PokemonDetailTypesInner]
)

