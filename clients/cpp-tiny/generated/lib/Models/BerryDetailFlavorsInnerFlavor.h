
/*
 * BerryDetail_flavors_inner_flavor.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BerryDetail_flavors_inner_flavor_H_
#define TINY_CPP_CLIENT_BerryDetail_flavors_inner_flavor_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BerryDetail_flavors_inner_flavor{
public:

    /*! \brief Constructor.
	 */
    BerryDetail_flavors_inner_flavor();
    BerryDetail_flavors_inner_flavor(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BerryDetail_flavors_inner_flavor();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The name of the flavor
	 */
	std::string getName();

	/*! \brief Set The name of the flavor
	 */
	void setName(std::string name);
	/*! \brief Get The URL to get more information about the flavor
	 */
	std::string getUrl();

	/*! \brief Set The URL to get more information about the flavor
	 */
	void setUrl(std::string url);


    private:
    std::string name{};
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_BerryDetail_flavors_inner_flavor_H_ */
