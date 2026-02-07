/*
 * ItemDetail_machines_inner.h
 *
 * 
 */

#ifndef _ItemDetail_machines_inner_H_
#define _ItemDetail_machines_inner_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
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

class ItemDetail_machines_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemDetail_machines_inner();
	ItemDetail_machines_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemDetail_machines_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getMachine();

	/*! \brief Set 
	 */
	void setMachine(std::string  machine);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getVersionGroup();

	/*! \brief Set 
	 */
	void setVersionGroup(AbilityDetail_pokemon_inner_pokemon  version_group);

private:
	std::string machine;
	AbilityDetail_pokemon_inner_pokemon version_group;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemDetail_machines_inner_H_ */
