/*
 * ItemAttributeDetail.h
 *
 * 
 */

#ifndef _ItemAttributeDetail_H_
#define _ItemAttributeDetail_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "ItemAttributeDescription.h"
#include "ItemAttributeName.h"
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
	std::list<ItemAttributeDescription> getDescriptions();

	/*! \brief Set 
	 */
	void setDescriptions(std::list <ItemAttributeDescription> descriptions);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <AbilityDetail_pokemon_inner_pokemon> items);
	/*! \brief Get 
	 */
	std::list<ItemAttributeName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <ItemAttributeName> names);

private:
	int id;
	std::string name;
	std::list <ItemAttributeDescription>descriptions;
	std::list <AbilityDetail_pokemon_inner_pokemon>items;
	std::list <ItemAttributeName>names;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemAttributeDetail_H_ */
