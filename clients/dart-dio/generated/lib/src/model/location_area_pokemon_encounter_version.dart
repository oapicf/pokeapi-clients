//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/version_summary.dart';
import 'package:openapi/src/model/location_area_encounter_detail.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'location_area_pokemon_encounter_version.g.dart';

/// LocationAreaPokemonEncounterVersion
///
/// Properties:
/// * [version] - The game version this encounter happens in.
/// * [maxChance] - The total percentage of all encounter potential.
/// * [encounterDetails] - A list of encounters and their specifics.
@BuiltValue()
abstract class LocationAreaPokemonEncounterVersion implements Built<LocationAreaPokemonEncounterVersion, LocationAreaPokemonEncounterVersionBuilder> {
  /// The game version this encounter happens in.
  @BuiltValueField(wireName: r'version')
  VersionSummary get version;

  /// The total percentage of all encounter potential.
  @BuiltValueField(wireName: r'max_chance')
  int get maxChance;

  /// A list of encounters and their specifics.
  @BuiltValueField(wireName: r'encounter_details')
  BuiltList<LocationAreaEncounterDetail> get encounterDetails;

  LocationAreaPokemonEncounterVersion._();

  factory LocationAreaPokemonEncounterVersion([void updates(LocationAreaPokemonEncounterVersionBuilder b)]) = _$LocationAreaPokemonEncounterVersion;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LocationAreaPokemonEncounterVersionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocationAreaPokemonEncounterVersion> get serializer => _$LocationAreaPokemonEncounterVersionSerializer();
}

class _$LocationAreaPokemonEncounterVersionSerializer implements PrimitiveSerializer<LocationAreaPokemonEncounterVersion> {
  @override
  final Iterable<Type> types = const [LocationAreaPokemonEncounterVersion, _$LocationAreaPokemonEncounterVersion];

  @override
  final String wireName = r'LocationAreaPokemonEncounterVersion';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocationAreaPokemonEncounterVersion object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'version';
    yield serializers.serialize(
      object.version,
      specifiedType: const FullType(VersionSummary),
    );
    yield r'max_chance';
    yield serializers.serialize(
      object.maxChance,
      specifiedType: const FullType(int),
    );
    yield r'encounter_details';
    yield serializers.serialize(
      object.encounterDetails,
      specifiedType: const FullType(BuiltList, [FullType(LocationAreaEncounterDetail)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LocationAreaPokemonEncounterVersion object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LocationAreaPokemonEncounterVersionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'version':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VersionSummary),
          ) as VersionSummary;
          result.version.replace(valueDes);
          break;
        case r'max_chance':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.maxChance = valueDes;
          break;
        case r'encounter_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LocationAreaEncounterDetail)]),
          ) as BuiltList<LocationAreaEncounterDetail>;
          result.encounterDetails.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LocationAreaPokemonEncounterVersion deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LocationAreaPokemonEncounterVersionBuilder();
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


