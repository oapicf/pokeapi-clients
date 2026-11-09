//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pokemon_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/location_area_pokemon_encounter_version.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'location_area_pokemon_encounter.g.dart';

/// LocationAreaPokemonEncounter
///
/// Properties:
/// * [pokemon] - The Pokémon being encountered.
/// * [versionDetails] - A list of versions and encounters with Pokémon that might happen in the referenced location area.
@BuiltValue()
abstract class LocationAreaPokemonEncounter implements Built<LocationAreaPokemonEncounter, LocationAreaPokemonEncounterBuilder> {
  /// The Pokémon being encountered.
  @BuiltValueField(wireName: r'pokemon')
  PokemonSummary get pokemon;

  /// A list of versions and encounters with Pokémon that might happen in the referenced location area.
  @BuiltValueField(wireName: r'version_details')
  BuiltList<LocationAreaPokemonEncounterVersion> get versionDetails;

  LocationAreaPokemonEncounter._();

  factory LocationAreaPokemonEncounter([void updates(LocationAreaPokemonEncounterBuilder b)]) = _$LocationAreaPokemonEncounter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LocationAreaPokemonEncounterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocationAreaPokemonEncounter> get serializer => _$LocationAreaPokemonEncounterSerializer();
}

class _$LocationAreaPokemonEncounterSerializer implements PrimitiveSerializer<LocationAreaPokemonEncounter> {
  @override
  final Iterable<Type> types = const [LocationAreaPokemonEncounter, _$LocationAreaPokemonEncounter];

  @override
  final String wireName = r'LocationAreaPokemonEncounter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocationAreaPokemonEncounter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'pokemon';
    yield serializers.serialize(
      object.pokemon,
      specifiedType: const FullType(PokemonSummary),
    );
    yield r'version_details';
    yield serializers.serialize(
      object.versionDetails,
      specifiedType: const FullType(BuiltList, [FullType(LocationAreaPokemonEncounterVersion)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LocationAreaPokemonEncounter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LocationAreaPokemonEncounterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pokemon':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokemonSummary),
          ) as PokemonSummary;
          result.pokemon.replace(valueDes);
          break;
        case r'version_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LocationAreaPokemonEncounterVersion)]),
          ) as BuiltList<LocationAreaPokemonEncounterVersion>;
          result.versionDetails.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LocationAreaPokemonEncounter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LocationAreaPokemonEncounterBuilder();
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


