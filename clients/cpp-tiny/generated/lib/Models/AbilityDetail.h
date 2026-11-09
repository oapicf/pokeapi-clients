
/*
 * AbilityDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AbilityDetail_H_
#define TINY_CPP_CLIENT_AbilityDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityChange.h"
#include "AbilityEffectText.h"
#include "AbilityFlavorText.h"
#include "AbilityName.h"
#include "AbilityPokemonDetail.h"
#include "GenerationSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AbilityDetail{
public:

    /*! \brief Constructor.
	 */
    AbilityDetail();
    AbilityDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AbilityDetail();


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
	/*! \brief Get Whether or not this ability originated in the main series of the video games.
	 */
	bool isIsMainSeries();

	/*! \brief Set Whether or not this ability originated in the main series of the video games.
	 */
	void setIsMainSeries(bool is_main_series);
	/*! \brief Get The generation this ability originated in.
	 */
	GenerationSummary getGeneration();

	/*! \brief Set The generation this ability originated in.
	 */
	void setGeneration(GenerationSummary generation);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<AbilityName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list<AbilityName> names);
	/*! \brief Get The effect of this ability listed in different languages.
	 */
	std::list<AbilityEffectText> getEffectEntries();

	/*! \brief Set The effect of this ability listed in different languages.
	 */
	void setEffectEntries(std::list<AbilityEffectText> effect_entries);
	/*! \brief Get The list of previous effects this ability has had across version groups.
	 */
	std::list<AbilityChange> getEffectChanges();

	/*! \brief Set The list of previous effects this ability has had across version groups.
	 */
	void setEffectChanges(std::list<AbilityChange> effect_changes);
	/*! \brief Get The flavor text of this ability listed in different languages.
	 */
	std::list<AbilityFlavorText> getFlavorTextEntries();

	/*! \brief Set The flavor text of this ability listed in different languages.
	 */
	void setFlavorTextEntries(std::list<AbilityFlavorText> flavor_text_entries);
	/*! \brief Get A list of Pokémon that could potentially have this ability.
	 */
	std::list<AbilityPokemonDetail> getPokemon();

	/*! \brief Set A list of Pokémon that could potentially have this ability.
	 */
	void setPokemon(std::list<AbilityPokemonDetail> pokemon);


    private:
    int id{};
    std::string name{};
    bool is_main_series{};
    GenerationSummary generation;
    std::list<AbilityName> names;
    std::list<AbilityEffectText> effect_entries;
    std::list<AbilityChange> effect_changes;
    std::list<AbilityFlavorText> flavor_text_entries;
    std::list<AbilityPokemonDetail> pokemon;
};
}

#endif /* TINY_CPP_CLIENT_AbilityDetail_H_ */
