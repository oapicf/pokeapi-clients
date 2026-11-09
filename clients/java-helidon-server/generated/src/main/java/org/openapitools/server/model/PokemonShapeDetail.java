package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.PokemonShapeAwesomeName;
import org.openapitools.server.model.PokemonShapeName;
import org.openapitools.server.model.PokemonSpeciesSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonShapeDetail   {

    private Integer id;
    private String name;
    private List<@Valid PokemonShapeAwesomeName> awesomeNames = new ArrayList<>();
    private List<@Valid PokemonShapeName> names = new ArrayList<>();
    private List<@Valid PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PokemonShapeDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonShapeDetail.
     *
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param awesomeNames The \&quot;scientific\&quot; name of this Pokémon shape listed in different languages.
     * @param names The name of this resource listed in different languages.
     * @param pokemonSpecies A list of the Pokémon species that have this shape.
     */
    public PokemonShapeDetail(
        Integer id, 
        String name, 
        List<@Valid PokemonShapeAwesomeName> awesomeNames, 
        List<@Valid PokemonShapeName> names, 
        List<@Valid PokemonSpeciesSummary> pokemonSpecies
    ) {
        this.id = id;
        this.name = name;
        this.awesomeNames = awesomeNames;
        this.names = names;
        this.pokemonSpecies = pokemonSpecies;
    }



    /**
     * The identifier for this resource.
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The name for this resource.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The \"scientific\" name of this Pokémon shape listed in different languages.
     * @return awesomeNames
     */
    public List<@Valid PokemonShapeAwesomeName> getAwesomeNames() {
        return awesomeNames;
    }

    public void setAwesomeNames(List<@Valid PokemonShapeAwesomeName> awesomeNames) {
        this.awesomeNames = awesomeNames;
    }

    /**
     * The name of this resource listed in different languages.
     * @return names
     */
    public List<@Valid PokemonShapeName> getNames() {
        return names;
    }

    public void setNames(List<@Valid PokemonShapeName> names) {
        this.names = names;
    }

    /**
     * A list of the Pokémon species that have this shape.
     * @return pokemonSpecies
     */
    public List<@Valid PokemonSpeciesSummary> getPokemonSpecies() {
        return pokemonSpecies;
    }

    public void setPokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonShapeDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    awesomeNames: ").append(toIndentedString(awesomeNames)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

