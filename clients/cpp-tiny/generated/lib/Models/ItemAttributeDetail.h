
/*
 * ItemAttributeDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ItemAttributeDetail_H_
#define TINY_CPP_CLIENT_ItemAttributeDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ItemAttributeDescription.h"
#include "ItemAttributeName.h"
#include "ItemSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ItemAttributeDetail{
public:

    /*! \brief Constructor.
	 */
    ItemAttributeDetail();
    ItemAttributeDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemAttributeDetail();


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
	/*! \brief Get The description of this item attribute listed in different languages.
	 */
	std::list<ItemAttributeDescription> getDescriptions();

	/*! \brief Set The description of this item attribute listed in different languages.
	 */
	void setDescriptions(std::list<ItemAttributeDescription> descriptions);
	/*! \brief Get A list of items that have this attribute.
	 */
	std::list<ItemSummary> getItems();

	/*! \brief Set A list of items that have this attribute.
	 */
	void setItems(std::list<ItemSummary> items);
	/*! \brief Get The name of this item attribute listed in different languages.
	 */
	std::list<ItemAttributeName> getNames();

	/*! \brief Set The name of this item attribute listed in different languages.
	 */
	void setNames(std::list<ItemAttributeName> names);


    private:
    int id{};
    std::string name{};
    std::list<ItemAttributeDescription> descriptions;
    std::list<ItemSummary> items;
    std::list<ItemAttributeName> names;
};
}

#endif /* TINY_CPP_CLIENT_ItemAttributeDetail_H_ */
