
/*
 * BerryFirmnessDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BerryFirmnessDetail_H_
#define TINY_CPP_CLIENT_BerryFirmnessDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BerryFirmnessName.h"
#include "BerrySummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BerryFirmnessDetail{
public:

    /*! \brief Constructor.
	 */
    BerryFirmnessDetail();
    BerryFirmnessDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BerryFirmnessDetail();


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
	/*! \brief Get A list of the berries with this firmness.
	 */
	std::list<BerrySummary> getBerries();

	/*! \brief Set A list of the berries with this firmness.
	 */
	void setBerries(std::list<BerrySummary> berries);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<BerryFirmnessName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list<BerryFirmnessName> names);


    private:
    int id{};
    std::string name{};
    std::list<BerrySummary> berries;
    std::list<BerryFirmnessName> names;
};
}

#endif /* TINY_CPP_CLIENT_BerryFirmnessDetail_H_ */
