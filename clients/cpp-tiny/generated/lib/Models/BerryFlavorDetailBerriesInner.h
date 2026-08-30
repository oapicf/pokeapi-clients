
/*
 * BerryFlavorDetail_berries_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BerryFlavorDetail_berries_inner_H_
#define TINY_CPP_CLIENT_BerryFlavorDetail_berries_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BerryFlavorDetail_berries_inner_berry.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BerryFlavorDetail_berries_inner{
public:

    /*! \brief Constructor.
	 */
    BerryFlavorDetail_berries_inner();
    BerryFlavorDetail_berries_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BerryFlavorDetail_berries_inner();


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
	void setPotency(int potency);
	/*! \brief Get 
	 */
	BerryFlavorDetail_berries_inner_berry getBerry();

	/*! \brief Set 
	 */
	void setBerry(BerryFlavorDetail_berries_inner_berry berry);


    private:
    int potency{};
    BerryFlavorDetail_berries_inner_berry berry;
};
}

#endif /* TINY_CPP_CLIENT_BerryFlavorDetail_berries_inner_H_ */
