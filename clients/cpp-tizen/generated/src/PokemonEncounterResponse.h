/*
 * PokemonEncounterResponse.h
 *
 * 
 */

#ifndef _PokemonEncounterResponse_H_
#define _PokemonEncounterResponse_H_


#include <string>
#include "LocationAreaSummary.h"
#include "PokemonEncounterVersionDetailResponse.h"
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

class PokemonEncounterResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonEncounterResponse();
	PokemonEncounterResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonEncounterResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The location area the referenced Pokémon can be encountered in.
	 */
	LocationAreaSummary getLocationArea();

	/*! \brief Set The location area the referenced Pokémon can be encountered in.
	 */
	void setLocationArea(LocationAreaSummary  location_area);
	/*! \brief Get A list of versions and encounters with the referenced Pokémon that might happen.
	 */
	std::list<PokemonEncounterVersionDetailResponse> getVersionDetails();

	/*! \brief Set A list of versions and encounters with the referenced Pokémon that might happen.
	 */
	void setVersionDetails(std::list <PokemonEncounterVersionDetailResponse> version_details);

private:
	LocationAreaSummary location_area;
	std::list <PokemonEncounterVersionDetailResponse>version_details;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonEncounterResponse_H_ */
