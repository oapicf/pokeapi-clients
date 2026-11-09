/*
 * PokemonSpeciesDetail.h
 *
 * 
 */

#ifndef _PokemonSpeciesDetail_H_
#define _PokemonSpeciesDetail_H_


#include <string>
#include "EggGroupSummary.h"
#include "EvolutionChainSummary.h"
#include "GenerationSummary.h"
#include "GrowthRateSummary.h"
#include "PokemonColorSummary.h"
#include "PokemonDexEntry.h"
#include "PokemonHabitatSummary.h"
#include "PokemonShapeSummary.h"
#include "PokemonSpeciesDescription.h"
#include "PokemonSpeciesFlavorText.h"
#include "PokemonSpeciesGenus.h"
#include "PokemonSpeciesName.h"
#include "PokemonSpeciesPalParkEncounter.h"
#include "PokemonSpeciesSummary.h"
#include "PokemonSpeciesVariety.h"
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
	/*! \brief Get The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.
	 */
	int getOrder();

	/*! \brief Set The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.
	 */
	void setOrder(int  order);
	/*! \brief Get The chance of this Pokémon being female, in eighths; or -1 for genderless.
	 */
	int getGenderRate();

	/*! \brief Set The chance of this Pokémon being female, in eighths; or -1 for genderless.
	 */
	void setGenderRate(int  gender_rate);
	/*! \brief Get The base capture rate; up to 255. The higher the number, the easier the catch.
	 */
	int getCaptureRate();

	/*! \brief Set The base capture rate; up to 255. The higher the number, the easier the catch.
	 */
	void setCaptureRate(int  capture_rate);
	/*! \brief Get The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.
	 */
	int getBaseHappiness();

	/*! \brief Set The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.
	 */
	void setBaseHappiness(int  base_happiness);
	/*! \brief Get Whether or not this is a baby Pokémon.
	 */
	bool getIsBaby();

	/*! \brief Set Whether or not this is a baby Pokémon.
	 */
	void setIsBaby(bool  is_baby);
	/*! \brief Get Whether or not this is a legendary Pokémon.
	 */
	bool getIsLegendary();

	/*! \brief Set Whether or not this is a legendary Pokémon.
	 */
	void setIsLegendary(bool  is_legendary);
	/*! \brief Get Whether or not this is a mythical Pokémon.
	 */
	bool getIsMythical();

	/*! \brief Set Whether or not this is a mythical Pokémon.
	 */
	void setIsMythical(bool  is_mythical);
	/*! \brief Get Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.
	 */
	int getHatchCounter();

	/*! \brief Set Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.
	 */
	void setHatchCounter(int  hatch_counter);
	/*! \brief Get Whether or not this Pokémon has visual gender differences.
	 */
	bool getHasGenderDifferences();

	/*! \brief Set Whether or not this Pokémon has visual gender differences.
	 */
	void setHasGenderDifferences(bool  has_gender_differences);
	/*! \brief Get Whether or not this Pokémon has multiple forms and can switch between them.
	 */
	bool getFormsSwitchable();

	/*! \brief Set Whether or not this Pokémon has multiple forms and can switch between them.
	 */
	void setFormsSwitchable(bool  forms_switchable);
	/*! \brief Get The rate at which this Pokémon species gains levels.
	 */
	GrowthRateSummary getGrowthRate();

	/*! \brief Set The rate at which this Pokémon species gains levels.
	 */
	void setGrowthRate(GrowthRateSummary  growth_rate);
	/*! \brief Get A list of Pokedexes and the indexes reserved within them for this Pokémon species.
	 */
	std::list<PokemonDexEntry> getPokedexNumbers();

	/*! \brief Set A list of Pokedexes and the indexes reserved within them for this Pokémon species.
	 */
	void setPokedexNumbers(std::list <PokemonDexEntry> pokedex_numbers);
	/*! \brief Get A list of egg groups this Pokémon species is a member of.
	 */
	std::list<EggGroupSummary> getEggGroups();

	/*! \brief Set A list of egg groups this Pokémon species is a member of.
	 */
	void setEggGroups(std::list <EggGroupSummary> egg_groups);
	/*! \brief Get The color of this Pokémon for Pokédex search.
	 */
	PokemonColorSummary getColor();

	/*! \brief Set The color of this Pokémon for Pokédex search.
	 */
	void setColor(PokemonColorSummary  color);
	/*! \brief Get The shape of this Pokémon for Pokédex search.
	 */
	PokemonShapeSummary getShape();

	/*! \brief Set The shape of this Pokémon for Pokédex search.
	 */
	void setShape(PokemonShapeSummary  shape);
	/*! \brief Get The Pokémon species that evolves into this Pokemon_species.
	 */
	PokemonSpeciesSummary getEvolvesFromSpecies();

	/*! \brief Set The Pokémon species that evolves into this Pokemon_species.
	 */
	void setEvolvesFromSpecies(PokemonSpeciesSummary  evolves_from_species);
	/*! \brief Get The evolution chain this Pokémon species is a member of.
	 */
	EvolutionChainSummary getEvolutionChain();

	/*! \brief Set The evolution chain this Pokémon species is a member of.
	 */
	void setEvolutionChain(EvolutionChainSummary  evolution_chain);
	/*! \brief Get The habitat this Pokémon species can be encountered in.
	 */
	PokemonHabitatSummary getHabitat();

	/*! \brief Set The habitat this Pokémon species can be encountered in.
	 */
	void setHabitat(PokemonHabitatSummary  habitat);
	/*! \brief Get The generation this Pokémon species was introduced in.
	 */
	GenerationSummary getGeneration();

	/*! \brief Set The generation this Pokémon species was introduced in.
	 */
	void setGeneration(GenerationSummary  generation);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<PokemonSpeciesName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list <PokemonSpeciesName> names);
	/*! \brief Get A list of encounters that can be had with this Pokémon species in pal park.
	 */
	std::list<PokemonSpeciesPalParkEncounter> getPalParkEncounters();

	/*! \brief Set A list of encounters that can be had with this Pokémon species in pal park.
	 */
	void setPalParkEncounters(std::list <PokemonSpeciesPalParkEncounter> pal_park_encounters);
	/*! \brief Get Descriptions of different forms Pokémon take on within the Pokémon species.
	 */
	std::list<PokemonSpeciesDescription> getFormDescriptions();

	/*! \brief Set Descriptions of different forms Pokémon take on within the Pokémon species.
	 */
	void setFormDescriptions(std::list <PokemonSpeciesDescription> form_descriptions);
	/*! \brief Get A list of flavor text entries for this Pokémon species.
	 */
	std::list<PokemonSpeciesFlavorText> getFlavorTextEntries();

	/*! \brief Set A list of flavor text entries for this Pokémon species.
	 */
	void setFlavorTextEntries(std::list <PokemonSpeciesFlavorText> flavor_text_entries);
	/*! \brief Get The genus of this Pokémon species listed in multiple languages.
	 */
	std::list<PokemonSpeciesGenus> getGenera();

	/*! \brief Set The genus of this Pokémon species listed in multiple languages.
	 */
	void setGenera(std::list <PokemonSpeciesGenus> genera);
	/*! \brief Get A list of the Pokémon that exist within this Pokémon species.
	 */
	std::list<PokemonSpeciesVariety> getVarieties();

	/*! \brief Set A list of the Pokémon that exist within this Pokémon species.
	 */
	void setVarieties(std::list <PokemonSpeciesVariety> varieties);

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
	std::list <EggGroupSummary>egg_groups;
	PokemonColorSummary color;
	PokemonShapeSummary shape;
	PokemonSpeciesSummary evolves_from_species;
	EvolutionChainSummary evolution_chain;
	PokemonHabitatSummary habitat;
	GenerationSummary generation;
	std::list <PokemonSpeciesName>names;
	std::list <PokemonSpeciesPalParkEncounter>pal_park_encounters;
	std::list <PokemonSpeciesDescription>form_descriptions;
	std::list <PokemonSpeciesFlavorText>flavor_text_entries;
	std::list <PokemonSpeciesGenus>genera;
	std::list <PokemonSpeciesVariety>varieties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonSpeciesDetail_H_ */
