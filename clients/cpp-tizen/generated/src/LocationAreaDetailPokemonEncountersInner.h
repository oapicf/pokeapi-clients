/*
 * LocationAreaDetail_pokemon_encounters_inner.h
 *
 * 
 */

#ifndef _LocationAreaDetail_pokemon_encounters_inner_H_
#define _LocationAreaDetail_pokemon_encounters_inner_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "LocationAreaDetail_pokemon_encounters_inner_version_details_inner.h"
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

class LocationAreaDetail_pokemon_encounters_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	LocationAreaDetail_pokemon_encounters_inner();
	LocationAreaDetail_pokemon_encounters_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LocationAreaDetail_pokemon_encounters_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getPokemon();

	/*! \brief Set 
	 */
	void setPokemon(AbilityDetail_pokemon_inner_pokemon  pokemon);
	/*! \brief Get 
	 */
	std::list<LocationAreaDetail_pokemon_encounters_inner_version_details_inner> getVersionDetails();

	/*! \brief Set 
	 */
	void setVersionDetails(std::list <LocationAreaDetail_pokemon_encounters_inner_version_details_inner> version_details);

private:
	AbilityDetail_pokemon_inner_pokemon pokemon;
	std::list <LocationAreaDetail_pokemon_encounters_inner_version_details_inner>version_details;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LocationAreaDetail_pokemon_encounters_inner_H_ */
