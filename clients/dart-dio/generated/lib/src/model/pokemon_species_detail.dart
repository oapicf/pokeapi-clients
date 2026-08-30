//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/evolution_chain_summary.dart';
import 'package:openapi/src/model/pokemon_dex_entry.dart';
import 'package:openapi/src/model/pokemon_color_summary.dart';
import 'package:openapi/src/model/pokemon_species_description.dart';
import 'package:openapi/src/model/pokemon_species_detail_varieties_inner.dart';
import 'package:openapi/src/model/pokemon_species_detail_genera_inner.dart';
import 'package:openapi/src/model/generation_summary.dart';
import 'package:openapi/src/model/pokemon_form_detail_form_names_inner.dart';
import 'package:openapi/src/model/pokemon_shape_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:openapi/src/model/growth_rate_summary.dart';
import 'package:openapi/src/model/pokemon_species_detail_pal_park_encounters_inner.dart';
import 'package:openapi/src/model/pokemon_species_summary.dart';
import 'package:openapi/src/model/pokemon_habitat_summary.dart';
import 'package:openapi/src/model/pokemon_species_flavor_text.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_species_detail.g.dart';

/// PokemonSpeciesDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [order] 
/// * [genderRate] 
/// * [captureRate] 
/// * [baseHappiness] 
/// * [isBaby] 
/// * [isLegendary] 
/// * [isMythical] 
/// * [hatchCounter] 
/// * [hasGenderDifferences] 
/// * [formsSwitchable] 
/// * [growthRate] 
/// * [pokedexNumbers] 
/// * [eggGroups] 
/// * [color] 
/// * [shape] 
/// * [evolvesFromSpecies] 
/// * [evolutionChain] 
/// * [habitat] 
/// * [generation] 
/// * [names] 
/// * [palParkEncounters] 
/// * [formDescriptions] 
/// * [flavorTextEntries] 
/// * [genera] 
/// * [varieties] 
@BuiltValue()
abstract class PokemonSpeciesDetail implements Built<PokemonSpeciesDetail, PokemonSpeciesDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'order')
  int? get order;

  @BuiltValueField(wireName: r'gender_rate')
  int? get genderRate;

  @BuiltValueField(wireName: r'capture_rate')
  int? get captureRate;

  @BuiltValueField(wireName: r'base_happiness')
  int? get baseHappiness;

  @BuiltValueField(wireName: r'is_baby')
  bool? get isBaby;

  @BuiltValueField(wireName: r'is_legendary')
  bool? get isLegendary;

  @BuiltValueField(wireName: r'is_mythical')
  bool? get isMythical;

  @BuiltValueField(wireName: r'hatch_counter')
  int? get hatchCounter;

  @BuiltValueField(wireName: r'has_gender_differences')
  bool? get hasGenderDifferences;

  @BuiltValueField(wireName: r'forms_switchable')
  bool? get formsSwitchable;

  @BuiltValueField(wireName: r'growth_rate')
  GrowthRateSummary get growthRate;

  @BuiltValueField(wireName: r'pokedex_numbers')
  BuiltList<PokemonDexEntry> get pokedexNumbers;

  @BuiltValueField(wireName: r'egg_groups')
  BuiltList<AbilityDetailPokemonInnerPokemon> get eggGroups;

  @BuiltValueField(wireName: r'color')
  PokemonColorSummary get color;

  @BuiltValueField(wireName: r'shape')
  PokemonShapeSummary get shape;

  @BuiltValueField(wireName: r'evolves_from_species')
  PokemonSpeciesSummary get evolvesFromSpecies;

  @BuiltValueField(wireName: r'evolution_chain')
  EvolutionChainSummary get evolutionChain;

  @BuiltValueField(wireName: r'habitat')
  PokemonHabitatSummary get habitat;

  @BuiltValueField(wireName: r'generation')
  GenerationSummary get generation;

  @BuiltValueField(wireName: r'names')
  BuiltList<PokemonFormDetailFormNamesInner> get names;

  @BuiltValueField(wireName: r'pal_park_encounters')
  BuiltList<PokemonSpeciesDetailPalParkEncountersInner> get palParkEncounters;

  @BuiltValueField(wireName: r'form_descriptions')
  BuiltList<PokemonSpeciesDescription> get formDescriptions;

  @BuiltValueField(wireName: r'flavor_text_entries')
  BuiltList<PokemonSpeciesFlavorText> get flavorTextEntries;

  @BuiltValueField(wireName: r'genera')
  BuiltList<PokemonSpeciesDetailGeneraInner> get genera;

  @BuiltValueField(wireName: r'varieties')
  BuiltList<PokemonSpeciesDetailVarietiesInner> get varieties;

  PokemonSpeciesDetail._();

  factory PokemonSpeciesDetail([void updates(PokemonSpeciesDetailBuilder b)]) = _$PokemonSpeciesDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonSpeciesDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonSpeciesDetail> get serializer => _$PokemonSpeciesDetailSerializer();
}

