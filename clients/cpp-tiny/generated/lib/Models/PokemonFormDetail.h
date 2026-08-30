
/*
 * PokemonFormDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonFormDetail_H_
#define TINY_CPP_CLIENT_PokemonFormDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PokemonDetail_types_inner.h"
#include "PokemonFormDetail_form_names_inner.h"
#include "PokemonFormDetail_sprites.h"
#include "PokemonSummary.h"
#include "VersionGroupSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonFormDetail{
public:

    /*! \brief Constructor.
	 */
    PokemonFormDetail();
    PokemonFormDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonFormDetail();


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
	int getOrder();

	/*! \brief Set 
	 */
	void setOrder(int order);
	/*! \brief Get 
	 */
	int getFormOrder();

	/*! \brief Set 
	 */
	void setFormOrder(int form_order);
	/*! \brief Get 
	 */
	bool isIsDefault();

	/*! \brief Set 
	 */
	void setIsDefault(bool is_default);
	/*! \brief Get 
	 */
	bool isIsBattleOnly();

	/*! \brief Set 
	 */
	void setIsBattleOnly(bool is_battle_only);
	/*! \brief Get 
	 */
	bool isIsMega();

	/*! \brief Set 
	 */
	void setIsMega(bool is_mega);
	/*! \brief Get 
	 */
	std::string getFormName();

	/*! \brief Set 
	 */
	void setFormName(std::string form_name);
	/*! \brief Get 
	 */
	PokemonSummary getPokemon();

	/*! \brief Set 
	 */
	void setPokemon(PokemonSummary pokemon);
	/*! \brief Get 
	 */
	PokemonFormDetail_sprites&lt;std::string, std::string&gt; getSprites();

	/*! \brief Set 
	 */
	void setSprites(PokemonFormDetail_sprites&lt;std::string, std::string&gt; sprites);
	/*! \brief Get 
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set 
	 */
	void setVersionGroup(VersionGroupSummary version_group);
	/*! \brief Get 
	 */
	std::list<PokemonFormDetail_form_names_inner> getFormNames();

	/*! \brief Set 
	 */
	void setFormNames(std::list<PokemonFormDetail_form_names_inner> form_names);
	/*! \brief Get 
	 */
	std::list<PokemonFormDetail_form_names_inner> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list<PokemonFormDetail_form_names_inner> names);
	/*! \brief Get 
	 */
	std::list<PokemonDetail_types_inner> getTypes();

	/*! \brief Set 
	 */
	void setTypes(std::list<PokemonDetail_types_inner> types);


    private:
    int id{};
    std::string name{};
    int order{};
    int form_order{};
    bool is_default{};
    bool is_battle_only{};
    bool is_mega{};
    std::string form_name{};
    PokemonSummary pokemon;
    PokemonFormDetail_sprites&lt;std::string, std::string&gt; sprites;
    VersionGroupSummary version_group;
    std::list<PokemonFormDetail_form_names_inner> form_names;
    std::list<PokemonFormDetail_form_names_inner> names;
    std::list<PokemonDetail_types_inner> types;
};
}

#endif /* TINY_CPP_CLIENT_PokemonFormDetail_H_ */
