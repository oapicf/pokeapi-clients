
/*
 * BerryFlavorBerryMap.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BerryFlavorBerryMap_H_
#define TINY_CPP_CLIENT_BerryFlavorBerryMap_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BerrySummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BerryFlavorBerryMap{
public:

    /*! \brief Constructor.
	 */
    BerryFlavorBerryMap();
    BerryFlavorBerryMap(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BerryFlavorBerryMap();


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
	/*! \brief Get The berry with the referenced flavor.
	 */
	BerrySummary getBerry();

	/*! \brief Set The berry with the referenced flavor.
	 */
	void setBerry(BerrySummary berry);


    private:
    int potency{};
    BerrySummary berry;
};
}

#endif /* TINY_CPP_CLIENT_BerryFlavorBerryMap_H_ */
