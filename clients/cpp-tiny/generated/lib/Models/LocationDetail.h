
/*
 * LocationDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LocationDetail_H_
#define TINY_CPP_CLIENT_LocationDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LocationAreaSummary.h"
#include "LocationGameIndex.h"
#include "LocationName.h"
#include "RegionSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LocationDetail{
public:

    /*! \brief Constructor.
	 */
    LocationDetail();
    LocationDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LocationDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	RegionSummary getRegion();

	/*! \brief Set 
	 */
	void setRegion(RegionSummary region);
	/*! \brief Get 
	 */
	std::list<LocationName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list<LocationName> names);
	/*! \brief Get 
	 */
	std::list<LocationGameIndex> getGameIndices();

	/*! \brief Set 
	 */
	void setGameIndices(std::list<LocationGameIndex> game_indices);
	/*! \brief Get 
	 */
	std::list<LocationAreaSummary> getAreas();

	/*! \brief Set 
	 */
	void setAreas(std::list<LocationAreaSummary> areas);


    private:
    int id{};
    std::string name{};
    RegionSummary region;
    std::list<LocationName> names;
    std::list<LocationGameIndex> game_indices;
    std::list<LocationAreaSummary> areas;
};
}

#endif /* TINY_CPP_CLIENT_LocationDetail_H_ */
