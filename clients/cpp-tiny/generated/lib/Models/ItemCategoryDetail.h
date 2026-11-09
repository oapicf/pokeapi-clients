
/*
 * ItemCategoryDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ItemCategoryDetail_H_
#define TINY_CPP_CLIENT_ItemCategoryDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ItemCategoryName.h"
#include "ItemPocketSummary.h"
#include "ItemSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ItemCategoryDetail{
public:

    /*! \brief Constructor.
	 */
    ItemCategoryDetail();
    ItemCategoryDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemCategoryDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string name);
	/*! \brief Get A list of items that are a part of this category.
	 */
	std::list<ItemSummary> getItems();

	/*! \brief Set A list of items that are a part of this category.
	 */
	void setItems(std::list<ItemSummary> items);
	/*! \brief Get The name of this item category listed in different languages.
	 */
	std::list<ItemCategoryName> getNames();

	/*! \brief Set The name of this item category listed in different languages.
	 */
	void setNames(std::list<ItemCategoryName> names);
	/*! \brief Get The pocket items in this category would be put in.
	 */
	ItemPocketSummary getPocket();

	/*! \brief Set The pocket items in this category would be put in.
	 */
	void setPocket(ItemPocketSummary pocket);


    private:
    int id{};
    std::string name{};
    std::list<ItemSummary> items;
    std::list<ItemCategoryName> names;
    ItemPocketSummary pocket;
};
}

#endif /* TINY_CPP_CLIENT_ItemCategoryDetail_H_ */
