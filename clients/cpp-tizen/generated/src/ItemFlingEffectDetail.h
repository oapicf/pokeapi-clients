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

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::list<ItemFlingEffectEffectText> getEffectEntries();

	/*! \brief Set 
	 */
	void setEffectEntries(std::list <ItemFlingEffectEffectText> effect_entries);
	/*! \brief Get 
	 */
	std::list<ItemSummary> getItems();

	/*! \brief Set 
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
