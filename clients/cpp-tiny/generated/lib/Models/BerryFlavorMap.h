
/*
 * BerryFlavorMap.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BerryFlavorMap_H_
#define TINY_CPP_CLIENT_BerryFlavorMap_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BerryFlavorSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BerryFlavorMap{
public:

    /*! \brief Constructor.
	 */
    BerryFlavorMap();
    BerryFlavorMap(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BerryFlavorMap();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get How powerful the referenced flavor is for this berry.
	 */
	int getPotency();

	/*! \brief Set How powerful the referenced flavor is for this berry.
	 */
	void setPotency(int potency);
	/*! \brief Get The referenced berry flavor.
	 */
	BerryFlavorSummary getFlavor();

	/*! \brief Set The referenced berry flavor.
	 */
	void setFlavor(BerryFlavorSummary flavor);


    private:
    int potency{};
    BerryFlavorSummary flavor;
};
}

#endif /* TINY_CPP_CLIENT_BerryFlavorMap_H_ */
