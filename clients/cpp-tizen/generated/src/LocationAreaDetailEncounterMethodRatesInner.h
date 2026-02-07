/*
 * LocationAreaDetail_encounter_method_rates_inner.h
 *
 * 
 */

#ifndef _LocationAreaDetail_encounter_method_rates_inner_H_
#define _LocationAreaDetail_encounter_method_rates_inner_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "LocationAreaDetail_encounter_method_rates_inner_version_details_inner.h"
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

class LocationAreaDetail_encounter_method_rates_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	LocationAreaDetail_encounter_method_rates_inner();
	LocationAreaDetail_encounter_method_rates_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LocationAreaDetail_encounter_method_rates_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getEncounterMethod();

	/*! \brief Set 
	 */
	void setEncounterMethod(AbilityDetail_pokemon_inner_pokemon  encounter_method);
	/*! \brief Get 
	 */
	std::list<LocationAreaDetail_encounter_method_rates_inner_version_details_inner> getVersionDetails();

	/*! \brief Set 
	 */
	void setVersionDetails(std::list <LocationAreaDetail_encounter_method_rates_inner_version_details_inner> version_details);

private:
	AbilityDetail_pokemon_inner_pokemon encounter_method;
	std::list <LocationAreaDetail_encounter_method_rates_inner_version_details_inner>version_details;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LocationAreaDetail_encounter_method_rates_inner_H_ */
