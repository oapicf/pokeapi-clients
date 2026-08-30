
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
#include "PokemonDetail_abilities_inner.h"
#include "PokemonDetail_cries.h"
#include "PokemonDetail_held_items.h"
#include "PokemonDetail_moves_inner.h"
#include "PokemonDetail_past_abilities_inner.h"
#include "PokemonDetail_past_types_inner.h"
#include "PokemonDetail_sprites.h"
#include "PokemonDetail_types_inner.h"
#include "PokemonFormSummary.h"
#include "PokemonGameIndex.h"
#include "PokemonSpeciesSummary.h"
#include "PokemonStat.h"
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
	int getBaseExperience();

	/*! \brief Set 
	 */
	void setBaseExperience(int base_experience);
	/*! \brief Get 
	 */
	int getHeight();

	/*! \brief Set 
	 */
	void setHeight(int height);
	/*! \brief Get 
	 */
	bool isIsDefault();

	/*! \brief Set 
	 */
	void setIsDefault(bool is_default);
	/*! \brief Get 
	 */
	int getOrder();

	/*! \brief Set 
	 */
	void setOrder(int order);
	/*! \brief Get 
	 */
	int getWeight();

	/*! \brief Set 
	 */
	void setWeight(int weight);
	/*! \brief Get 
	 */
	std::list<PokemonDetail_abilities_inner> getAbilities();

	/*! \brief Set 
	 */
	void setAbilities(std::list<PokemonDetail_abilities_inner> abilities);
	/*! \brief Get 
	 */
	std::list<PokemonDetail_past_abilities_inner> getPastAbilities();

	/*! \brief Set 
	 */
	void setPastAbilities(std::list<PokemonDetail_past_abilities_inner> past_abilities);
	/*! \brief Get 
	 */
	std::list<PokemonFormSummary> getForms();

	/*! \brief Set 
	 */
	void setForms(std::list<PokemonFormSummary> forms);
	/*! \brief Get 
	 */
	std::list<PokemonGameIndex> getGameIndices();

	/*! \brief Set 
	 */
	void setGameIndices(std::list<PokemonGameIndex> game_indices);
	/*! \brief Get 
	 */
	PokemonDetail_held_items getHeldItems();

	/*! \brief Set 
	 */
	void setHeldItems(PokemonDetail_held_items held_items);
	/*! \brief Get 
	 */
	std::string getLocationAreaEncounters();

	/*! \brief Set 
	 */
	void setLocationAreaEncounters(std::string location_area_encounters);
	/*! \brief Get 
	 */
	std::list<PokemonDetail_moves_inner> getMoves();

	/*! \brief Set 
	 */
	void setMoves(std::list<PokemonDetail_moves_inner> moves);
	/*! \brief Get 
	 */
	PokemonSpeciesSummary getSpecies();

	/*! \brief Set 
	 */
	void setSpecies(PokemonSpeciesSummary species);
	/*! \brief Get 
	 */
	PokemonDetail_sprites&lt;std::string, std::string&gt; getSprites();

	/*! \brief Set 
	 */
	void setSprites(PokemonDetail_sprites&lt;std::string, std::string&gt; sprites);
	/*! \brief Get 
	 */
	PokemonDetail_cries getCries();

	/*! \brief Set 
	 */
	void setCries(PokemonDetail_cries cries);
	/*! \brief Get 
	 */
	std::list<PokemonStat> getStats();

	/*! \brief Set 
	 */
	void setStats(std::list<PokemonStat> stats);
	/*! \brief Get 
	 */
	std::list<PokemonDetail_types_inner> getTypes();

	/*! \brief Set 
	 */
	void setTypes(std::list<PokemonDetail_types_inner> types);
	/*! \brief Get 
	 */
	std::list<PokemonDetail_past_types_inner> getPastTypes();

	/*! \brief Set 
	 */
	void setPastTypes(std::list<PokemonDetail_past_types_inner> past_types);


    private:
    int id{};
    std::string name{};
    int base_experience{};
    int height{};
    bool is_default{};
    int order{};
    int weight{};
    std::list<PokemonDetail_abilities_inner> abilities;
    std::list<PokemonDetail_past_abilities_inner> past_abilities;
    std::list<PokemonFormSummary> forms;
    std::list<PokemonGameIndex> game_indices;
    PokemonDetail_held_items held_items;
    std::string location_area_encounters{};
    std::list<PokemonDetail_moves_inner> moves;
    PokemonSpeciesSummary species;
    PokemonDetail_sprites&lt;std::string, std::string&gt; sprites;
    PokemonDetail_cries cries;
    std::list<PokemonStat> stats;
    std::list<PokemonDetail_types_inner> types;
    std::list<PokemonDetail_past_types_inner> past_types;
};
}

#endif /* TINY_CPP_CLIENT_PokemonDetail_H_ */
