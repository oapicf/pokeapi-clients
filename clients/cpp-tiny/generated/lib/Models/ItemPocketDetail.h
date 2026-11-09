
/*
 * ItemPocketDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ItemPocketDetail_H_
#define TINY_CPP_CLIENT_ItemPocketDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ItemCategorySummary.h"
#include "ItemPocketName.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ItemPocketDetail{
public:

    /*! \brief Constructor.
	 */
    ItemPocketDetail();
    ItemPocketDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemPocketDetail();


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
	/*! \brief Get A list of item categories that are relevant to this item pocket.
	 */
	std::list<ItemCategorySummary> getCategories();

	/*! \brief Set A list of item categories that are relevant to this item pocket.
	 */
	void setCategories(std::list<ItemCategorySummary> categories);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<ItemPocketName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list<ItemPocketName> names);


    private:
    int id{};
    std::string name{};
    std::list<ItemCategorySummary> categories;
    std::list<ItemPocketName> names;
};
}

#endif /* TINY_CPP_CLIENT_ItemPocketDetail_H_ */
