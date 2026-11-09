
/*
 * ItemFlingEffectDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ItemFlingEffectDetail_H_
#define TINY_CPP_CLIENT_ItemFlingEffectDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ItemFlingEffectEffectText.h"
#include "ItemSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ItemFlingEffectDetail{
public:

    /*! \brief Constructor.
	 */
    ItemFlingEffectDetail();
    ItemFlingEffectDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemFlingEffectDetail();


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
	/*! \brief Get The result of this fling effect listed in different languages.
	 */
	std::list<ItemFlingEffectEffectText> getEffectEntries();

	/*! \brief Set The result of this fling effect listed in different languages.
	 */
	void setEffectEntries(std::list<ItemFlingEffectEffectText> effect_entries);
	/*! \brief Get A list of items that have this fling effect.
	 */
	std::list<ItemSummary> getItems();

	/*! \brief Set A list of items that have this fling effect.
	 */
	void setItems(std::list<ItemSummary> items);


    private:
    int id{};
    std::string name{};
    std::list<ItemFlingEffectEffectText> effect_entries;
    std::list<ItemSummary> items;
};
}

#endif /* TINY_CPP_CLIENT_ItemFlingEffectDetail_H_ */
