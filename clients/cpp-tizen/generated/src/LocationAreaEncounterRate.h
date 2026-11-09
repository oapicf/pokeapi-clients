/*
 * LocationAreaEncounterRate.h
 *
 * 
 */

#ifndef _LocationAreaEncounterRate_H_
#define _LocationAreaEncounterRate_H_


#include <string>
#include "EncounterMethodSummary.h"
#include "LocationAreaEncounterVersionDetail.h"
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

class LocationAreaEncounterRate : public Object {
public:
	/*! \brief Constructor.
	 */
	LocationAreaEncounterRate();
	LocationAreaEncounterRate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LocationAreaEncounterRate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The method in which Pokémon may be encountered in an area..
	 */
	EncounterMethodSummary getEncounterMethod();

	/*! \brief Set The method in which Pokémon may be encountered in an area..
	 */
	void setEncounterMethod(EncounterMethodSummary  encounter_method);
	/*! \brief Get The chance of the encounter to occur on a version of the game.
	 */
	std::list<LocationAreaEncounterVersionDetail> getVersionDetails();

	/*! \brief Set The chance of the encounter to occur on a version of the game.
	 */
	void setVersionDetails(std::list <LocationAreaEncounterVersionDetail> version_details);

private:
	EncounterMethodSummary encounter_method;
	std::list <LocationAreaEncounterVersionDetail>version_details;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LocationAreaEncounterRate_H_ */
