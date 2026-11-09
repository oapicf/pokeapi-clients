/*
 * ItemPrice.h
 *
 * 
 */

#ifndef _ItemPrice_H_
#define _ItemPrice_H_


#include <string>
#include "CurrencySummary.h"
#include "VersionGroupSummary.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ItemPrice : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemPrice();
	ItemPrice(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemPrice();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The purchase price in this currency and version group, or null if unavailable.
	 */
	int getPurchasePrice();

	/*! \brief Set The purchase price in this currency and version group, or null if unavailable.
	 */
	void setPurchasePrice(int  purchase_price);
	/*! \brief Get The sell price in this currency and version group, or null if unavailable.
	 */
	int getSellPrice();

	/*! \brief Set The sell price in this currency and version group, or null if unavailable.
	 */
	void setSellPrice(int  sell_price);
	/*! \brief Get The currency used for this price.
	 */
	CurrencySummary getCurrency();

	/*! \brief Set The currency used for this price.
	 */
	void setCurrency(CurrencySummary  currency);
	/*! \brief Get The version group to which this price applies.
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set The version group to which this price applies.
	 */
	void setVersionGroup(VersionGroupSummary  version_group);

private:
	int purchase_price;
	int sell_price;
	CurrencySummary currency;
	VersionGroupSummary version_group;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemPrice_H_ */
