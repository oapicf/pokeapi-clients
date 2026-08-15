
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
	std::list<BerrySummary> getBerries();

	/*! \brief Set 
	 */
	void setBerries(std::list <BerrySummary> berries);
	/*! \brief Get 
	 */
	std::list<BerryFirmnessName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <BerryFirmnessName> names);


    private:
    int id{};
    std::string name{};
    std::list<BerrySummary> berries;
    std::list<BerryFirmnessName> names;
};
}

#endif /* TINY_CPP_CLIENT_BerryFirmnessDetail_H_ */
