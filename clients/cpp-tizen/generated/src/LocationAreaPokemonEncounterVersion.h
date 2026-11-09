/*
 * LocationAreaPokemonEncounterVersion.h
 *
 * 
 */

#ifndef _LocationAreaPokemonEncounterVersion_H_
#define _LocationAreaPokemonEncounterVersion_H_


#include <string>
#include "LocationAreaEncounterDetail.h"
#include "VersionSummary.h"
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

class LocationAreaPokemonEncounterVersion : public Object {
public:
	/*! \brief Constructor.
	 */
	LocationAreaPokemonEncounterVersion();
	LocationAreaPokemonEncounterVersion(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LocationAreaPokemonEncounterVersion();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The game version this encounter happens in.
	 */
	VersionSummary getVersion();

	/*! \brief Set The game version this encounter happens in.
	 */
	void setVersion(VersionSummary  version);
	/*! \brief Get The total percentage of all encounter potential.
	 */
	int getMaxChance();

	/*! \brief Set The total percentage of all encounter potential.
	 */
	void setMaxChance(int  max_chance);
	/*! \brief Get A list of encounters and their specifics.
	 */
	std::list<LocationAreaEncounterDetail> getEncounterDetails();

	/*! \brief Set A list of encounters and their specifics.
	 */
	void setEncounterDetails(std::list <LocationAreaEncounterDetail> encounter_details);

private:
	VersionSummary version;
	int max_chance;
	std::list <LocationAreaEncounterDetail>encounter_details;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LocationAreaPokemonEncounterVersion_H_ */
