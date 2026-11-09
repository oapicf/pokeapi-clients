
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
	/*! \brief Get The berry flavor that correlates with this contest type.
	 */
	BerryFlavorSummary getBerryFlavor();

	/*! \brief Set The berry flavor that correlates with this contest type.
	 */
	void setBerryFlavor(BerryFlavorSummary berry_flavor);
	/*! \brief Get The name of this contest type listed in different languages.
	 */
	std::list<ContestTypeName> getNames();

	/*! \brief Set The name of this contest type listed in different languages.
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
