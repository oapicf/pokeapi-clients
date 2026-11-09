
/*
 * ItemPrice.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ItemPrice_H_
#define TINY_CPP_CLIENT_ItemPrice_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CurrencySummary.h"
#include "VersionGroupSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ItemPrice{
public:

    /*! \brief Constructor.
	 */
    ItemPrice();
    ItemPrice(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemPrice();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The purchase price in this currency and version group, or null if unavailable.
	 */
	int getPurchasePrice();

	/*! \brief Set The purchase price in this currency and version group, or null if unavailable.
	 */
	void setPurchasePrice(int purchase_price);
	/*! \brief Get The sell price in this currency and version group, or null if unavailable.
	 */
	int getSellPrice();

	/*! \brief Set The sell price in this currency and version group, or null if unavailable.
	 */
	void setSellPrice(int sell_price);
	/*! \brief Get The currency used for this price.
	 */
	CurrencySummary getCurrency();

	/*! \brief Set The currency used for this price.
	 */
	void setCurrency(CurrencySummary currency);
	/*! \brief Get The version group to which this price applies.
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set The version group to which this price applies.
	 */
	void setVersionGroup(VersionGroupSummary version_group);


    private:
    int purchase_price{};
    int sell_price{};
    CurrencySummary currency;
    VersionGroupSummary version_group;
};
}

#endif /* TINY_CPP_CLIENT_ItemPrice_H_ */
