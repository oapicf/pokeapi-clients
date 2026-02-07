/*
 * AbilityDetail.h
 *
 * 
 */

#ifndef _AbilityDetail_H_
#define _AbilityDetail_H_


#include <string>
#include "AbilityChange.h"
#include "AbilityDetail_pokemon_inner.h"
#include "AbilityEffectText.h"
#include "AbilityFlavorText.h"
#include "AbilityName.h"
#include "GenerationSummary.h"
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

class AbilityDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	AbilityDetail();
	AbilityDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AbilityDetail();

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
	bool getIsMainSeries();

	/*! \brief Set 
	 */
	void setIsMainSeries(bool  is_main_series);
	/*! \brief Get 
	 */
	GenerationSummary getGeneration();

	/*! \brief Set 
	 */
	void setGeneration(GenerationSummary  generation);
	/*! \brief Get 
	 */
	std::list<AbilityName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <AbilityName> names);
	/*! \brief Get 
	 */
	std::list<AbilityEffectText> getEffectEntries();

	/*! \brief Set 
	 */
	void setEffectEntries(std::list <AbilityEffectText> effect_entries);
	/*! \brief Get 
	 */
	std::list<AbilityChange> getEffectChanges();

	/*! \brief Set 
	 */
	void setEffectChanges(std::list <AbilityChange> effect_changes);
	/*! \brief Get 
	 */
	std::list<AbilityFlavorText> getFlavorTextEntries();

	/*! \brief Set 
	 */
	void setFlavorTextEntries(std::list <AbilityFlavorText> flavor_text_entries);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner> getPokemon();

	/*! \brief Set 
	 */
	void setPokemon(std::list <AbilityDetail_pokemon_inner> pokemon);

private:
	int id;
	std::string name;
	bool is_main_series;
	GenerationSummary generation;
	std::list <AbilityName>names;
	std::list <AbilityEffectText>effect_entries;
	std::list <AbilityChange>effect_changes;
	std::list <AbilityFlavorText>flavor_text_entries;
	std::list <AbilityDetail_pokemon_inner>pokemon;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AbilityDetail_H_ */
