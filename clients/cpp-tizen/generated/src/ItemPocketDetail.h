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
	std::list<ItemCategorySummary> getCategories();

	/*! \brief Set 
	 */
	void setCategories(std::list <ItemCategorySummary> categories);
	/*! \brief Get 
	 */
	std::list<ItemPocketName> getNames();

	/*! \brief Set 
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
