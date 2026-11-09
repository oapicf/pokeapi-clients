/*
 * ItemPocketDetail.h
 *
 * 
 */

#ifndef _ItemPocketDetail_H_
#define _ItemPocketDetail_H_


#include <string>
#include "ItemCategorySummary.h"
#include "ItemPocketName.h"
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

class ItemPocketDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemPocketDetail();
	ItemPocketDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemPocketDetail();

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
	/*! \brief Get A list of item categories that are relevant to this item pocket.
	 */
	std::list<ItemCategorySummary> getCategories();

	/*! \brief Set A list of item categories that are relevant to this item pocket.
	 */
	void setCategories(std::list <ItemCategorySummary> categories);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<ItemPocketName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list <ItemPocketName> names);

private:
	int id;
	std::string name;
	std::list <ItemCategorySummary>categories;
	std::list <ItemPocketName>names;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemPocketDetail_H_ */
