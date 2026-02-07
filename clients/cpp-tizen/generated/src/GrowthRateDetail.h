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
	std::string getFormula();

	/*! \brief Set 
	 */
	void setFormula(std::string  formula);
	/*! \brief Get 
	 */
	std::list<GrowthRateDescription> getDescriptions();

	/*! \brief Set 
	 */
	void setDescriptions(std::list <GrowthRateDescription> descriptions);
	/*! \brief Get 
	 */
	std::list<Experience> getLevels();

	/*! \brief Set 
	 */
	void setLevels(std::list <Experience> levels);
	/*! \brief Get 
	 */
	std::list<PokemonSpeciesSummary> getPokemonSpecies();

	/*! \brief Set 
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
