
/*
 * BerryFlavorDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BerryFlavorDetail_H_
#define TINY_CPP_CLIENT_BerryFlavorDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BerryFlavorBerryMap.h"
#include "BerryFlavorName.h"
#include "ContestTypeSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BerryFlavorDetail{
public:

    /*! \brief Constructor.
	 */
    BerryFlavorDetail();
    BerryFlavorDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BerryFlavorDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string name);
	/*! \brief Get A list of the berries with this flavor.
	 */
	std::list<BerryFlavorBerryMap> getBerries();

	/*! \brief Set A list of the berries with this flavor.
	 */
	void setBerries(std::list<BerryFlavorBerryMap> berries);
	/*! \brief Get The contest type that correlates with this berry flavor.
	 */
	ContestTypeSummary getContestType();

	/*! \brief Set The contest type that correlates with this berry flavor.
	 */
	void setContestType(ContestTypeSummary contest_type);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<BerryFlavorName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list<BerryFlavorName> names);


    private:
    int id{};
    std::string name{};
    std::list<BerryFlavorBerryMap> berries;
    ContestTypeSummary contest_type;
    std::list<BerryFlavorName> names;
};
}

#endif /* TINY_CPP_CLIENT_BerryFlavorDetail_H_ */
