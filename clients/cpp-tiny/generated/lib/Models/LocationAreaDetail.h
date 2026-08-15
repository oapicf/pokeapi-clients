
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
#include "LocationAreaDetail_encounter_method_rates_inner.h"
#include "LocationAreaDetail_pokemon_encounters_inner.h"
#include "LocationAreaName.h"
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
    int id{};
    std::string name{};
    int game_index{};
    std::list<LocationAreaDetail_encounter_method_rates_inner> encounter_method_rates;
    LocationSummary location;
    std::list<LocationAreaName> names;
    std::list<LocationAreaDetail_pokemon_encounters_inner> pokemon_encounters;
};
}

#endif /* TINY_CPP_CLIENT_LocationAreaDetail_H_ */
