//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pokemon_species_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pal_park_encounter.g.dart';

/// PalParkEncounter
///
/// Properties:
/// * [baseScore] - The base score given to the player when this Pokémon is caught during a pal park run.
/// * [rate] - The base rate for encountering this Pokémon in this pal park area.
/// * [pokemonSpecies] - The Pokémon species being encountered.
@BuiltValue()
abstract class PalParkEncounter implements Built<PalParkEncounter, PalParkEncounterBuilder> {
  /// The base score given to the player when this Pokémon is caught during a pal park run.
  @BuiltValueField(wireName: r'base_score')
  int? get baseScore;

  /// The base rate for encountering this Pokémon in this pal park area.
  @BuiltValueField(wireName: r'rate')
  int get rate;

  /// The Pokémon species being encountered.
  @BuiltValueField(wireName: r'pokemon_species')
  PokemonSpeciesSummary get pokemonSpecies;

  PalParkEncounter._();

  factory PalParkEncounter([void updates(PalParkEncounterBuilder b)]) = _$PalParkEncounter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PalParkEncounterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PalParkEncounter> get serializer => _$PalParkEncounterSerializer();
}

class _$PalParkEncounterSerializer implements PrimitiveSerializer<PalParkEncounter> {
  @override
  final Iterable<Type> types = const [PalParkEncounter, _$PalParkEncounter];

  @override
  final String wireName = r'PalParkEncounter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PalParkEncounter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.baseScore != null) {
      yield r'base_score';
      yield serializers.serialize(
        object.baseScore,
        specifiedType: const FullType.nullable(int),
      );
    }
    yield r'rate';
    yield serializers.serialize(
      object.rate,
      specifiedType: const FullType(int),
    );
    yield r'pokemon_species';
    yield serializers.serialize(
      object.pokemonSpecies,
      specifiedType: const FullType(PokemonSpeciesSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PalParkEncounter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PalParkEncounterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'base_score':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.baseScore = valueDes;
          break;
        case r'rate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.rate = valueDes;
          break;
        case r'pokemon_species':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokemonSpeciesSummary),
          ) as PokemonSpeciesSummary;
          result.pokemonSpecies.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PalParkEncounter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PalParkEncounterBuilder();
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


