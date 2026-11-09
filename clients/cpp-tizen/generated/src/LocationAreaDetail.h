/*
 * LocationAreaDetail.h
 *
 * 
 */

#ifndef _LocationAreaDetail_H_
#define _LocationAreaDetail_H_


#include <string>
#include "LocationAreaEncounterRate.h"
#include "LocationAreaName.h"
#include "LocationAreaPokemonEncounter.h"
#include "LocationSummary.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LocationAreaDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	LocationAreaDetail();
	LocationAreaDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LocationAreaDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int  id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string  name);
	/*! \brief Get The internal id of an API resource within game data.
	 */
	int getGameIndex();

	/*! \brief Set The internal id of an API resource within game data.
	 */
	void setGameIndex(int  game_index);
	/*! \brief Get A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.
	 */
	std::list<LocationAreaEncounterRate> getEncounterMethodRates();

	/*! \brief Set A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.
	 */
	void setEncounterMethodRates(std::list <LocationAreaEncounterRate> encounter_method_rates);
	/*! \brief Get The region this location area can be found in.
	 */
	LocationSummary getLocation();

	/*! \brief Set The region this location area can be found in.
	 */
	void setLocation(LocationSummary  location);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<LocationAreaName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list <LocationAreaName> names);
	/*! \brief Get A list of Pokémon that can be encountered in this area along with version specific details about the encounter.
	 */
	std::list<LocationAreaPokemonEncounter> getPokemonEncounters();

	/*! \brief Set A list of Pokémon that can be encountered in this area along with version specific details about the encounter.
	 */
	void setPokemonEncounters(std::list <LocationAreaPokemonEncounter> pokemon_encounters);

private:
	int id;
	std::string name;
	int game_index;
	std::list <LocationAreaEncounterRate>encounter_method_rates;
	LocationSummary location;
	std::list <LocationAreaName>names;
	std::list <LocationAreaPokemonEncounter>pokemon_encounters;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LocationAreaDetail_H_ */
