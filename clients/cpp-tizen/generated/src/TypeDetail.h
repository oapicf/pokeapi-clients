/*
 * TypeDetail.h
 *
 * Serializer for the Type resource
 */

#ifndef _TypeDetail_H_
#define _TypeDetail_H_


#include <string>
#include "GenerationSummary.h"
#include "MoveDamageClassSummary.h"
#include "MoveSummary.h"
#include "TypeGameIndex.h"
#include "TypeGameSprite.h"
#include "TypeName.h"
#include "TypePastRelationships.h"
#include "TypePokemon.h"
#include "TypeRelationships.h"
#include <list>
#include <map>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Serializer for the Type resource
 *
 *  \ingroup Models
 *
 */

class TypeDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	TypeDetail();
	TypeDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TypeDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int  id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string  name);
	/*! \brief Get A detail of how effective this type is toward others and vice versa.
	 */
	TypeRelationships getDamageRelations();

	/*! \brief Set A detail of how effective this type is toward others and vice versa.
	 */
	void setDamageRelations(TypeRelationships  damage_relations);
	/*! \brief Get A list of details of how effective this type was toward others and vice versa in previous generations
	 */
	std::list<TypePastRelationships> getPastDamageRelations();

	/*! \brief Set A list of details of how effective this type was toward others and vice versa in previous generations
	 */
	void setPastDamageRelations(std::list <TypePastRelationships> past_damage_relations);
	/*! \brief Get A list of game indices relevent to this item by generation.
	 */
	std::list<TypeGameIndex> getGameIndices();

	/*! \brief Set A list of game indices relevent to this item by generation.
	 */
	void setGameIndices(std::list <TypeGameIndex> game_indices);
	/*! \brief Get The generation this type was introduced in.
	 */
	GenerationSummary getGeneration();

	/*! \brief Set The generation this type was introduced in.
	 */
	void setGeneration(GenerationSummary  generation);
	/*! \brief Get The class of damage inflicted by this type.
	 */
	MoveDamageClassSummary getMoveDamageClass();

	/*! \brief Set The class of damage inflicted by this type.
	 */
	void setMoveDamageClass(MoveDamageClassSummary  move_damage_class);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<TypeName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list <TypeName> names);
	/*! \brief Get A list of details of Pokémon that have this type.
	 */
	std::list<TypePokemon> getPokemon();

	/*! \brief Set A list of details of Pokémon that have this type.
	 */
	void setPokemon(std::list <TypePokemon> pokemon);
	/*! \brief Get A list of moves that have this type.
	 */
	std::list<MoveSummary> getMoves();

	/*! \brief Set A list of moves that have this type.
	 */
	void setMoves(std::list <MoveSummary> moves);
	/*! \brief Get Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
	 */
	std::map<std::string, std::string> getSprites();

	/*! \brief Set Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
	 */
	void setSprites(std::map <std::string, std::string> sprites);

private:
	int id;
	std::string name;
	TypeRelationships damage_relations;
	std::list <TypePastRelationships>past_damage_relations;
	std::list <TypeGameIndex>game_indices;
	GenerationSummary generation;
	MoveDamageClassSummary move_damage_class;
	std::list <TypeName>names;
	std::list <TypePokemon>pokemon;
	std::list <MoveSummary>moves;
	std::map <std::string, std::string>sprites;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TypeDetail_H_ */
