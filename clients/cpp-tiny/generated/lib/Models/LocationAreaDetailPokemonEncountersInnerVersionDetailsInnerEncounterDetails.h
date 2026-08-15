
/*
 * LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details_H_
#define TINY_CPP_CLIENT_LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details{
public:

    /*! \brief Constructor.
	 */
    LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details();
    LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getMinLevel();

	/*! \brief Set 
	 */
	void setMinLevel(int  min_level);
	/*! \brief Get 
	 */
	int getMaxLevel();

	/*! \brief Set 
	 */
	void setMaxLevel(int  max_level);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getConditionValues();

	/*! \brief Set 
	 */
	void setConditionValues(AbilityDetail_pokemon_inner_pokemon  condition_values);
	/*! \brief Get 
	 */
	int getChance();

	/*! \brief Set 
	 */
	void setChance(int  chance);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getMethod();

	/*! \brief Set 
	 */
	void setMethod(AbilityDetail_pokemon_inner_pokemon  method);


    private:
    int min_level{};
    int max_level{};
    AbilityDetail_pokemon_inner_pokemon condition_values;
    int chance{};
    AbilityDetail_pokemon_inner_pokemon method;
};
}

#endif /* TINY_CPP_CLIENT_LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details_H_ */
