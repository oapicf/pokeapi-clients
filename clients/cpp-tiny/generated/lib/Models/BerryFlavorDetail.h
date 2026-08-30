
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
#include "BerryFlavorDetail_berries_inner.h"
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
	std::list<BerryFlavorDetail_berries_inner> getBerries();

	/*! \brief Set 
	 */
	void setBerries(std::list<BerryFlavorDetail_berries_inner> berries);
	/*! \brief Get 
	 */
	ContestTypeSummary getContestType();

	/*! \brief Set 
	 */
	void setContestType(ContestTypeSummary contest_type);
	/*! \brief Get 
	 */
	std::list<BerryFlavorName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list<BerryFlavorName> names);


    private:
    int id{};
    std::string name{};
    std::list<BerryFlavorDetail_berries_inner> berries;
    ContestTypeSummary contest_type;
    std::list<BerryFlavorName> names;
};
}

#endif /* TINY_CPP_CLIENT_BerryFlavorDetail_H_ */
