
/*
 * LocationAreaDetail_pokemon_encounters_inner_version_details_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LocationAreaDetail_pokemon_encounters_inner_version_details_inner_H_
#define TINY_CPP_CLIENT_LocationAreaDetail_pokemon_encounters_inner_version_details_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LocationAreaDetail_pokemon_encounters_inner_version_details_inner{
public:

    /*! \brief Constructor.
	 */
    LocationAreaDetail_pokemon_encounters_inner_version_details_inner();
    LocationAreaDetail_pokemon_encounters_inner_version_details_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LocationAreaDetail_pokemon_encounters_inner_version_details_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getVersion();

	/*! \brief Set 
	 */
	void setVersion(AbilityDetail_pokemon_inner_pokemon  version);
	/*! \brief Get 
	 */
	int getMaxChance();

	/*! \brief Set 
	 */
	void setMaxChance(int  max_chance);
	/*! \brief Get 
	 */
	LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details getEncounterDetails();

	/*! \brief Set 
	 */
	void setEncounterDetails(LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details  encounter_details);


    private:
    AbilityDetail_pokemon_inner_pokemon version;
    int max_chance{};
    LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details encounter_details;
};
}

#endif /* TINY_CPP_CLIENT_LocationAreaDetail_pokemon_encounters_inner_version_details_inner_H_ */
