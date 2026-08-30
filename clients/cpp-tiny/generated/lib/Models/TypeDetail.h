
/*
 * TypeDetail.h
 *
 * Serializer for the Type resource
 */

#ifndef TINY_CPP_CLIENT_TypeDetail_H_
#define TINY_CPP_CLIENT_TypeDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityName.h"
#include "GenerationSummary.h"
#include "MoveDamageClassSummary.h"
#include "MoveSummary.h"
#include "TypeDetail_damage_relations.h"
#include "TypeDetail_past_damage_relations_inner.h"
#include "TypeDetail_pokemon_inner.h"
#include "TypeDetail_sprites_value_value.h"
#include "TypeGameIndex.h"
#include <list>
#include <map>

namespace Tiny {


/*! \brief Serializer for the Type resource
 *
 *  \ingroup Models
 *
 */

class TypeDetail{
public:

    /*! \brief Constructor.
	 */
    TypeDetail();
    TypeDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TypeDetail();


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
	TypeDetail_damage_relations getDamageRelations();

	/*! \brief Set 
	 */
	void setDamageRelations(TypeDetail_damage_relations damage_relations);
	/*! \brief Get 
	 */
	std::list<TypeDetail_past_damage_relations_inner> getPastDamageRelations();

	/*! \brief Set 
	 */
	void setPastDamageRelations(std::list<TypeDetail_past_damage_relations_inner> past_damage_relations);
	/*! \brief Get 
	 */
	std::list<TypeGameIndex> getGameIndices();

	/*! \brief Set 
	 */
	void setGameIndices(std::list<TypeGameIndex> game_indices);
	/*! \brief Get 
	 */
	GenerationSummary getGeneration();

	/*! \brief Set 
	 */
	void setGeneration(GenerationSummary generation);
	/*! \brief Get 
	 */
	MoveDamageClassSummary getMoveDamageClass();

	/*! \brief Set 
	 */
	void setMoveDamageClass(MoveDamageClassSummary move_damage_class);
	/*! \brief Get 
	 */
	std::list<AbilityName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list<AbilityName> names);
	/*! \brief Get 
	 */
	std::list<TypeDetail_pokemon_inner> getPokemon();

	/*! \brief Set 
	 */
	void setPokemon(std::list<TypeDetail_pokemon_inner> pokemon);
	/*! \brief Get 
	 */
	std::list<MoveSummary> getMoves();

	/*! \brief Set 
	 */
	void setMoves(std::list<MoveSummary> moves);
	/*! \brief Get 
	 */
	std::map<std::string, std::map<std::string, TypeDetail_sprites_value_value>> getSprites();

	/*! \brief Set 
	 */
	void setSprites(std::map<std::string, std::map<std::string, TypeDetail_sprites_value_value>> sprites);


    private:
    int id{};
    std::string name{};
    TypeDetail_damage_relations damage_relations;
    std::list<TypeDetail_past_damage_relations_inner> past_damage_relations;
    std::list<TypeGameIndex> game_indices;
    GenerationSummary generation;
    MoveDamageClassSummary move_damage_class;
    std::list<AbilityName> names;
    std::list<TypeDetail_pokemon_inner> pokemon;
    std::list<MoveSummary> moves;
    std::map<std::string, std::map<std::string, TypeDetail_sprites_value_value>> sprites;
};
}

#endif /* TINY_CPP_CLIENT_TypeDetail_H_ */
