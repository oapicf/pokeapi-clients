/*
 * TypeDetail_damage_relations.h
 *
 * 
 */

#ifndef _TypeDetail_damage_relations_H_
#define _TypeDetail_damage_relations_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
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

class TypeDetail_damage_relations : public Object {
public:
	/*! \brief Constructor.
	 */
	TypeDetail_damage_relations();
	TypeDetail_damage_relations(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TypeDetail_damage_relations();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getNoDamageTo();

	/*! \brief Set 
	 */
	void setNoDamageTo(std::list <AbilityDetail_pokemon_inner_pokemon> no_damage_to);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getHalfDamageTo();

	/*! \brief Set 
	 */
	void setHalfDamageTo(std::list <AbilityDetail_pokemon_inner_pokemon> half_damage_to);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getDoubleDamageTo();

	/*! \brief Set 
	 */
	void setDoubleDamageTo(std::list <AbilityDetail_pokemon_inner_pokemon> double_damage_to);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getNoDamageFrom();

	/*! \brief Set 
	 */
	void setNoDamageFrom(std::list <AbilityDetail_pokemon_inner_pokemon> no_damage_from);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getHalfDamageFrom();

	/*! \brief Set 
	 */
	void setHalfDamageFrom(std::list <AbilityDetail_pokemon_inner_pokemon> half_damage_from);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getDoubleDamageFrom();

	/*! \brief Set 
	 */
	void setDoubleDamageFrom(std::list <AbilityDetail_pokemon_inner_pokemon> double_damage_from);

private:
	std::list <AbilityDetail_pokemon_inner_pokemon>no_damage_to;
	std::list <AbilityDetail_pokemon_inner_pokemon>half_damage_to;
	std::list <AbilityDetail_pokemon_inner_pokemon>double_damage_to;
	std::list <AbilityDetail_pokemon_inner_pokemon>no_damage_from;
	std::list <AbilityDetail_pokemon_inner_pokemon>half_damage_from;
	std::list <AbilityDetail_pokemon_inner_pokemon>double_damage_from;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TypeDetail_damage_relations_H_ */
