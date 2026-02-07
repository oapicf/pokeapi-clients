/*
 * ItemCategoryDetail.h
 *
 * 
 */

#ifndef _ItemCategoryDetail_H_
#define _ItemCategoryDetail_H_


#include <string>
#include "ItemCategoryName.h"
#include "ItemPocketSummary.h"
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

class ItemCategoryDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemCategoryDetail();
	ItemCategoryDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemCategoryDetail();

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
	std::list<ItemSummary> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <ItemSummary> items);
	/*! \brief Get 
	 */
	std::list<ItemCategoryName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <ItemCategoryName> names);
	/*! \brief Get 
	 */
	ItemPocketSummary getPocket();

	/*! \brief Set 
	 */
	void setPocket(ItemPocketSummary  pocket);

private:
	int id;
	std::string name;
	std::list <ItemSummary>items;
	std::list <ItemCategoryName>names;
	ItemPocketSummary pocket;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemCategoryDetail_H_ */
