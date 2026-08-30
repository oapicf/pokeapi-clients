package org.openapitools.api.interfaces;

import org.openapitools.model.AbilityDetail;
import org.openapitools.model.BerryDetail;
import org.openapitools.model.BerryFirmnessDetail;
import org.openapitools.model.BerryFlavorDetail;
import org.openapitools.model.CharacteristicDetail;
import org.openapitools.model.ContestEffectDetail;
import org.openapitools.model.ContestTypeDetail;
import org.openapitools.model.EggGroupDetail;
import org.openapitools.model.EncounterConditionDetail;
import org.openapitools.model.EncounterConditionValueDetail;
import org.openapitools.model.EncounterMethodDetail;
import org.openapitools.model.EvolutionChainDetail;
import org.openapitools.model.EvolutionTriggerDetail;
import org.openapitools.model.GenderDetail;
import org.openapitools.model.GenerationDetail;
import org.openapitools.model.GrowthRateDetail;
import org.openapitools.model.ItemAttributeDetail;
import org.openapitools.model.ItemCategoryDetail;
import org.openapitools.model.ItemDetail;
import org.openapitools.model.ItemFlingEffectDetail;
import org.openapitools.model.ItemPocketDetail;
import org.openapitools.model.LanguageDetail;
import org.openapitools.model.LocationAreaDetail;
import org.openapitools.model.LocationDetail;
import org.openapitools.model.MachineDetail;
import org.openapitools.model.MoveBattleStyleDetail;
import org.openapitools.model.MoveDamageClassDetail;
import org.openapitools.model.MoveDetail;
import org.openapitools.model.MoveLearnMethodDetail;
import org.openapitools.model.MoveMetaAilmentDetail;
import org.openapitools.model.MoveMetaCategoryDetail;
import org.openapitools.model.MoveTargetDetail;
import org.openapitools.model.NatureDetail;
import org.openapitools.model.PaginatedAbilitySummaryList;
import org.openapitools.model.PaginatedBerryFirmnessSummaryList;
import org.openapitools.model.PaginatedBerryFlavorSummaryList;
import org.openapitools.model.PaginatedBerrySummaryList;
import org.openapitools.model.PaginatedCharacteristicSummaryList;
import org.openapitools.model.PaginatedContestEffectSummaryList;
import org.openapitools.model.PaginatedContestTypeSummaryList;
import org.openapitools.model.PaginatedEggGroupSummaryList;
import org.openapitools.model.PaginatedEncounterConditionSummaryList;
import org.openapitools.model.PaginatedEncounterConditionValueSummaryList;
import org.openapitools.model.PaginatedEncounterMethodSummaryList;
import org.openapitools.model.PaginatedEvolutionChainSummaryList;
import org.openapitools.model.PaginatedEvolutionTriggerSummaryList;
import org.openapitools.model.PaginatedGenderSummaryList;
import org.openapitools.model.PaginatedGenerationSummaryList;
import org.openapitools.model.PaginatedGrowthRateSummaryList;
import org.openapitools.model.PaginatedItemAttributeSummaryList;
import org.openapitools.model.PaginatedItemCategorySummaryList;
import org.openapitools.model.PaginatedItemFlingEffectSummaryList;
import org.openapitools.model.PaginatedItemPocketSummaryList;
import org.openapitools.model.PaginatedItemSummaryList;
import org.openapitools.model.PaginatedLanguageSummaryList;
import org.openapitools.model.PaginatedLocationAreaSummaryList;
import org.openapitools.model.PaginatedLocationSummaryList;
import org.openapitools.model.PaginatedMachineSummaryList;
import org.openapitools.model.PaginatedMoveBattleStyleSummaryList;
import org.openapitools.model.PaginatedMoveDamageClassSummaryList;
import org.openapitools.model.PaginatedMoveLearnMethodSummaryList;
import org.openapitools.model.PaginatedMoveMetaAilmentSummaryList;
import org.openapitools.model.PaginatedMoveMetaCategorySummaryList;
import org.openapitools.model.PaginatedMoveSummaryList;
import org.openapitools.model.PaginatedMoveTargetSummaryList;
import org.openapitools.model.PaginatedNatureSummaryList;
import org.openapitools.model.PaginatedPalParkAreaSummaryList;
import org.openapitools.model.PaginatedPokeathlonStatSummaryList;
import org.openapitools.model.PaginatedPokedexSummaryList;
import org.openapitools.model.PaginatedPokemonColorSummaryList;
import org.openapitools.model.PaginatedPokemonFormSummaryList;
import org.openapitools.model.PaginatedPokemonHabitatSummaryList;
import org.openapitools.model.PaginatedPokemonShapeSummaryList;
import org.openapitools.model.PaginatedPokemonSpeciesSummaryList;
import org.openapitools.model.PaginatedPokemonSummaryList;
import org.openapitools.model.PaginatedRegionSummaryList;
import org.openapitools.model.PaginatedStatSummaryList;
import org.openapitools.model.PaginatedSuperContestEffectSummaryList;
import org.openapitools.model.PaginatedTypeSummaryList;
import org.openapitools.model.PaginatedVersionGroupSummaryList;
import org.openapitools.model.PaginatedVersionSummaryList;
import org.openapitools.model.PalParkAreaDetail;
import org.openapitools.model.PokeathlonStatDetail;
import org.openapitools.model.PokedexDetail;
import org.openapitools.model.PokemonColorDetail;
import org.openapitools.model.PokemonDetail;
import org.openapitools.model.PokemonFormDetail;
import org.openapitools.model.PokemonHabitatDetail;
import org.openapitools.model.PokemonShapeDetail;
import org.openapitools.model.PokemonSpeciesDetail;
import org.openapitools.model.RegionDetail;
import org.openapitools.model.StatDetail;
import org.openapitools.model.SuperContestEffectDetail;
import org.openapitools.model.TypeDetail;
import org.openapitools.model.VersionDetail;
import org.openapitools.model.VersionGroupDetail;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface ApiService {

    /**
     * 
     * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedAbilitySummaryList
     */
    PaginatedAbilitySummaryList abilityList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * 
     * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return AbilityDetail
     */
    AbilityDetail abilityRetrieve(
        String id
    );

    /**
     * List berry firmness
     * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedBerryFirmnessSummaryList
     */
    PaginatedBerryFirmnessSummaryList berryFirmnessList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get berry by firmness
     * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return BerryFirmnessDetail
     */
    BerryFirmnessDetail berryFirmnessRetrieve(
        String id
    );

    /**
     * List berry flavors
     * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedBerryFlavorSummaryList
     */
    PaginatedBerryFlavorSummaryList berryFlavorList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get berries by flavor
     * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return BerryFlavorDetail
     */
    BerryFlavorDetail berryFlavorRetrieve(
        String id
    );

    /**
     * List berries
     * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedBerrySummaryList
     */
    PaginatedBerrySummaryList berryList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get a berry
     * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return BerryDetail
     */
    BerryDetail berryRetrieve(
        String id
    );

    /**
     * List charecterictics
     * Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedCharacteristicSummaryList
     */
    PaginatedCharacteristicSummaryList characteristicList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get characteristic
     * Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return CharacteristicDetail
     */
    CharacteristicDetail characteristicRetrieve(
        String id
    );

    /**
     * List contest effects
     * Contest effects refer to the effects of moves when used in contests.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedContestEffectSummaryList
     */
    PaginatedContestEffectSummaryList contestEffectList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get contest effect
     * Contest effects refer to the effects of moves when used in contests.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return ContestEffectDetail
     */
    ContestEffectDetail contestEffectRetrieve(
        String id
    );

    /**
     * List contest types
     * Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedContestTypeSummaryList
     */
    PaginatedContestTypeSummaryList contestTypeList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get contest type
     * Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return ContestTypeDetail
     */
    ContestTypeDetail contestTypeRetrieve(
        String id
    );

    /**
     * List egg groups
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedEggGroupSummaryList
     */
    PaginatedEggGroupSummaryList eggGroupList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get egg group
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return EggGroupDetail
     */
    EggGroupDetail eggGroupRetrieve(
        String id
    );

    /**
     * List encounter conditions
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedEncounterConditionSummaryList
     */
    PaginatedEncounterConditionSummaryList encounterConditionList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get encounter condition
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return EncounterConditionDetail
     */
    EncounterConditionDetail encounterConditionRetrieve(
        String id
    );

    /**
     * List encounter condition values
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedEncounterConditionValueSummaryList
     */
    PaginatedEncounterConditionValueSummaryList encounterConditionValueList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get encounter condition value
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return EncounterConditionValueDetail
     */
    EncounterConditionValueDetail encounterConditionValueRetrieve(
        String id
    );

    /**
     * List encounter methods
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedEncounterMethodSummaryList
     */
    PaginatedEncounterMethodSummaryList encounterMethodList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get encounter method
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return EncounterMethodDetail
     */
    EncounterMethodDetail encounterMethodRetrieve(
        String id
    );

    /**
     * List evolution chains
     * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedEvolutionChainSummaryList
     */
    PaginatedEvolutionChainSummaryList evolutionChainList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get evolution chain
     * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return EvolutionChainDetail
     */
    EvolutionChainDetail evolutionChainRetrieve(
        String id
    );

    /**
     * List evolution triggers
     * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedEvolutionTriggerSummaryList
     */
    PaginatedEvolutionTriggerSummaryList evolutionTriggerList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get evolution trigger
     * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return EvolutionTriggerDetail
     */
    EvolutionTriggerDetail evolutionTriggerRetrieve(
        String id
    );

    /**
     * List genders
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedGenderSummaryList
     */
    PaginatedGenderSummaryList genderList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get gender
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return GenderDetail
     */
    GenderDetail genderRetrieve(
        String id
    );

    /**
     * List genrations
     * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedGenerationSummaryList
     */
    PaginatedGenerationSummaryList generationList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get genration
     * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return GenerationDetail
     */
    GenerationDetail generationRetrieve(
        String id
    );

    /**
     * List growth rates
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedGrowthRateSummaryList
     */
    PaginatedGrowthRateSummaryList growthRateList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get growth rate
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return GrowthRateDetail
     */
    GrowthRateDetail growthRateRetrieve(
        String id
    );

    /**
     * List item attributes
     * Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedItemAttributeSummaryList
     */
    PaginatedItemAttributeSummaryList itemAttributeList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get item attribute
     * Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return ItemAttributeDetail
     */
    ItemAttributeDetail itemAttributeRetrieve(
        String id
    );

    /**
     * List item categories
     * Item categories determine where items will be placed in the players bag.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedItemCategorySummaryList
     */
    PaginatedItemCategorySummaryList itemCategoryList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get item category
     * Item categories determine where items will be placed in the players bag.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return ItemCategoryDetail
     */
    ItemCategoryDetail itemCategoryRetrieve(
        String id
    );

    /**
     * List item fling effects
     * The various effects of the move\&quot;Fling\&quot; when used with different items.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedItemFlingEffectSummaryList
     */
    PaginatedItemFlingEffectSummaryList itemFlingEffectList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get item fling effect
     * The various effects of the move\&quot;Fling\&quot; when used with different items.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return ItemFlingEffectDetail
     */
    ItemFlingEffectDetail itemFlingEffectRetrieve(
        String id
    );

    /**
     * List items
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedItemSummaryList
     */
    PaginatedItemSummaryList itemList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * List item pockets
     * Pockets within the players bag used for storing items by category.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedItemPocketSummaryList
     */
    PaginatedItemPocketSummaryList itemPocketList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get item pocket
     * Pockets within the players bag used for storing items by category.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return ItemPocketDetail
     */
    ItemPocketDetail itemPocketRetrieve(
        String id
    );

    /**
     * Get item
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return ItemDetail
     */
    ItemDetail itemRetrieve(
        String id
    );

    /**
     * List languages
     * Languages for translations of API resource information.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedLanguageSummaryList
     */
    PaginatedLanguageSummaryList languageList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get language
     * Languages for translations of API resource information.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return LanguageDetail
     */
    LanguageDetail languageRetrieve(
        String id
    );

    /**
     * List location areas
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @return PaginatedLocationAreaSummaryList
     */
    PaginatedLocationAreaSummaryList locationAreaList(
        Integer limit,
        Integer offset
    );

    /**
     * Get location area
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     *
     * @param id A unique integer value identifying this location area. (required)
     * @return LocationAreaDetail
     */
    LocationAreaDetail locationAreaRetrieve(
        Integer id
    );

    /**
     * List locations
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedLocationSummaryList
     */
    PaginatedLocationSummaryList locationList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get location
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return LocationDetail
     */
    LocationDetail locationRetrieve(
        String id
    );

    /**
     * List machines
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedMachineSummaryList
     */
    PaginatedMachineSummaryList machineList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get machine
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return MachineDetail
     */
    MachineDetail machineRetrieve(
        String id
    );

    /**
     * List move meta ailments
     * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedMoveMetaAilmentSummaryList
     */
    PaginatedMoveMetaAilmentSummaryList moveAilmentList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get move meta ailment
     * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return MoveMetaAilmentDetail
     */
    MoveMetaAilmentDetail moveAilmentRetrieve(
        String id
    );

    /**
     * List move battle styles
     * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedMoveBattleStyleSummaryList
     */
    PaginatedMoveBattleStyleSummaryList moveBattleStyleList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get move battle style
     * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return MoveBattleStyleDetail
     */
    MoveBattleStyleDetail moveBattleStyleRetrieve(
        String id
    );

    /**
     * List move meta categories
     * Very general categories that loosely group move effects.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedMoveMetaCategorySummaryList
     */
    PaginatedMoveMetaCategorySummaryList moveCategoryList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get move meta category
     * Very general categories that loosely group move effects.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return MoveMetaCategoryDetail
     */
    MoveMetaCategoryDetail moveCategoryRetrieve(
        String id
    );

    /**
     * List move damage classes
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedMoveDamageClassSummaryList
     */
    PaginatedMoveDamageClassSummaryList moveDamageClassList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get move damage class
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return MoveDamageClassDetail
     */
    MoveDamageClassDetail moveDamageClassRetrieve(
        String id
    );

    /**
     * List move learn methods
     * Methods by which Pokémon can learn moves.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedMoveLearnMethodSummaryList
     */
    PaginatedMoveLearnMethodSummaryList moveLearnMethodList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get move learn method
     * Methods by which Pokémon can learn moves.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return MoveLearnMethodDetail
     */
    MoveLearnMethodDetail moveLearnMethodRetrieve(
        String id
    );

    /**
     * List moves
     * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedMoveSummaryList
     */
    PaginatedMoveSummaryList moveList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get move
     * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return MoveDetail
     */
    MoveDetail moveRetrieve(
        String id
    );

    /**
     * List move targets
     * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedMoveTargetSummaryList
     */
    PaginatedMoveTargetSummaryList moveTargetList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get move target
     * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return MoveTargetDetail
     */
    MoveTargetDetail moveTargetRetrieve(
        String id
    );

    /**
     * List natures
     * Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedNatureSummaryList
     */
    PaginatedNatureSummaryList natureList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get nature
     * Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return NatureDetail
     */
    NatureDetail natureRetrieve(
        String id
    );

    /**
     * List pal park areas
     * Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedPalParkAreaSummaryList
     */
    PaginatedPalParkAreaSummaryList palParkAreaList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get pal park area
     * Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return PalParkAreaDetail
     */
    PalParkAreaDetail palParkAreaRetrieve(
        String id
    );

    /**
     * List pokeathlon stats
     * Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedPokeathlonStatSummaryList
     */
    PaginatedPokeathlonStatSummaryList pokeathlonStatList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get pokeathlon stat
     * Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return PokeathlonStatDetail
     */
    PokeathlonStatDetail pokeathlonStatRetrieve(
        String id
    );

    /**
     * List pokedex
     * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedPokedexSummaryList
     */
    PaginatedPokedexSummaryList pokedexList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get pokedex
     * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return PokedexDetail
     */
    PokedexDetail pokedexRetrieve(
        String id
    );

    /**
     * List pokemon colors
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedPokemonColorSummaryList
     */
    PaginatedPokemonColorSummaryList pokemonColorList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get pokemon color
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return PokemonColorDetail
     */
    PokemonColorDetail pokemonColorRetrieve(
        String id
    );

    /**
     * List pokemon forms
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedPokemonFormSummaryList
     */
    PaginatedPokemonFormSummaryList pokemonFormList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get pokemon form
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return PokemonFormDetail
     */
    PokemonFormDetail pokemonFormRetrieve(
        String id
    );

    /**
     * List pokemom habitas
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedPokemonHabitatSummaryList
     */
    PaginatedPokemonHabitatSummaryList pokemonHabitatList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get pokemom habita
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return PokemonHabitatDetail
     */
    PokemonHabitatDetail pokemonHabitatRetrieve(
        String id
    );

    /**
     * List pokemon
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedPokemonSummaryList
     */
    PaginatedPokemonSummaryList pokemonList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get pokemon
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return PokemonDetail
     */
    PokemonDetail pokemonRetrieve(
        String id
    );

    /**
     * List pokemon shapes
     * Shapes used for sorting Pokémon in a Pokédex.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedPokemonShapeSummaryList
     */
    PaginatedPokemonShapeSummaryList pokemonShapeList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get pokemon shape
     * Shapes used for sorting Pokémon in a Pokédex.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return PokemonShapeDetail
     */
    PokemonShapeDetail pokemonShapeRetrieve(
        String id
    );

    /**
     * List pokemon species
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedPokemonSpeciesSummaryList
     */
    PaginatedPokemonSpeciesSummaryList pokemonSpeciesList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get pokemon species
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return PokemonSpeciesDetail
     */
    PokemonSpeciesDetail pokemonSpeciesRetrieve(
        String id
    );

    /**
     * List regions
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedRegionSummaryList
     */
    PaginatedRegionSummaryList regionList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get region
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return RegionDetail
     */
    RegionDetail regionRetrieve(
        String id
    );

    /**
     * List stats
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedStatSummaryList
     */
    PaginatedStatSummaryList statList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get stat
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return StatDetail
     */
    StatDetail statRetrieve(
        String id
    );

    /**
     * List super contest effects
     * Super contest effects refer to the effects of moves when used in super contests.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedSuperContestEffectSummaryList
     */
    PaginatedSuperContestEffectSummaryList superContestEffectList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get super contest effect
     * Super contest effects refer to the effects of moves when used in super contests.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return SuperContestEffectDetail
     */
    SuperContestEffectDetail superContestEffectRetrieve(
        String id
    );

    /**
     * List types
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedTypeSummaryList
     */
    PaginatedTypeSummaryList typeList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get types
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return TypeDetail
     */
    TypeDetail typeRetrieve(
        String id
    );

    /**
     * List version groups
     * Version groups categorize highly similar versions of the games.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedVersionGroupSummaryList
     */
    PaginatedVersionGroupSummaryList versionGroupList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get version group
     * Version groups categorize highly similar versions of the games.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return VersionGroupDetail
     */
    VersionGroupDetail versionGroupRetrieve(
        String id
    );

    /**
     * List versions
     * Versions of the games, e.g., Red, Blue or Yellow.
     *
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional)
     * @return PaginatedVersionSummaryList
     */
    PaginatedVersionSummaryList versionList(
        Integer limit,
        Integer offset,
        String q
    );

    /**
     * Get version
     * Versions of the games, e.g., Red, Blue or Yellow.
     *
     * @param id This parameter can be a string or an integer. (required)
     * @return VersionDetail
     */
    VersionDetail versionRetrieve(
        String id
    );
}
