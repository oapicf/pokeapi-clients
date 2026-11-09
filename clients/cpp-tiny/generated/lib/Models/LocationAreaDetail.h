
/*
 * LocationAreaDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LocationAreaDetail_H_
#define TINY_CPP_CLIENT_LocationAreaDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LocationAreaEncounterRate.h"
#include "LocationAreaName.h"
#include "LocationAreaPokemonEncounter.h"
#include "LocationSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LocationAreaDetail{
public:

    /*! \brief Constructor.
	 */
    LocationAreaDetail();
    LocationAreaDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LocationAreaDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string name);
	/*! \brief Get The internal id of an API resource within game data.
	 */
	int getGameIndex();

	/*! \brief Set The internal id of an API resource within game data.
	 */
	void setGameIndex(int game_index);
	/*! \brief Get A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.
	 */
	std::list<LocationAreaEncounterRate> getEncounterMethodRates();

	/*! \brief Set A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.
	 */
	void setEncounterMethodRates(std::list<LocationAreaEncounterRate> encounter_method_rates);
	/*! \brief Get The region this location area can be found in.
	 */
	LocationSummary getLocation();

	/*! \brief Set The region this location area can be found in.
	 */
	void setLocation(LocationSummary location);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<LocationAreaName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list<LocationAreaName> names);
	/*! \brief Get A list of Pokémon that can be encountered in this area along with version specific details about the encounter.
	 */
	std::list<LocationAreaPokemonEncounter> getPokemonEncounters();

	/*! \brief Set A list of Pokémon that can be encountered in this area along with version specific details about the encounter.
	 */
	void setPokemonEncounters(std::list<LocationAreaPokemonEncounter> pokemon_encounters);


    private:
    int id{};
    std::string name{};
    int game_index{};
    std::list<LocationAreaEncounterRate> encounter_method_rates;
    LocationSummary location;
    std::list<LocationAreaName> names;
    std::list<LocationAreaPokemonEncounter> pokemon_encounters;
};
}

#endif /* TINY_CPP_CLIENT_LocationAreaDetail_H_ */
