/*
 * ItemFlingEffectDetail.h
 *
 * 
 */

#ifndef _ItemFlingEffectDetail_H_
#define _ItemFlingEffectDetail_H_


#include <string>
#include "ItemFlingEffectEffectText.h"
#include "ItemSummary.h"
#include <list>
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

class ItemFlingEffectDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemFlingEffectDetail();
	ItemFlingEffectDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemFlingEffectDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int  id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string  name);
	/*! \brief Get The result of this fling effect listed in different languages.
	 */
	std::list<ItemFlingEffectEffectText> getEffectEntries();

	/*! \brief Set The result of this fling effect listed in different languages.
	 */
	void setEffectEntries(std::list <ItemFlingEffectEffectText> effect_entries);
	/*! \brief Get A list of items that have this fling effect.
	 */
	std::list<ItemSummary> getItems();

	/*! \brief Set A list of items that have this fling effect.
	 */
	void setItems(std::list <ItemSummary> items);

private:
	int id;
	std::string name;
	std::list <ItemFlingEffectEffectText>effect_entries;
	std::list <ItemSummary>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemFlingEffectDetail_H_ */
