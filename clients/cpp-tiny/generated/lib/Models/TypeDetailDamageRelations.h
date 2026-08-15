
/*
 * TypeDetail_damage_relations.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TypeDetail_damage_relations_H_
#define TINY_CPP_CLIENT_TypeDetail_damage_relations_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TypeDetail_damage_relations{
public:

    /*! \brief Constructor.
	 */
    TypeDetail_damage_relations();
    TypeDetail_damage_relations(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TypeDetail_damage_relations();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<AbilityDetail_pokemon_inner_pokemon> no_damage_to;
    std::list<AbilityDetail_pokemon_inner_pokemon> half_damage_to;
    std::list<AbilityDetail_pokemon_inner_pokemon> double_damage_to;
    std::list<AbilityDetail_pokemon_inner_pokemon> no_damage_from;
    std::list<AbilityDetail_pokemon_inner_pokemon> half_damage_from;
    std::list<AbilityDetail_pokemon_inner_pokemon> double_damage_from;
};
}

#endif /* TINY_CPP_CLIENT_TypeDetail_damage_relations_H_ */
