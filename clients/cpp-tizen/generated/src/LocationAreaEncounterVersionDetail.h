/*
 * LocationAreaEncounterVersionDetail.h
 *
 * 
 */

#ifndef _LocationAreaEncounterVersionDetail_H_
#define _LocationAreaEncounterVersionDetail_H_


#include <string>
#include "VersionSummary.h"
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

class LocationAreaEncounterVersionDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	LocationAreaEncounterVersionDetail();
	LocationAreaEncounterVersionDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LocationAreaEncounterVersionDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The chance of an encounter to occur.
	 */
	int getRate();

	/*! \brief Set The chance of an encounter to occur.
	 */
	void setRate(int  rate);
	/*! \brief Get The version of the game in which the encounter can occur with the given chance.
	 */
	VersionSummary getVersion();

	/*! \brief Set The version of the game in which the encounter can occur with the given chance.
	 */
	void setVersion(VersionSummary  version);

private:
	int rate;
	VersionSummary version;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LocationAreaEncounterVersionDetail_H_ */
