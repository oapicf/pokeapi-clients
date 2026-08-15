
/*
 * BerryDetail_flavors_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BerryDetail_flavors_inner_H_
#define TINY_CPP_CLIENT_BerryDetail_flavors_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BerryDetail_flavors_inner_flavor.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BerryDetail_flavors_inner{
public:

    /*! \brief Constructor.
	 */
    BerryDetail_flavors_inner();
    BerryDetail_flavors_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BerryDetail_flavors_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getPotency();

	/*! \brief Set 
	 */
	void setPotency(int  potency);
	/*! \brief Get 
	 */
	BerryDetail_flavors_inner_flavor getFlavor();

	/*! \brief Set 
	 */
	void setFlavor(BerryDetail_flavors_inner_flavor  flavor);


    private:
    int potency{};
    BerryDetail_flavors_inner_flavor flavor;
};
}

#endif /* TINY_CPP_CLIENT_BerryDetail_flavors_inner_H_ */
