/*
 * LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details.h
 *
 * 
 */

#ifndef _LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details_H_
#define _LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
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

class LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details : public Object {
public:
	/*! \brief Constructor.
	 */
	LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details();
	LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	int min_level;
	int max_level;
	AbilityDetail_pokemon_inner_pokemon condition_values;
	int chance;
	AbilityDetail_pokemon_inner_pokemon method;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details_H_ */
