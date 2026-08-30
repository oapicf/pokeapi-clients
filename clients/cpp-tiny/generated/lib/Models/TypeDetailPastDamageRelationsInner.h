
/*
 * TypeDetail_past_damage_relations_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TypeDetail_past_damage_relations_inner_H_
#define TINY_CPP_CLIENT_TypeDetail_past_damage_relations_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "TypeDetail_past_damage_relations_inner_damage_relations.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TypeDetail_past_damage_relations_inner{
public:

    /*! \brief Constructor.
	 */
    TypeDetail_past_damage_relations_inner();
    TypeDetail_past_damage_relations_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TypeDetail_past_damage_relations_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getGeneration();

	/*! \brief Set 
	 */
	void setGeneration(AbilityDetail_pokemon_inner_pokemon generation);
	/*! \brief Get 
	 */
	TypeDetail_past_damage_relations_inner_damage_relations getDamageRelations();

	/*! \brief Set 
	 */
	void setDamageRelations(TypeDetail_past_damage_relations_inner_damage_relations damage_relations);


    private:
    AbilityDetail_pokemon_inner_pokemon generation;
    TypeDetail_past_damage_relations_inner_damage_relations damage_relations;
};
}

#endif /* TINY_CPP_CLIENT_TypeDetail_past_damage_relations_inner_H_ */
