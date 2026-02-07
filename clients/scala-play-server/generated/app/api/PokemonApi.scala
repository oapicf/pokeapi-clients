package api

import play.api.libs.json._
import model.AbilityDetail
import model.CharacteristicDetail
import model.EggGroupDetail
import model.GenderDetail
import model.GrowthRateDetail
import model.MoveDamageClassDetail
import model.NatureDetail
import model.PaginatedAbilitySummaryList
import model.PaginatedCharacteristicSummaryList
import model.PaginatedEggGroupSummaryList
import model.PaginatedGenderSummaryList
import model.PaginatedGrowthRateSummaryList
import model.PaginatedMoveDamageClassSummaryList
import model.PaginatedNatureSummaryList
import model.PaginatedPokeathlonStatSummaryList
import model.PaginatedPokemonColorSummaryList
import model.PaginatedPokemonFormSummaryList
import model.PaginatedPokemonHabitatSummaryList
import model.PaginatedPokemonShapeSummaryList
import model.PaginatedPokemonSpeciesSummaryList
import model.PaginatedPokemonSummaryList
import model.PaginatedStatSummaryList
import model.PaginatedTypeSummaryList
import model.PokeathlonStatDetail
import model.PokemonColorDetail
import model.PokemonDetail
import model.PokemonFormDetail
import model.PokemonHabitatDetail
import model.PokemonShapeDetail
import model.PokemonSpeciesDetail
import model.StatDetail
import model.TypeDetail

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait PokemonApi {
  /**
    * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def abilityList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedAbilitySummaryList

  /**
    * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
    * @param id This parameter can be a string or an integer.
    */
  def abilityRetrieve(id: String): AbilityDetail

  /**
    * List charecterictics
    * Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def characteristicList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedCharacteristicSummaryList

  /**
    * Get characteristic
    * Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
    * @param id This parameter can be a string or an integer.
    */
  def characteristicRetrieve(id: String): CharacteristicDetail

  /**
    * List egg groups
    * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def eggGroupList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedEggGroupSummaryList

  /**
    * Get egg group
    * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
    * @param id This parameter can be a string or an integer.
    */
  def eggGroupRetrieve(id: String): EggGroupDetail

  /**
    * List genders
    * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def genderList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedGenderSummaryList

  /**
    * Get gender
    * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
    * @param id This parameter can be a string or an integer.
    */
  def genderRetrieve(id: String): GenderDetail

  /**
    * List growth rates
    * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def growthRateList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedGrowthRateSummaryList

  /**
    * Get growth rate
    * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
    * @param id This parameter can be a string or an integer.
    */
  def growthRateRetrieve(id: String): GrowthRateDetail

  /**
    * List move damage classes
    * Damage classes moves can have, e.g. physical, special, or non-damaging.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def moveDamageClassList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedMoveDamageClassSummaryList

  /**
    * Get move damage class
    * Damage classes moves can have, e.g. physical, special, or non-damaging.
    * @param id This parameter can be a string or an integer.
    */
  def moveDamageClassRetrieve(id: String): MoveDamageClassDetail

  /**
    * List natures
    * Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def natureList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedNatureSummaryList

  /**
    * Get nature
    * Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
    * @param id This parameter can be a string or an integer.
    */
  def natureRetrieve(id: String): NatureDetail

  /**
    * List pokeathlon stats
    * Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def pokeathlonStatList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedPokeathlonStatSummaryList

  /**
    * Get pokeathlon stat
    * Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
    * @param id This parameter can be a string or an integer.
    */
  def pokeathlonStatRetrieve(id: String): PokeathlonStatDetail

  /**
    * List pokemon colors
    * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def pokemonColorList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedPokemonColorSummaryList

  /**
    * Get pokemon color
    * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
    * @param id This parameter can be a string or an integer.
    */
  def pokemonColorRetrieve(id: String): PokemonColorDetail

  /**
    * List pokemon forms
    * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def pokemonFormList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedPokemonFormSummaryList

  /**
    * Get pokemon form
    * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.
    * @param id This parameter can be a string or an integer.
    */
  def pokemonFormRetrieve(id: String): PokemonFormDetail

  /**
    * List pokemom habitas
    * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def pokemonHabitatList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedPokemonHabitatSummaryList

  /**
    * Get pokemom habita
    * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
    * @param id This parameter can be a string or an integer.
    */
  def pokemonHabitatRetrieve(id: String): PokemonHabitatDetail

  /**
    * List pokemon
    * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def pokemonList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedPokemonSummaryList

  /**
    * Get pokemon
    * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
    * @param id This parameter can be a string or an integer.
    */
  def pokemonRetrieve(id: String): PokemonDetail

  /**
    * List pokemon shapes
    * Shapes used for sorting Pokémon in a Pokédex.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def pokemonShapeList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedPokemonShapeSummaryList

  /**
    * Get pokemon shape
    * Shapes used for sorting Pokémon in a Pokédex.
    * @param id This parameter can be a string or an integer.
    */
  def pokemonShapeRetrieve(id: String): PokemonShapeDetail

  /**
    * List pokemon species
    * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def pokemonSpeciesList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedPokemonSpeciesSummaryList

  /**
    * Get pokemon species
    * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
    * @param id This parameter can be a string or an integer.
    */
  def pokemonSpeciesRetrieve(id: String): PokemonSpeciesDetail

  /**
    * List stats
    * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def statList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedStatSummaryList

  /**
    * Get stat
    * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
    * @param id This parameter can be a string or an integer.
    */
  def statRetrieve(id: String): StatDetail

  /**
    * List types
    * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def typeList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedTypeSummaryList

  /**
    * Get types
    * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
    * @param id This parameter can be a string or an integer.
    */
  def typeRetrieve(id: String): TypeDetail
}
