/*
 * ItemAttributeDetail.h
 *
 * 
 */

#ifndef _ItemAttributeDetail_H_
#define _ItemAttributeDetail_H_


#include <string>
#include "ItemAttributeDescription.h"
#include "ItemAttributeName.h"
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

class ItemAttributeDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemAttributeDetail();
	ItemAttributeDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemAttributeDetail();

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
	/*! \brief Get The description of this item attribute listed in different languages.
	 */
	std::list<ItemAttributeDescription> getDescriptions();

	/*! \brief Set The description of this item attribute listed in different languages.
	 */
	void setDescriptions(std::list <ItemAttributeDescription> descriptions);
	/*! \brief Get A list of items that have this attribute.
	 */
	std::list<ItemSummary> getItems();

	/*! \brief Set A list of items that have this attribute.
	 */
	void setItems(std::list <ItemSummary> items);
	/*! \brief Get The name of this item attribute listed in different languages.
	 */
	std::list<ItemAttributeName> getNames();

	/*! \brief Set The name of this item attribute listed in different languages.
	 */
	void setNames(std::list <ItemAttributeName> names);

private:
	int id;
	std::string name;
	std::list <ItemAttributeDescription>descriptions;
	std::list <ItemSummary>items;
	std::list <ItemAttributeName>names;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemAttributeDetail_H_ */
