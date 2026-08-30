
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

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	std::list<ItemSummary> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list<ItemSummary> items);
	/*! \brief Get 
	 */
	std::list<ItemCategoryName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list<ItemCategoryName> names);
	/*! \brief Get 
	 */
	ItemPocketSummary getPocket();

	/*! \brief Set 
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
