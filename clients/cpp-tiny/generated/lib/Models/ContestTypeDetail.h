
/*
 * ContestTypeDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ContestTypeDetail_H_
#define TINY_CPP_CLIENT_ContestTypeDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BerryFlavorSummary.h"
#include "ContestTypeName.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ContestTypeDetail{
public:

    /*! \brief Constructor.
	 */
    ContestTypeDetail();
    ContestTypeDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ContestTypeDetail();


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
	BerryFlavorSummary getBerryFlavor();

	/*! \brief Set 
	 */
	void setBerryFlavor(BerryFlavorSummary berry_flavor);
	/*! \brief Get 
	 */
	std::list<ContestTypeName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list<ContestTypeName> names);


    private:
    int id{};
    std::string name{};
    BerryFlavorSummary berry_flavor;
    std::list<ContestTypeName> names;
};
}

#endif /* TINY_CPP_CLIENT_ContestTypeDetail_H_ */
