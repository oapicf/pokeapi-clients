
/*
 * CharacteristicDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CharacteristicDetail_H_
#define TINY_CPP_CLIENT_CharacteristicDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CharacteristicDescription.h"
#include "StatSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CharacteristicDetail{
public:

    /*! \brief Constructor.
	 */
    CharacteristicDetail();
    CharacteristicDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CharacteristicDetail();


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
	/*! \brief Get The remainder of the highest stat/IV divided by 5.
	 */
	int getGeneModulo();

	/*! \brief Set The remainder of the highest stat/IV divided by 5.
	 */
	void setGeneModulo(int gene_modulo);
	/*! \brief Get The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.
	 */
	std::list<int> getPossibleValues();

	/*! \brief Set The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.
	 */
	void setPossibleValues(std::list<int> possible_values);
	/*! \brief Get The stat which results in this characteristic.
	 */
	StatSummary getHighestStat();

	/*! \brief Set The stat which results in this characteristic.
	 */
	void setHighestStat(StatSummary highest_stat);
	/*! \brief Get The descriptions of this characteristic listed in different languages.
	 */
	std::list<CharacteristicDescription> getDescriptions();

	/*! \brief Set The descriptions of this characteristic listed in different languages.
	 */
	void setDescriptions(std::list<CharacteristicDescription> descriptions);


    private:
    int id{};
    int gene_modulo{};
    std::list<int> possible_values;
    StatSummary highest_stat;
    std::list<CharacteristicDescription> descriptions;
};
}

#endif /* TINY_CPP_CLIENT_CharacteristicDetail_H_ */