class _$PokemonSpeciesDetailSerializer implements PrimitiveSerializer<PokemonSpeciesDetail> {
  @override
  final Iterable<Type> types = const [PokemonSpeciesDetail, _$PokemonSpeciesDetail];

  @override
  final String wireName = r'PokemonSpeciesDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonSpeciesDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    if (object.order != null) {
      yield r'order';
      yield serializers.serialize(
        object.order,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.genderRate != null) {
      yield r'gender_rate';
      yield serializers.serialize(
        object.genderRate,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.captureRate != null) {
      yield r'capture_rate';
      yield serializers.serialize(
        object.captureRate,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.baseHappiness != null) {
      yield r'base_happiness';
      yield serializers.serialize(
        object.baseHappiness,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.isBaby != null) {
      yield r'is_baby';
      yield serializers.serialize(
        object.isBaby,
        specifiedType: const FullType(bool),
      );
    }
    if (object.isLegendary != null) {
      yield r'is_legendary';
      yield serializers.serialize(
        object.isLegendary,
        specifiedType: const FullType(bool),
      );
    }
    if (object.isMythical != null) {
      yield r'is_mythical';
      yield serializers.serialize(
        object.isMythical,
        specifiedType: const FullType(bool),
      );
    }
    if (object.hatchCounter != null) {
      yield r'hatch_counter';
      yield serializers.serialize(
        object.hatchCounter,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.hasGenderDifferences != null) {
      yield r'has_gender_differences';
      yield serializers.serialize(
        object.hasGenderDifferences,
        specifiedType: const FullType(bool),
      );
    }
    if (object.formsSwitchable != null) {
      yield r'forms_switchable';
      yield serializers.serialize(
        object.formsSwitchable,
        specifiedType: const FullType(bool),
      );
    }
    yield r'growth_rate';
    yield serializers.serialize(
      object.growthRate,
      specifiedType: const FullType(GrowthRateSummary),
    );
    yield r'pokedex_numbers';
    yield serializers.serialize(
      object.pokedexNumbers,
      specifiedType: const FullType(BuiltList, [FullType(PokemonDexEntry)]),
    );
    yield r'egg_groups';
    yield serializers.serialize(
      object.eggGroups,
      specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
    );
    yield r'color';
    yield serializers.serialize(
      object.color,
      specifiedType: const FullType(PokemonColorSummary),
    );
    yield r'shape';
    yield serializers.serialize(
      object.shape,
      specifiedType: const FullType(PokemonShapeSummary),
    );
    yield r'evolves_from_species';
    yield serializers.serialize(
      object.evolvesFromSpecies,
      specifiedType: const FullType(PokemonSpeciesSummary),
    );
    yield r'evolution_chain';
    yield serializers.serialize(
      object.evolutionChain,
      specifiedType: const FullType(EvolutionChainSummary),
    );
    yield r'habitat';
    yield serializers.serialize(
      object.habitat,
      specifiedType: const FullType(PokemonHabitatSummary),
    );
    yield r'generation';
    yield serializers.serialize(
      object.generation,
      specifiedType: const FullType(GenerationSummary),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(PokemonFormDetailFormNamesInner)]),
    );
    yield r'pal_park_encounters';
    yield serializers.serialize(
      object.palParkEncounters,
      specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesDetailPalParkEncountersInner)]),
    );
    yield r'form_descriptions';
    yield serializers.serialize(
      object.formDescriptions,
      specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesDescription)]),
    );
    yield r'flavor_text_entries';
    yield serializers.serialize(
      object.flavorTextEntries,
      specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesFlavorText)]),
    );
    yield r'genera';
    yield serializers.serialize(
      object.genera,
      specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesDetailGeneraInner)]),
    );
    yield r'varieties';
    yield serializers.serialize(
      object.varieties,
      specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesDetailVarietiesInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonSpeciesDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonSpeciesDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'order':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.order = valueDes;
          break;
        case r'gender_rate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.genderRate = valueDes;
          break;
        case r'capture_rate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.captureRate = valueDes;
          break;
        case r'base_happiness':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.baseHappiness = valueDes;
          break;
        case r'is_baby':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isBaby = valueDes;
          break;
        case r'is_legendary':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isLegendary = valueDes;
          break;
        case r'is_mythical':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isMythical = valueDes;
          break;
        case r'hatch_counter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.hatchCounter = valueDes;
          break;
        case r'has_gender_differences':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.hasGenderDifferences = valueDes;
          break;
        case r'forms_switchable':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.formsSwitchable = valueDes;
          break;
        case r'growth_rate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(GrowthRateSummary),
          ) as GrowthRateSummary;
          result.growthRate.replace(valueDes);
          break;
        case r'pokedex_numbers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonDexEntry)]),
          ) as BuiltList<PokemonDexEntry>;
          result.pokedexNumbers.replace(valueDes);
          break;
        case r'egg_groups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
          ) as BuiltList<AbilityDetailPokemonInnerPokemon>;
          result.eggGroups.replace(valueDes);
          break;
        case r'color':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokemonColorSummary),
          ) as PokemonColorSummary;
          result.color.replace(valueDes);
          break;
        case r'shape':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokemonShapeSummary),
          ) as PokemonShapeSummary;
          result.shape.replace(valueDes);
          break;
        case r'evolves_from_species':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokemonSpeciesSummary),
          ) as PokemonSpeciesSummary;
          result.evolvesFromSpecies.replace(valueDes);
          break;
        case r'evolution_chain':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(EvolutionChainSummary),
          ) as EvolutionChainSummary;
          result.evolutionChain.replace(valueDes);
          break;
        case r'habitat':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokemonHabitatSummary),
          ) as PokemonHabitatSummary;
          result.habitat.replace(valueDes);
          break;
        case r'generation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(GenerationSummary),
          ) as GenerationSummary;
          result.generation.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonFormDetailFormNamesInner)]),
          ) as BuiltList<PokemonFormDetailFormNamesInner>;
          result.names.replace(valueDes);
          break;
        case r'pal_park_encounters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesDetailPalParkEncountersInner)]),
          ) as BuiltList<PokemonSpeciesDetailPalParkEncountersInner>;
          result.palParkEncounters.replace(valueDes);
          break;
        case r'form_descriptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesDescription)]),
          ) as BuiltList<PokemonSpeciesDescription>;
          result.formDescriptions.replace(valueDes);
          break;
        case r'flavor_text_entries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesFlavorText)]),
          ) as BuiltList<PokemonSpeciesFlavorText>;
          result.flavorTextEntries.replace(valueDes);
          break;
        case r'genera':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesDetailGeneraInner)]),
          ) as BuiltList<PokemonSpeciesDetailGeneraInner>;
          result.genera.replace(valueDes);
          break;
        case r'varieties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesDetailVarietiesInner)]),
          ) as BuiltList<PokemonSpeciesDetailVarietiesInner>;
          result.varieties.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonSpeciesDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonSpeciesDetailBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

