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
	/*! \brief Get A list of items that are a part of this category.
	 */
	std::list<ItemSummary> getItems();

	/*! \brief Set A list of items that are a part of this category.
	 */
	void setItems(std::list <ItemSummary> items);
	/*! \brief Get The name of this item category listed in different languages.
	 */
	std::list<ItemCategoryName> getNames();

	/*! \brief Set The name of this item category listed in different languages.
	 */
	void setNames(std::list <ItemCategoryName> names);
	/*! \brief Get The pocket items in this category would be put in.
	 */
	ItemPocketSummary getPocket();

	/*! \brief Set The pocket items in this category would be put in.
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
