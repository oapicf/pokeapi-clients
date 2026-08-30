
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
#include "AbilityDetail_pokemon_inner.h"
#include "AbilityEffectText.h"
#include "AbilityFlavorText.h"
#include "AbilityName.h"
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
	bool isIsMainSeries();

	/*! \brief Set 
	 */
	void setIsMainSeries(bool is_main_series);
	/*! \brief Get 
	 */
	GenerationSummary getGeneration();

	/*! \brief Set 
	 */
	void setGeneration(GenerationSummary generation);
	/*! \brief Get 
	 */
	std::list<AbilityName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list<AbilityName> names);
	/*! \brief Get 
	 */
	std::list<AbilityEffectText> getEffectEntries();

	/*! \brief Set 
	 */
	void setEffectEntries(std::list<AbilityEffectText> effect_entries);
	/*! \brief Get 
	 */
	std::list<AbilityChange> getEffectChanges();

	/*! \brief Set 
	 */
	void setEffectChanges(std::list<AbilityChange> effect_changes);
	/*! \brief Get 
	 */
	std::list<AbilityFlavorText> getFlavorTextEntries();

	/*! \brief Set 
	 */
	void setFlavorTextEntries(std::list<AbilityFlavorText> flavor_text_entries);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner> getPokemon();

	/*! \brief Set 
	 */
	void setPokemon(std::list<AbilityDetail_pokemon_inner> pokemon);


    private:
    int id{};
    std::string name{};
    bool is_main_series{};
    GenerationSummary generation;
    std::list<AbilityName> names;
    std::list<AbilityEffectText> effect_entries;
    std::list<AbilityChange> effect_changes;
    std::list<AbilityFlavorText> flavor_text_entries;
    std::list<AbilityDetail_pokemon_inner> pokemon;
};
}

#endif /* TINY_CPP_CLIENT_AbilityDetail_H_ */
