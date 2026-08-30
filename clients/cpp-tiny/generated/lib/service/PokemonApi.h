#ifndef TINY_CPP_CLIENT_PokemonApi_H_
#define TINY_CPP_CLIENT_PokemonApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "AbilityDetail.h"
#include "CharacteristicDetail.h"
#include "EggGroupDetail.h"
#include "GenderDetail.h"
#include "GrowthRateDetail.h"
#include "MoveDamageClassDetail.h"
#include "NatureDetail.h"
#include "PaginatedAbilitySummaryList.h"
#include "PaginatedCharacteristicSummaryList.h"
#include "PaginatedEggGroupSummaryList.h"
#include "PaginatedGenderSummaryList.h"
#include "PaginatedGrowthRateSummaryList.h"
#include "PaginatedMoveDamageClassSummaryList.h"
#include "PaginatedNatureSummaryList.h"
#include "PaginatedPokeathlonStatSummaryList.h"
#include "PaginatedPokemonColorSummaryList.h"
#include "PaginatedPokemonFormSummaryList.h"
#include "PaginatedPokemonHabitatSummaryList.h"
#include "PaginatedPokemonShapeSummaryList.h"
#include "PaginatedPokemonSpeciesSummaryList.h"
#include "PaginatedPokemonSummaryList.h"
#include "PaginatedStatSummaryList.h"
#include "PaginatedTypeSummaryList.h"
#include "PokeathlonStatDetail.h"
#include "PokemonColorDetail.h"
#include "PokemonDetail.h"
#include "PokemonFormDetail.h"
#include "PokemonHabitatDetail.h"
#include "PokemonShapeDetail.h"
#include "PokemonSpeciesDetail.h"
#include "StatDetail.h"
#include "TypeDetail.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class PokemonApi : public Service {
public:
    PokemonApi() = default;

    virtual ~PokemonApi();

    /**
    * .
    *
    * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedAbilitySummaryList
        >
    abilityList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * .
    *
    * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                AbilityDetail
        >
    abilityRetrieve(
            
            std::string id
            
    );
    /**
    * List charecterictics.
    *
    * Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedCharacteristicSummaryList
        >
    characteristicList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get characteristic.
    *
    * Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                CharacteristicDetail
        >
    characteristicRetrieve(
            
            std::string id
            
    );
    /**
    * List egg groups.
    *
    * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedEggGroupSummaryList
        >
    eggGroupList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get egg group.
    *
    * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                EggGroupDetail
        >
    eggGroupRetrieve(
            
            std::string id
            
    );
    /**
    * List genders.
    *
    * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedGenderSummaryList
        >
    genderList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get gender.
    *
    * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                GenderDetail
        >
    genderRetrieve(
            
            std::string id
            
    );
    /**
    * List growth rates.
    *
    * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedGrowthRateSummaryList
        >
    growthRateList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get growth rate.
    *
    * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                GrowthRateDetail
        >
    growthRateRetrieve(
            
            std::string id
            
    );
    /**
    * List move damage classes.
    *
    * Damage classes moves can have, e.g. physical, special, or non-damaging.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedMoveDamageClassSummaryList
        >
    moveDamageClassList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get move damage class.
    *
    * Damage classes moves can have, e.g. physical, special, or non-damaging.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                MoveDamageClassDetail
        >
    moveDamageClassRetrieve(
            
            std::string id
            
    );
    /**
    * List natures.
    *
    * Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedNatureSummaryList
        >
    natureList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get nature.
    *
    * Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                NatureDetail
        >
    natureRetrieve(
            
            std::string id
            
    );
    /**
    * List pokeathlon stats.
    *
    * Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedPokeathlonStatSummaryList
        >
    pokeathlonStatList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get pokeathlon stat.
    *
    * Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                PokeathlonStatDetail
        >
    pokeathlonStatRetrieve(
            
            std::string id
            
    );
    /**
    * List pokemon colors.
    *
    * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedPokemonColorSummaryList
        >
    pokemonColorList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get pokemon color.
    *
    * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                PokemonColorDetail
        >
    pokemonColorRetrieve(
            
            std::string id
            
    );
    /**
    * List pokemon forms.
    *
    * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedPokemonFormSummaryList
        >
    pokemonFormList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get pokemon form.
    *
    * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                PokemonFormDetail
        >
    pokemonFormRetrieve(
            
            std::string id
            
    );
    /**
    * List pokemom habitas.
    *
    * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedPokemonHabitatSummaryList
        >
    pokemonHabitatList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get pokemom habita.
    *
    * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                PokemonHabitatDetail
        >
    pokemonHabitatRetrieve(
            
            std::string id
            
    );
    /**
    * List pokemon.
    *
    * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedPokemonSummaryList
        >
    pokemonList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get pokemon.
    *
    * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                PokemonDetail
        >
    pokemonRetrieve(
            
            std::string id
            
    );
    /**
    * List pokemon shapes.
    *
    * Shapes used for sorting Pokémon in a Pokédex.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedPokemonShapeSummaryList
        >
    pokemonShapeList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get pokemon shape.
    *
    * Shapes used for sorting Pokémon in a Pokédex.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                PokemonShapeDetail
        >
    pokemonShapeRetrieve(
            
            std::string id
            
    );
    /**
    * List pokemon species.
    *
    * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedPokemonSpeciesSummaryList
        >
    pokemonSpeciesList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get pokemon species.
    *
    * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                PokemonSpeciesDetail
        >
    pokemonSpeciesRetrieve(
            
            std::string id
            
    );
    /**
    * List stats.
    *
    * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedStatSummaryList
        >
    statList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get stat.
    *
    * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                StatDetail
        >
    statRetrieve(
            
            std::string id
            
    );
    /**
    * List types.
    *
    * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedTypeSummaryList
        >
    typeList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get types.
    *
    * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                TypeDetail
        >
    typeRetrieve(
            
            std::string id
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_PokemonApi_H_ */