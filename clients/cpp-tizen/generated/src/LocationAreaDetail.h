/*
 * LocationAreaDetail.h
 *
 * 
 */

#ifndef _LocationAreaDetail_H_
#define _LocationAreaDetail_H_


#include <string>
#include "LocationAreaDetail_encounter_method_rates_inner.h"
#include "LocationAreaDetail_pokemon_encounters_inner.h"
#include "LocationAreaName.h"
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

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	int getGameIndex();

	/*! \brief Set 
	 */
	void setGameIndex(int  game_index);
	/*! \brief Get 
	 */
	std::list<LocationAreaDetail_encounter_method_rates_inner> getEncounterMethodRates();

	/*! \brief Set 
	 */
	void setEncounterMethodRates(std::list <LocationAreaDetail_encounter_method_rates_inner> encounter_method_rates);
	/*! \brief Get 
	 */
	LocationSummary getLocation();

	/*! \brief Set 
	 */
	void setLocation(LocationSummary  location);
	/*! \brief Get 
	 */
	std::list<LocationAreaName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <LocationAreaName> names);
	/*! \brief Get 
	 */
	std::list<LocationAreaDetail_pokemon_encounters_inner> getPokemonEncounters();

	/*! \brief Set 
	 */
	void setPokemonEncounters(std::list <LocationAreaDetail_pokemon_encounters_inner> pokemon_encounters);

private:
	int id;
	std::string name;
	int game_index;
	std::list <LocationAreaDetail_encounter_method_rates_inner>encounter_method_rates;
	LocationSummary location;
	std::list <LocationAreaName>names;
	std::list <LocationAreaDetail_pokemon_encounters_inner>pokemon_encounters;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LocationAreaDetail_H_ */
