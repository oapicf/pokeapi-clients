/*
 * GrowthRateDetail.h
 *
 * 
 */

#ifndef _GrowthRateDetail_H_
#define _GrowthRateDetail_H_


#include <string>
#include "Experience.h"
#include "GrowthRateDescription.h"
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

class GrowthRateDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	GrowthRateDetail();
	GrowthRateDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GrowthRateDetail();

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
	/*! \brief Get The formula used to calculate the rate at which the Pokémon species gains level.
	 */
	std::string getFormula();

	/*! \brief Set The formula used to calculate the rate at which the Pokémon species gains level.
	 */
	void setFormula(std::string  formula);
	/*! \brief Get The descriptions of this characteristic listed in different languages.
	 */
	std::list<GrowthRateDescription> getDescriptions();

	/*! \brief Set The descriptions of this characteristic listed in different languages.
	 */
	void setDescriptions(std::list <GrowthRateDescription> descriptions);
	/*! \brief Get A list of levels and the amount of experienced needed to atain them based on this growth rate.
	 */
	std::list<Experience> getLevels();

	/*! \brief Set A list of levels and the amount of experienced needed to atain them based on this growth rate.
	 */
	void setLevels(std::list <Experience> levels);
	/*! \brief Get A list of Pokémon species that gain levels at this growth rate.
	 */
	std::list<PokemonSpeciesSummary> getPokemonSpecies();

	/*! \brief Set A list of Pokémon species that gain levels at this growth rate.
	 */
	void setPokemonSpecies(std::list <PokemonSpeciesSummary> pokemon_species);

private:
	int id;
	std::string name;
	std::string formula;
	std::list <GrowthRateDescription>descriptions;
	std::list <Experience>levels;
	std::list <PokemonSpeciesSummary>pokemon_species;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GrowthRateDetail_H_ */
