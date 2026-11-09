
/*
 * PokemonDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonDetail_H_
#define TINY_CPP_CLIENT_PokemonDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PokemonAbility.h"
#include "PokemonCries.h"
#include "PokemonFormSummary.h"
#include "PokemonGameIndex.h"
#include "PokemonHeldItemSummary.h"
#include "PokemonMove.h"
#include "PokemonPastAbility.h"
#include "PokemonPastStat.h"
#include "PokemonPastType.h"
#include "PokemonSpeciesSummary.h"
#include "PokemonSprites.h"
#include "PokemonStat.h"
#include "PokemonType.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonDetail{
public:

    /*! \brief Constructor.
	 */
    PokemonDetail();
    PokemonDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string name);
	/*! \brief Get The base experience gained for defeating this Pokémon.
	 */
	int getBaseExperience();

	/*! \brief Set The base experience gained for defeating this Pokémon.
	 */
	void setBaseExperience(int base_experience);
	/*! \brief Get The height of this Pokémon in decimetres.
	 */
	int getHeight();

	/*! \brief Set The height of this Pokémon in decimetres.
	 */
	void setHeight(int height);
	/*! \brief Get Set for exactly one Pokémon used as the default for each species.
	 */
	bool isIsDefault();

	/*! \brief Set Set for exactly one Pokémon used as the default for each species.
	 */
	void setIsDefault(bool is_default);
	/*! \brief Get Order for sorting. Almost national order, except families are grouped together.
	 */
	int getOrder();

	/*! \brief Set Order for sorting. Almost national order, except families are grouped together.
	 */
	void setOrder(int order);
	/*! \brief Get The weight of this Pokémon in hectograms.
	 */
	int getWeight();

	/*! \brief Set The weight of this Pokémon in hectograms.
	 */
	void setWeight(int weight);
	/*! \brief Get A list of abilities this Pokémon could potentially have.
	 */
	std::list<PokemonAbility> getAbilities();

	/*! \brief Set A list of abilities this Pokémon could potentially have.
	 */
	void setAbilities(std::list<PokemonAbility> abilities);
	/*! \brief Get A list of details showing abilities this pokémon had in previous generations
	 */
	std::list<PokemonPastAbility> getPastAbilities();

	/*! \brief Set A list of details showing abilities this pokémon had in previous generations
	 */
	void setPastAbilities(std::list<PokemonPastAbility> past_abilities);
	/*! \brief Get A list of forms this Pokémon can take on.
	 */
	std::list<PokemonFormSummary> getForms();

	/*! \brief Set A list of forms this Pokémon can take on.
	 */
	void setForms(std::list<PokemonFormSummary> forms);
	/*! \brief Get A list of game indices relevent to Pokémon item by generation.
	 */
	std::list<PokemonGameIndex> getGameIndices();

	/*! \brief Set A list of game indices relevent to Pokémon item by generation.
	 */
	void setGameIndices(std::list<PokemonGameIndex> game_indices);
	/*! \brief Get A list of items this Pokémon may be holding when encountered.
	 */
	std::list<PokemonHeldItemSummary> getHeldItems();

	/*! \brief Set A list of items this Pokémon may be holding when encountered.
	 */
	void setHeldItems(std::list<PokemonHeldItemSummary> held_items);
	/*! \brief Get A link to a list of location areas, as well as encounter details pertaining to specific versions.
	 */
	std::string getLocationAreaEncounters();

	/*! \brief Set A link to a list of location areas, as well as encounter details pertaining to specific versions.
	 */
	void setLocationAreaEncounters(std::string location_area_encounters);
	/*! \brief Get A list of moves along with learn methods and level details pertaining to specific version groups.
	 */
	std::list<PokemonMove> getMoves();

	/*! \brief Set A list of moves along with learn methods and level details pertaining to specific version groups.
	 */
	void setMoves(std::list<PokemonMove> moves);
	/*! \brief Get The species this Pokémon belongs to.
	 */
	PokemonSpeciesSummary getSpecies();

	/*! \brief Set The species this Pokémon belongs to.
	 */
	void setSpecies(PokemonSpeciesSummary species);
	/*! \brief Get A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>
	 */
	PokemonSprites getSprites();

	/*! \brief Set A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>
	 */
	void setSprites(PokemonSprites sprites);
	/*! \brief Get A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>
	 */
	PokemonCries getCries();

	/*! \brief Set A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>
	 */
	void setCries(PokemonCries cries);
	/*! \brief Get A list of base stat values for this Pokémon.
	 */
	std::list<PokemonStat> getStats();

	/*! \brief Set A list of base stat values for this Pokémon.
	 */
	void setStats(std::list<PokemonStat> stats);
	/*! \brief Get A list of details showing stats this pokémon had in previous generations
	 */
	std::list<PokemonPastStat> getPastStats();

	/*! \brief Set A list of details showing stats this pokémon had in previous generations
	 */
	void setPastStats(std::list<PokemonPastStat> past_stats);
	/*! \brief Get A list of details showing types this Pokémon has.
	 */
	std::list<PokemonType> getTypes();

	/*! \brief Set A list of details showing types this Pokémon has.
	 */
	void setTypes(std::list<PokemonType> types);
	/*! \brief Get A list of details showing types this pokémon had in previous generations
	 */
	std::list<PokemonPastType> getPastTypes();

	/*! \brief Set A list of details showing types this pokémon had in previous generations
	 */
	void setPastTypes(std::list<PokemonPastType> past_types);


    private:
    int id{};
    std::string name{};
    int base_experience{};
    int height{};
    bool is_default{};
    int order{};
    int weight{};
    std::list<PokemonAbility> abilities;
    std::list<PokemonPastAbility> past_abilities;
    std::list<PokemonFormSummary> forms;
    std::list<PokemonGameIndex> game_indices;
    std::list<PokemonHeldItemSummary> held_items;
    std::string location_area_encounters{};
    std::list<PokemonMove> moves;
    PokemonSpeciesSummary species;
    PokemonSprites sprites;
    PokemonCries cries;
    std::list<PokemonStat> stats;
    std::list<PokemonPastStat> past_stats;
    std::list<PokemonType> types;
    std::list<PokemonPastType> past_types;
};
}

#endif /* TINY_CPP_CLIENT_PokemonDetail_H_ */
