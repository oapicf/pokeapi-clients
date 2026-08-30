
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
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "ItemAttributeDescription.h"
#include "ItemAttributeName.h"
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
	std::list<ItemAttributeDescription> getDescriptions();

	/*! \brief Set 
	 */
	void setDescriptions(std::list<ItemAttributeDescription> descriptions);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list<AbilityDetail_pokemon_inner_pokemon> items);
	/*! \brief Get 
	 */
	std::list<ItemAttributeName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list<ItemAttributeName> names);


    private:
    int id{};
    std::string name{};
    std::list<ItemAttributeDescription> descriptions;
    std::list<AbilityDetail_pokemon_inner_pokemon> items;
    std::list<ItemAttributeName> names;
};
}

#endif /* TINY_CPP_CLIENT_ItemAttributeDetail_H_ */
