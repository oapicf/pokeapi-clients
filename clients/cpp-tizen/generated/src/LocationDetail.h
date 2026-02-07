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

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	RegionSummary getRegion();

	/*! \brief Set 
	 */
	void setRegion(RegionSummary  region);
	/*! \brief Get 
	 */
	std::list<LocationName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <LocationName> names);
	/*! \brief Get 
	 */
	std::list<LocationGameIndex> getGameIndices();

	/*! \brief Set 
	 */
	void setGameIndices(std::list <LocationGameIndex> game_indices);
	/*! \brief Get 
	 */
	std::list<LocationAreaSummary> getAreas();

	/*! \brief Set 
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
