/*
 * LocationAreaDetail_encounter_method_rates_inner_version_details_inner.h
 *
 * 
 */

#ifndef _LocationAreaDetail_encounter_method_rates_inner_version_details_inner_H_
#define _LocationAreaDetail_encounter_method_rates_inner_version_details_inner_H_


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

class LocationAreaDetail_encounter_method_rates_inner_version_details_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	LocationAreaDetail_encounter_method_rates_inner_version_details_inner();
	LocationAreaDetail_encounter_method_rates_inner_version_details_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LocationAreaDetail_encounter_method_rates_inner_version_details_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getRate();

	/*! \brief Set 
	 */
	void setRate(int  rate);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getVersion();

	/*! \brief Set 
	 */
	void setVersion(AbilityDetail_pokemon_inner_pokemon  version);

private:
	int rate;
	AbilityDetail_pokemon_inner_pokemon version;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LocationAreaDetail_encounter_method_rates_inner_version_details_inner_H_ */
