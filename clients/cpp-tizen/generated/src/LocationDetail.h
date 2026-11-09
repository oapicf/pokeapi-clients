/*
 * LocationDetail.h
 *
 * 
 */

#ifndef _LocationDetail_H_
#define _LocationDetail_H_


#include <string>
#include "LocationAreaSummary.h"
#include "LocationGameIndex.h"
#include "LocationName.h"
#include "RegionSummary.h"
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

class LocationDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	LocationDetail();
	LocationDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LocationDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int  id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string  name);
	/*! \brief Get The region this location can be found in.
	 */
	RegionSummary getRegion();

	/*! \brief Set The region this location can be found in.
	 */
	void setRegion(RegionSummary  region);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<LocationName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list <LocationName> names);
	/*! \brief Get A list of game indices relevent to this location by generation.
	 */
	std::list<LocationGameIndex> getGameIndices();

	/*! \brief Set A list of game indices relevent to this location by generation.
	 */
	void setGameIndices(std::list <LocationGameIndex> game_indices);
	/*! \brief Get Areas that can be found within this location.
	 */
	std::list<LocationAreaSummary> getAreas();

	/*! \brief Set Areas that can be found within this location.
	 */
	void setAreas(std::list <LocationAreaSummary> areas);

private:
	int id;
	std::string name;
	RegionSummary region;
	std::list <LocationName>names;
	std::list <LocationGameIndex>game_indices;
	std::list <LocationAreaSummary>areas;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LocationDetail_H_ */
