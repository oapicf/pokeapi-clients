
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
	std::list<ItemFlingEffectEffectText> getEffectEntries();

	/*! \brief Set 
	 */
	void setEffectEntries(std::list<ItemFlingEffectEffectText> effect_entries);
	/*! \brief Get 
	 */
	std::list<ItemSummary> getItems();

	/*! \brief Set 
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
