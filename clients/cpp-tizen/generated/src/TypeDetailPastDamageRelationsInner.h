/*
 * TypeDetail_past_damage_relations_inner.h
 *
 * 
 */

#ifndef _TypeDetail_past_damage_relations_inner_H_
#define _TypeDetail_past_damage_relations_inner_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "TypeDetail_past_damage_relations_inner_damage_relations.h"
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

class TypeDetail_past_damage_relations_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	TypeDetail_past_damage_relations_inner();
	TypeDetail_past_damage_relations_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TypeDetail_past_damage_relations_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getGeneration();

	/*! \brief Set 
	 */
	void setGeneration(AbilityDetail_pokemon_inner_pokemon  generation);
	/*! \brief Get 
	 */
	TypeDetail_past_damage_relations_inner_damage_relations getDamageRelations();

	/*! \brief Set 
	 */
	void setDamageRelations(TypeDetail_past_damage_relations_inner_damage_relations  damage_relations);

private:
	AbilityDetail_pokemon_inner_pokemon generation;
	TypeDetail_past_damage_relations_inner_damage_relations damage_relations;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TypeDetail_past_damage_relations_inner_H_ */
