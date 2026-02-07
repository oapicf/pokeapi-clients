#ifndef _PokemonManager_H_
#define _PokemonManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
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
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Pokemon Pokemon
 * \ingroup Operations
 *  @{
 */
class PokemonManager {
public:
	PokemonManager();
	virtual ~PokemonManager();

/*! \brief . *Synchronous*
 *
 * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool abilityListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedAbilitySummaryList, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool abilityListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedAbilitySummaryList, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool abilityRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(AbilityDetail, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool abilityRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(AbilityDetail, Error, void* )
	, void* userData);


/*! \brief List charecterictics. *Synchronous*
 *
 * Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool characteristicListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedCharacteristicSummaryList, Error, void* )
	, void* userData);

/*! \brief List charecterictics. *Asynchronous*
 *
 * Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool characteristicListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedCharacteristicSummaryList, Error, void* )
	, void* userData);


/*! \brief Get characteristic. *Synchronous*
 *
 * Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool characteristicRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(CharacteristicDetail, Error, void* )
	, void* userData);

/*! \brief Get characteristic. *Asynchronous*
 *
 * Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool characteristicRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(CharacteristicDetail, Error, void* )
	, void* userData);


/*! \brief List egg groups. *Synchronous*
 *
 * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool eggGroupListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEggGroupSummaryList, Error, void* )
	, void* userData);

/*! \brief List egg groups. *Asynchronous*
 *
 * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool eggGroupListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEggGroupSummaryList, Error, void* )
	, void* userData);


/*! \brief Get egg group. *Synchronous*
 *
 * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool eggGroupRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(EggGroupDetail, Error, void* )
	, void* userData);

/*! \brief Get egg group. *Asynchronous*
 *
 * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool eggGroupRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(EggGroupDetail, Error, void* )
	, void* userData);


/*! \brief List genders. *Synchronous*
 *
 * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool genderListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedGenderSummaryList, Error, void* )
	, void* userData);

/*! \brief List genders. *Asynchronous*
 *
 * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool genderListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedGenderSummaryList, Error, void* )
	, void* userData);


/*! \brief Get gender. *Synchronous*
 *
 * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool genderRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(GenderDetail, Error, void* )
	, void* userData);

/*! \brief Get gender. *Asynchronous*
 *
 * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool genderRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(GenderDetail, Error, void* )
	, void* userData);


/*! \brief List growth rates. *Synchronous*
 *
 * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool growthRateListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedGrowthRateSummaryList, Error, void* )
	, void* userData);

/*! \brief List growth rates. *Asynchronous*
 *
 * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool growthRateListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedGrowthRateSummaryList, Error, void* )
	, void* userData);


/*! \brief Get growth rate. *Synchronous*
 *
 * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool growthRateRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(GrowthRateDetail, Error, void* )
	, void* userData);

/*! \brief Get growth rate. *Asynchronous*
 *
 * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool growthRateRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(GrowthRateDetail, Error, void* )
	, void* userData);


/*! \brief List move damage classes. *Synchronous*
 *
 * Damage classes moves can have, e.g. physical, special, or non-damaging.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveDamageClassListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedMoveDamageClassSummaryList, Error, void* )
	, void* userData);

/*! \brief List move damage classes. *Asynchronous*
 *
 * Damage classes moves can have, e.g. physical, special, or non-damaging.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveDamageClassListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedMoveDamageClassSummaryList, Error, void* )
	, void* userData);


/*! \brief Get move damage class. *Synchronous*
 *
 * Damage classes moves can have, e.g. physical, special, or non-damaging.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveDamageClassRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(MoveDamageClassDetail, Error, void* )
	, void* userData);

/*! \brief Get move damage class. *Asynchronous*
 *
 * Damage classes moves can have, e.g. physical, special, or non-damaging.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveDamageClassRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(MoveDamageClassDetail, Error, void* )
	, void* userData);


/*! \brief List natures. *Synchronous*
 *
 * Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool natureListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedNatureSummaryList, Error, void* )
	, void* userData);

/*! \brief List natures. *Asynchronous*
 *
 * Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool natureListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedNatureSummaryList, Error, void* )
	, void* userData);


/*! \brief Get nature. *Synchronous*
 *
 * Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool natureRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(NatureDetail, Error, void* )
	, void* userData);

/*! \brief Get nature. *Asynchronous*
 *
 * Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool natureRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(NatureDetail, Error, void* )
	, void* userData);


/*! \brief List pokeathlon stats. *Synchronous*
 *
 * Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokeathlonStatListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokeathlonStatSummaryList, Error, void* )
	, void* userData);

/*! \brief List pokeathlon stats. *Asynchronous*
 *
 * Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokeathlonStatListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokeathlonStatSummaryList, Error, void* )
	, void* userData);


/*! \brief Get pokeathlon stat. *Synchronous*
 *
 * Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokeathlonStatRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(PokeathlonStatDetail, Error, void* )
	, void* userData);

/*! \brief Get pokeathlon stat. *Asynchronous*
 *
 * Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokeathlonStatRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(PokeathlonStatDetail, Error, void* )
	, void* userData);


/*! \brief List pokemon colors. *Synchronous*
 *
 * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonColorListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonColorSummaryList, Error, void* )
	, void* userData);

/*! \brief List pokemon colors. *Asynchronous*
 *
 * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonColorListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonColorSummaryList, Error, void* )
	, void* userData);


/*! \brief Get pokemon color. *Synchronous*
 *
 * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonColorRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonColorDetail, Error, void* )
	, void* userData);

/*! \brief Get pokemon color. *Asynchronous*
 *
 * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonColorRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonColorDetail, Error, void* )
	, void* userData);


/*! \brief List pokemon forms. *Synchronous*
 *
 * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonFormListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonFormSummaryList, Error, void* )
	, void* userData);

/*! \brief List pokemon forms. *Asynchronous*
 *
 * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonFormListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonFormSummaryList, Error, void* )
	, void* userData);


/*! \brief Get pokemon form. *Synchronous*
 *
 * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonFormRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonFormDetail, Error, void* )
	, void* userData);

/*! \brief Get pokemon form. *Asynchronous*
 *
 * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonFormRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonFormDetail, Error, void* )
	, void* userData);


/*! \brief List pokemom habitas. *Synchronous*
 *
 * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonHabitatListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonHabitatSummaryList, Error, void* )
	, void* userData);

/*! \brief List pokemom habitas. *Asynchronous*
 *
 * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonHabitatListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonHabitatSummaryList, Error, void* )
	, void* userData);


/*! \brief Get pokemom habita. *Synchronous*
 *
 * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonHabitatRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonHabitatDetail, Error, void* )
	, void* userData);

/*! \brief Get pokemom habita. *Asynchronous*
 *
 * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonHabitatRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonHabitatDetail, Error, void* )
	, void* userData);


/*! \brief List pokemon. *Synchronous*
 *
 * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonSummaryList, Error, void* )
	, void* userData);

/*! \brief List pokemon. *Asynchronous*
 *
 * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonSummaryList, Error, void* )
	, void* userData);


/*! \brief Get pokemon. *Synchronous*
 *
 * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonDetail, Error, void* )
	, void* userData);

/*! \brief Get pokemon. *Asynchronous*
 *
 * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonDetail, Error, void* )
	, void* userData);


/*! \brief List pokemon shapes. *Synchronous*
 *
 * Shapes used for sorting Pokémon in a Pokédex.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonShapeListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonShapeSummaryList, Error, void* )
	, void* userData);

/*! \brief List pokemon shapes. *Asynchronous*
 *
 * Shapes used for sorting Pokémon in a Pokédex.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonShapeListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonShapeSummaryList, Error, void* )
	, void* userData);


/*! \brief Get pokemon shape. *Synchronous*
 *
 * Shapes used for sorting Pokémon in a Pokédex.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonShapeRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonShapeDetail, Error, void* )
	, void* userData);

/*! \brief Get pokemon shape. *Asynchronous*
 *
 * Shapes used for sorting Pokémon in a Pokédex.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonShapeRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonShapeDetail, Error, void* )
	, void* userData);


/*! \brief List pokemon species. *Synchronous*
 *
 * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonSpeciesListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonSpeciesSummaryList, Error, void* )
	, void* userData);

/*! \brief List pokemon species. *Asynchronous*
 *
 * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonSpeciesListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonSpeciesSummaryList, Error, void* )
	, void* userData);


/*! \brief Get pokemon species. *Synchronous*
 *
 * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonSpeciesRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonSpeciesDetail, Error, void* )
	, void* userData);

/*! \brief Get pokemon species. *Asynchronous*
 *
 * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonSpeciesRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonSpeciesDetail, Error, void* )
	, void* userData);


/*! \brief List stats. *Synchronous*
 *
 * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool statListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedStatSummaryList, Error, void* )
	, void* userData);

/*! \brief List stats. *Asynchronous*
 *
 * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool statListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedStatSummaryList, Error, void* )
	, void* userData);


/*! \brief Get stat. *Synchronous*
 *
 * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool statRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(StatDetail, Error, void* )
	, void* userData);

/*! \brief Get stat. *Asynchronous*
 *
 * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool statRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(StatDetail, Error, void* )
	, void* userData);


/*! \brief List types. *Synchronous*
 *
 * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool typeListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedTypeSummaryList, Error, void* )
	, void* userData);

/*! \brief List types. *Asynchronous*
 *
 * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool typeListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedTypeSummaryList, Error, void* )
	, void* userData);


/*! \brief Get types. *Synchronous*
 *
 * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool typeRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(TypeDetail, Error, void* )
	, void* userData);

/*! \brief Get types. *Asynchronous*
 *
 * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool typeRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(TypeDetail, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://pokeapi.co";
	}
};
/** @}*/

}
}
#endif /* PokemonManager_H_ */
