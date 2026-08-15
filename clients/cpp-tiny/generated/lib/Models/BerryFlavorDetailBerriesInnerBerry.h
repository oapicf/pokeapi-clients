
/*
 * BerryFlavorDetail_berries_inner_berry.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BerryFlavorDetail_berries_inner_berry_H_
#define TINY_CPP_CLIENT_BerryFlavorDetail_berries_inner_berry_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BerryFlavorDetail_berries_inner_berry{
public:

    /*! \brief Constructor.
	 */
    BerryFlavorDetail_berries_inner_berry();
    BerryFlavorDetail_berries_inner_berry(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BerryFlavorDetail_berries_inner_berry();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The name of the berry
	 */
	std::string getName();

	/*! \brief Set The name of the berry
	 */
	void setName(std::string  name);
	/*! \brief Get The URL to get more information about the berry
	 */
	std::string getUrl();

	/*! \brief Set The URL to get more information about the berry
	 */
	void setUrl(std::string  url);


    private:
    std::string name{};
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_BerryFlavorDetail_berries_inner_berry_H_ */
