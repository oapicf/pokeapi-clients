/*
 * PokemonSpeciesDetail.h
 *
 * 
 */

#ifndef _PokemonSpeciesDetail_H_
#define _PokemonSpeciesDetail_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "EvolutionChainSummary.h"
#include "GenerationSummary.h"
#include "GrowthRateSummary.h"
#include "PokemonColorSummary.h"
#include "PokemonDexEntry.h"
#include "PokemonFormDetail_form_names_inner.h"
#include "PokemonHabitatSummary.h"
#include "PokemonShapeSummary.h"
#include "PokemonSpeciesDescription.h"
#include "PokemonSpeciesDetail_genera_inner.h"
#include "PokemonSpeciesDetail_pal_park_encounters_inner.h"
#include "PokemonSpeciesDetail_varieties_inner.h"
#include "PokemonSpeciesFlavorText.h"
#include "PokemonSpeciesSummary.h"
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

class PokemonSpeciesDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonSpeciesDetail();
	PokemonSpeciesDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonSpeciesDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	int getOrder();

	/*! \brief Set 
	 */
	void setOrder(int  order);
	/*! \brief Get 
	 */
	int getGenderRate();

	/*! \brief Set 
	 */
	void setGenderRate(int  gender_rate);
	/*! \brief Get 
	 */
	int getCaptureRate();

	/*! \brief Set 
	 */
	void setCaptureRate(int  capture_rate);
	/*! \brief Get 
	 */
	int getBaseHappiness();

	/*! \brief Set 
	 */
	void setBaseHappiness(int  base_happiness);
	/*! \brief Get 
	 */
	bool getIsBaby();

	/*! \brief Set 
	 */
	void setIsBaby(bool  is_baby);
	/*! \brief Get 
	 */
	bool getIsLegendary();

	/*! \brief Set 
	 */
	void setIsLegendary(bool  is_legendary);
	/*! \brief Get 
	 */
	bool getIsMythical();

	/*! \brief Set 
	 */
	void setIsMythical(bool  is_mythical);
	/*! \brief Get 
	 */
	int getHatchCounter();

	/*! \brief Set 
	 */
	void setHatchCounter(int  hatch_counter);
	/*! \brief Get 
	 */
	bool getHasGenderDifferences();

	/*! \brief Set 
	 */
	void setHasGenderDifferences(bool  has_gender_differences);
	/*! \brief Get 
	 */
	bool getFormsSwitchable();

	/*! \brief Set 
	 */
	void setFormsSwitchable(bool  forms_switchable);
	/*! \brief Get 
	 */
	GrowthRateSummary getGrowthRate();

	/*! \brief Set 
	 */
	void setGrowthRate(GrowthRateSummary  growth_rate);
	/*! \brief Get 
	 */
	std::list<PokemonDexEntry> getPokedexNumbers();

	/*! \brief Set 
	 */
	void setPokedexNumbers(std::list <PokemonDexEntry> pokedex_numbers);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getEggGroups();

	/*! \brief Set 
	 */
	void setEggGroups(std::list <AbilityDetail_pokemon_inner_pokemon> egg_groups);
	/*! \brief Get 
	 */
	PokemonColorSummary getColor();

	/*! \brief Set 
	 */
	void setColor(PokemonColorSummary  color);
	/*! \brief Get 
	 */
	PokemonShapeSummary getShape();

	/*! \brief Set 
	 */
	void setShape(PokemonShapeSummary  shape);
	/*! \brief Get 
	 */
	PokemonSpeciesSummary getEvolvesFromSpecies();

	/*! \brief Set 
	 */
	void setEvolvesFromSpecies(PokemonSpeciesSummary  evolves_from_species);
	/*! \brief Get 
	 */
	EvolutionChainSummary getEvolutionChain();

	/*! \brief Set 
	 */
	void setEvolutionChain(EvolutionChainSummary  evolution_chain);
	/*! \brief Get 
	 */
	PokemonHabitatSummary getHabitat();

	/*! \brief Set 
	 */
	void setHabitat(PokemonHabitatSummary  habitat);
	/*! \brief Get 
	 */
	GenerationSummary getGeneration();

	/*! \brief Set 
	 */
	void setGeneration(GenerationSummary  generation);
	/*! \brief Get 
	 */
	std::list<PokemonFormDetail_form_names_inner> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <PokemonFormDetail_form_names_inner> names);
	/*! \brief Get 
	 */
	std::list<PokemonSpeciesDetail_pal_park_encounters_inner> getPalParkEncounters();

	/*! \brief Set 
	 */
	void setPalParkEncounters(std::list <PokemonSpeciesDetail_pal_park_encounters_inner> pal_park_encounters);
	/*! \brief Get 
	 */
	std::list<PokemonSpeciesDescription> getFormDescriptions();

	/*! \brief Set 
	 */
	void setFormDescriptions(std::list <PokemonSpeciesDescription> form_descriptions);
	/*! \brief Get 
	 */
	std::list<PokemonSpeciesFlavorText> getFlavorTextEntries();

	/*! \brief Set 
	 */
	void setFlavorTextEntries(std::list <PokemonSpeciesFlavorText> flavor_text_entries);
	/*! \brief Get 
	 */
	std::list<PokemonSpeciesDetail_genera_inner> getGenera();

	/*! \brief Set 
	 */
	void setGenera(std::list <PokemonSpeciesDetail_genera_inner> genera);
	/*! \brief Get 
	 */
	std::list<PokemonSpeciesDetail_varieties_inner> getVarieties();

	/*! \brief Set 
	 */
	void setVarieties(std::list <PokemonSpeciesDetail_varieties_inner> varieties);

private:
	int id;
	std::string name;
	int order;
	int gender_rate;
	int capture_rate;
	int base_happiness;
	bool is_baby;
	bool is_legendary;
	bool is_mythical;
	int hatch_counter;
	bool has_gender_differences;
	bool forms_switchable;
	GrowthRateSummary growth_rate;
	std::list <PokemonDexEntry>pokedex_numbers;
	std::list <AbilityDetail_pokemon_inner_pokemon>egg_groups;
	PokemonColorSummary color;
	PokemonShapeSummary shape;
	PokemonSpeciesSummary evolves_from_species;
	EvolutionChainSummary evolution_chain;
	PokemonHabitatSummary habitat;
	GenerationSummary generation;
	std::list <PokemonFormDetail_form_names_inner>names;
	std::list <PokemonSpeciesDetail_pal_park_encounters_inner>pal_park_encounters;
	std::list <PokemonSpeciesDescription>form_descriptions;
	std::list <PokemonSpeciesFlavorText>flavor_text_entries;
	std::list <PokemonSpeciesDetail_genera_inner>genera;
	std::list <PokemonSpeciesDetail_varieties_inner>varieties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonSpeciesDetail_H_ */
